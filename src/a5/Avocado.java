package a5;

public class Avocado extends IngredientImpl {

	public Avocado() {
		
		_name = "avocado";
		_caloriesPerOunce = 42;
		_pricePerOunce = .24;
		_caloriesPerD = (_caloriesPerOunce)/(_pricePerOunce);
		isVegetarian = true;
		isRice = false;
		isShellFish = false;
	}
}
