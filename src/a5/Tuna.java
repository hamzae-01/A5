package a5;

public class Tuna extends IngredientImpl {

	public Tuna() {
		
		_name = "tuna";
		_caloriesPerOunce = 42;
		_pricePerOunce = 1.67;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = false;
		isRice = false;
		isShellFish = false;
	}
}
