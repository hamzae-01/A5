package a5;

public class IngredientPortionImpl implements IngredientPortion {
	
	Ingredient _ingredient;
	double _amount;
	Double _cals;
	double _cost;
	
	public IngredientPortionImpl(double amount, Ingredient ingredient) {

		if (amount <= 0) {
		throw new IllegalArgumentException("0 or less not allowed");
		}

		_ingredient = ingredient;
		_amount = amount;
		_cals = (amount * _ingredient.getCaloriesPerOunce());
		_cost = amount * _ingredient.getPricePerOunce();
	}

	@Override
	public Ingredient getIngredient() {
		// TODO Auto-generated method stub
		return _ingredient;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return _amount;
	}
	
	public void setAmount(double amount) {
		// TODO Auto-generated method stub
		_amount = amount;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _ingredient.getName();
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return _ingredient.getIsVegetarian();
	}

	@Override
	public boolean getIsRice() {
		// TODO Auto-generated method stub
		return _ingredient.getIsRice();
	}

	@Override
	public boolean getIsShellfish() {
		// TODO Auto-generated method stub
		return _ingredient.getIsShellfish();
	}

	@Override
	public double getCalories() {
		// TODO Auto-generated method stub
		return _cals;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return _cost;
	}

	@Override
	 public IngredientPortion combine(IngredientPortion other) {
		// TODO Auto-generated method stub
	 if (other == null) {
	 return this;
	 }

	 if (other.getName().contentEquals(this.getName()) == false) {
	 throw new IllegalArgumentException("Ing Types not Equal");
	 }


	 if (other.getName().contentEquals(this.getName())) {
	 double tempAmount = other.getAmount() + this.getAmount();
	 return new IngredientPortionImpl(tempAmount, this.getIngredient());

	 } else {
	 return this;
		}

	}
}
