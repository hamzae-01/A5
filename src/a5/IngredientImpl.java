package a5;

public class IngredientImpl implements Ingredient {

	String _name;
	double _caloriesPerD;
	int _caloriesPerOunce;
	double _pricePerOunce;
	boolean isVegetarian;
	boolean isRice;
	boolean isShellFish;

	@Override
	public String getName() {

		return _name;
	}

	@Override
	public double getCaloriesPerDollar() {
// TODO Auto-generated method stub
		return _caloriesPerD;
	}

	@Override
	public int getCaloriesPerOunce() {
// TODO Auto-generated method stub
		return _caloriesPerOunce;
	}

	@Override
	public double getPricePerOunce() {
// TODO Auto-generated method stub
		return _pricePerOunce;
	}

	@Override
	public boolean getIsVegetarian() {
// TODO Auto-generated method stub
		return isVegetarian;
	}

	@Override
	public boolean getIsRice() {
// TODO Auto-generated method stub
		return isRice;
	}

	@Override
	public boolean getIsShellfish() {
// TODO Auto-generated method stub
		return isShellFish;
	}

	@Override
	public boolean equals(Ingredient other) {
//If other is null, returns false.
		if (other == null) {
			return false;
		} else {

			if (other.getName().equals(this.getName()) && other.getCaloriesPerOunce() == (this.getCaloriesPerOunce())
					&& Math.abs(getPricePerOunce() - this._pricePerOunce) <= 0.01
					&& other.getIsVegetarian() == (this.getIsVegetarian()) && other.getIsRice() == (this.getIsRice())
					&& other.getIsShellfish() == (this.getIsShellfish())) {

				return true;
			} else {
				return false;
			}

		}
	}

}