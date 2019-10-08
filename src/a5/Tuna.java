package a5;

public class Tuna extends IngredientImpl {

	public Tuna() {
		
		_name = "tuna";
		_caloriesPerOunce = 42;
		_pricePerOunce = .24;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = false;
		isRice = false;
		isShellFish = false;
	}
}
