package a5;

public class Yellowtail extends IngredientImpl {

	public Yellowtail() {
		//
		_name = "yellowtail";
		_caloriesPerOunce = 57;
		_pricePerOunce = .74;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = false;
		isRice = false;
		isShellFish = false;
	}
}
