package a5;

public class Rice extends IngredientImpl {

	public Rice() {
		
		_name = "rice";
		_caloriesPerOunce = 34;
		_pricePerOunce = .13;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = true;
		isRice = true;
		isShellFish = false;
	}
}
