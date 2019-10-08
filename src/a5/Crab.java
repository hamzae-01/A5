package a5;

public class Crab extends IngredientImpl {

	public Crab() {
		
		_name = "crab";
		_caloriesPerOunce = 37;
		_pricePerOunce = .72;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = false;
		isRice = false;
		isShellFish = true;
	}
}
