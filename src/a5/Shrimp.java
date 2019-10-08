package a5;

public class Shrimp extends IngredientImpl {

	public Shrimp() {
		
		_name = "shrimp";
		_caloriesPerOunce = 32;
		_pricePerOunce = .65;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = false;
		isRice = false;
		isShellFish = true;
	}
}
