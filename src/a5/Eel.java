package a5;

public class Eel extends IngredientImpl {

	public Eel() {
		
		_name = "eel";
		_caloriesPerOunce = 82;
		_pricePerOunce = 2.15;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = false;
		isRice = false;
		isShellFish = true;
	}
}
