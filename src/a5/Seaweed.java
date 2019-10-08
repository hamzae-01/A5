package a5;

public class Seaweed extends IngredientImpl {

	public Seaweed() {
		
		_name = "seaweed";
		_caloriesPerOunce = 105;
		_pricePerOunce = 2.85;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = true;
		isRice = false;
		isShellFish = false;
	}
}
