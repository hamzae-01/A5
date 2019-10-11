package a5;

import java.util.HashMap;

public class Roll implements Sushi {

	private String _name;
	private IngredientPortion[] _ingredients;

	public Roll(String name, IngredientPortion[] roll_ingredients) {
		validate(name);
		validate(roll_ingredients);
		HashMap<String, IngredientPortion> ingredientList = new HashMap<>();
		for (IngredientPortion i : roll_ingredients) {
			validate(i);
			if (ingredientList.containsKey(i.getName())) {
				ingredientList.replace(i.getName(), i.combine(ingredientList.get(i.getName())));
			} else {
				ingredientList.put(i.getName(), i);
			}
		}
		if (!ingredientList.containsKey("seaweed") || ingredientList.get("seaweed").getAmount() < .1) {
			ingredientList.put("seaweed", new SeaweedPortion(.1));
		}
		_ingredients = new IngredientPortion[ingredientList.size()];
		ingredientList.values().toArray(_ingredients);
		_name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return _ingredients;
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		float sum = 0;
		for (IngredientPortion i : _ingredients) {
			sum += i.getCalories();
		}
		return Math.round(sum);
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		double sum = 0;
		for (IngredientPortion i : _ingredients) {
			sum += i.getCalories();
		}
		int rounded = (int) Math.round(sum * 100);
		double cost = (double) rounded / 100.0;
		return cost;
	}

	@Override

	public boolean getHasRice() {

		for (IngredientPortion i : _ingredients) {
			if (i.getIsRice()) {
				return true;
			}
		}

		return false;

	}

	@Override

	public boolean getHasShellfish() {

		for (IngredientPortion i : _ingredients) {
			if (i.getIsShellfish()) {
				return true;
			}
		}

		return false;

	}

	@Override

	public boolean getIsVegetarian() {

		for (IngredientPortion i : _ingredients) {
			if (i.getIsVegetarian()) {
				return true;
			}
		}

		return false;

	}

	private void validate(Object o) {
		if (o == null) {
			throw new IllegalArgumentException();

		}
	}
}