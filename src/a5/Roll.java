package a5;

public class Roll implements Sushi {

	String name;
	double seaweedAmount = 0.0;

	private IngredientPortion[] _roll_ingredients;
	private IngredientPortion[] final_ingredients;

	public Roll(String name, IngredientPortion[] roll_ingredients) {

		if (name == null) {

			throw new RuntimeException("Roll name is null");

		}

		if (roll_ingredients == null) {

			throw new RuntimeException("Roll ingredients is null");

		}

		for (int i = 0; i < roll_ingredients.length; i++) {

			if (roll_ingredients[i] == null) {

				throw new RuntimeException("At least one roll ingredient is null");

			}

		}
		
		this.name = name;

		double avocadoAmount = 0;
		double crabAmount = 0;
		double eelAmount = 0;
		double riceAmount = 0;
		double yellowtailAmount = 0;
		double shrimpAmount = 0;
		double tunaAmount = 0;

		for (int i = 0; i < roll_ingredients.length; i++) {
			if ((roll_ingredients[i].getName().equals(new Avocado().getName()))) {
				avocadoAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Tuna().getName()))) {
				tunaAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Seaweed().getName()))) {
				seaweedAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Rice().getName()))) {
				riceAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Yellowtail().getName()))) {
				yellowtailAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Eel().getName()))) {
				eelAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Crab().getName()))) {
				crabAmount += roll_ingredients[i].getAmount();
			}

			if ((roll_ingredients[i].getName().equals(new Shrimp().getName()))) {
				shrimpAmount += roll_ingredients[i].getAmount();
			}
		}

		IngredientPortion[] final_ingredients = new IngredientPortion[7];

		for (int i = 0; i < 7; i++) {
			if (tunaAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(tunaAmount, new Tuna());
				tunaAmount = -1;
				continue;
			}
			if (avocadoAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(avocadoAmount, new Avocado());
				avocadoAmount = -1;
				continue;
			}
			if (yellowtailAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(yellowtailAmount, new Yellowtail());
				yellowtailAmount = -1;
				continue;
			}
			if (crabAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(crabAmount, new Crab());
				crabAmount = -1;
				continue;
			}
			if (eelAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(eelAmount, new Eel());
				eelAmount = -1;
				continue;
			}
			if (riceAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(riceAmount, new Rice());
				riceAmount = -1;
				continue;
			}
			if (seaweedAmount >= 0) {
				if (seaweedAmount < 0.1) {
					seaweedAmount = 0.1;
					final_ingredients[i] = new IngredientPortionImpl(seaweedAmount, new Seaweed());
					seaweedAmount = -0.5;
				} else {
//System.out.println("I Value:  " + i);
					final_ingredients[i] = new IngredientPortionImpl(seaweedAmount, new Seaweed());
					seaweedAmount = -1;
					continue;
				}
			}
			if (shrimpAmount > 0) {
				final_ingredients[i] = new IngredientPortionImpl(shrimpAmount, new Shrimp());
				shrimpAmount = -1;
				continue;
			}

		}



		for (int i = 0; i < final_ingredients.length; i++) {
			if (final_ingredients[i] == null) {
				continue;
			}
			System.out.println("Name: " + String.valueOf((final_ingredients[i].getName())));
			System.out.println("Amount : " + String.valueOf((final_ingredients[i].getAmount())));

		}

		this._roll_ingredients = roll_ingredients.clone();
		this.final_ingredients = final_ingredients.clone();

	}

	@Override
	public String getName() {

		return name;

	}

	@Override

	public IngredientPortion[] getIngredients() {

		boolean wasJedi = false;
		int len = 0;

		for (int i = 0; i < _roll_ingredients.length; i++) {
			if (_roll_ingredients[i] == null) {
				continue;
			}

			if (_roll_ingredients[i] != null) {
				len++;
			}

		}

		if (seaweedAmount == -0.5) {
			wasJedi = true;
			len++;

		}

		if (wasJedi == true) {
			IngredientPortion[] outputArray = new IngredientPortion[len];

			for (int i = 0; i < len; i++) {
				outputArray[i] = final_ingredients[i];
			}

			return outputArray;
		} else {
			return _roll_ingredients.clone();
		}

	}

	@Override
	public int getCalories() {

		double calorie_sum = 0.0;

		for (int i = 0; i < final_ingredients.length; i++) {
			if (final_ingredients[i] == null) {
				continue;
			}

			calorie_sum += final_ingredients[i].getCalories();

		}

		return (int) (calorie_sum + 0.5);

	}

	@Override

	public double getCost() {

		double cost_sum = 0.0;

		for (int i = 0; i < final_ingredients.length; i++) {

			if (final_ingredients[i] == null) {
				continue;
			}

			System.out.println("Name of thing: " + final_ingredients[i].getName());
			System.out.println("Cost: " + final_ingredients[i].getCost());
			cost_sum += final_ingredients[i].getCost();

		}

		return ((int) (cost_sum * 100.0 + 0.5)) / 100.0;

	}

	@Override

	public boolean getHasRice() {

		for (int i = 0; i < _roll_ingredients.length; i++) {

			if (_roll_ingredients[i] == null) {
				continue;
			}

			if (_roll_ingredients[i].getIsRice()) {

				return true;

			}

		}

		return false;

	}

	@Override

	public boolean getHasShellfish() {

		for (int i = 0; i < _roll_ingredients.length; i++) {

			if (_roll_ingredients[i] == null) {
				continue;
			}

			if (_roll_ingredients[i].getIsShellfish()) {

				return true;

			}

		}

		return false;

	}

	@Override

	public boolean getIsVegetarian() {

		for (int i = 0; i < _roll_ingredients.length; i++) {

			if (_roll_ingredients[i] == null) {
				continue;
			}

			if (!_roll_ingredients[i].getIsVegetarian()) {

				return false;

			}

		}

		return true;

	}

}