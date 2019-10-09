package a5;

import java.util.HashMap;

public class Roll implements Sushi {

	private String name;
	//private IngredientPortion[] roll_ingreds;
	private HashMap<String, IngredientPortion> roll_ingreds;

	public Roll(String name, IngredientPortion[] roll_ingredients) {
		if (name == null) {
			throw new RuntimeException("Roll name is null");
		}
		
		
		
		/*for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i].equals(new Avocado())) {
				roll_ingredients[i].combine();
			}
		}*/
		this.name = name;
		if (roll_ingredients == null) {
			throw new RuntimeException("Roll ingredients is null");
		}
		for (int i = 0; i < roll_ingredients.length; i++) {
			if (roll_ingredients[i] == null) {
				throw new RuntimeException("At least one roll ingredient is null");
			}
		}
		for (int i = 0; i < roll_ingredients.length; i++) {

			String ingred_name = roll_ingredients[i].getName();
			
			if (roll_ingreds.containsKey(ingred_name)) {
				IngredientPortion ingredient = roll_ingreds.get(ingred_name);
				double current = ingredient.getAmount(); 
				double new1 = current + roll_ingredients[i].getAmount();
				ingredient.setAmount(new1);
				// TODO update ingredient amount
			}else {
				// TODO store ingredient in hashmap with right key
				roll_ingreds.put(ingred_name, roll_ingredients[i]);
			}
		}
//		this.roll_ingredients = roll_ingredients.clone();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		int i = 0;
		IngredientPortion[] ingredients = new IngredientPortion[roll_ingreds.size()];
		
		for (String name : roll_ingreds.keySet()) {
			ingredients[i] = roll_ingreds.get(name);
			i++;
		}
		
		return ingredients;
	}

	@Override
	public int getCalories() {
		
		double calorie_sum = 0.0;
		
		for (String name : roll_ingreds.keySet()) {
			IngredientPortion ingred = roll_ingreds.get(name);
			calorie_sum += ingred.getCalories();
		}
		

//		for (int i = 0; i < roll_ingreds.length; i++) {
//			calorie_sum += roll_ingreds[i].getCalories();
//		}
//
		return (int) (calorie_sum + 0.5);
	}

	@Override
	public double getCost() {
		double cost_sum = 0.0;
		
		for (String name : roll_ingreds.keySet()) {
			IngredientPortion ingred = roll_ingreds.get(name);
			cost_sum += ingred.getCost();
		}

		return ((int) (cost_sum * 100.0 + 0.5)) / 100.0;
	}

	@Override
	public boolean getHasRice() {
		for (String name : roll_ingreds.keySet()) {
			IngredientPortion ingred = roll_ingreds.get(name);
			if (ingred.getIsRice()){
				return true;
			}
		}
		return false;
		
	}

	@Override
	public boolean getHasShellfish() {
		for (String name : roll_ingreds.keySet()) {
			IngredientPortion ingred = roll_ingreds.get(name);
			if (ingred.getIsShellfish()){
				return true;
			}
		}
		return false;
		
	}

	@Override
	public boolean getIsVegetarian() {
		for (String name : roll_ingreds.keySet()) {
			IngredientPortion ingred = roll_ingreds.get(name);
			if (ingred.getIsVegetarian()){
				return true;
			}
		}
		return false;
		
	}

}
