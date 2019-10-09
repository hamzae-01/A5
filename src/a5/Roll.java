package a5;

public class Roll implements Sushi {

	private String name;
	private IngredientPortion[] ingredients;

	public Roll(String name, IngredientPortion[] ingredients) {
		
		//IngredientPortion[] 
		for (int i = 0; i < ingredients.length; i++) {
			
			//for (int j = 0; j < ingredients.length; i++) {

			//	if (ingredients[i] == null) {

			//		throw new RuntimeException("Please add an ingredient");
			//	}

			//
		}

		if (name == null || ingredients == null) {

			throw new RuntimeException("Please add an ingredient");
		}

		this.name = name;
		this.ingredients = ingredients.clone();

	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return ingredients.clone();

	}

	public int getCalories() {
		// TODO Auto-generated method stub
		double CaloriesPerOunce = 0;
		for (int i = 0; i < ingredients.length; i++) {
			CaloriesPerOunce += ingredients[i].getCalories();
		}

		return ((int) (CaloriesPerOunce + 0.5));

	}

	public double getCost() {
		// TODO Auto-generated method stub
		double PricePerOunce = 0;
		for (int i = 0; i < ingredients.length; i++) {
			PricePerOunce += ingredients[i].getCost();
		}

		return ((int) ((PricePerOunce * 100.0) + 0.5)) / 100.0;
	}

	public boolean getHasRice() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ingredients.length; i++) {

			if (ingredients[i].getIsRice()) {
				return true;
			}
		}

		return false;
	}

	public boolean getHasShellfish() {
		// TODO Auto-generated method stub

		for (int i = 0; i < ingredients.length; i++) {

			if (ingredients[i].getIsShellfish()) {

				return true;
			}
		}
		return false;
	}

	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ingredients.length; i++) {

			if (!ingredients[i].getIsVegetarian()) {

				return false;
			}
		}

		return true;
	}
//
}