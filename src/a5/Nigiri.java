package a5;

public class Nigiri implements Sushi {

	public static enum NigiriType {
		TUNA, YELLOWTAIL, EEL, CRAB, SHRIMP
	};

	private NigiriType nigiritype;

	private IngredientPortion[] ingredientportion = new IngredientPortion[2];

	public Nigiri(NigiriType type) {

		this.nigiritype = type;

		Ingredient ing;
		if (type == NigiriType.TUNA) {
			ingredientportion[0] = new TunaPortion(.75);
		}

		else if (type == NigiriType.CRAB) {

			ingredientportion[0] = new CrabPortion(.75);

		} else if (type == NigiriType.EEL) {

			ingredientportion[0] = new EelPortion(.75);

		} else if (type == NigiriType.YELLOWTAIL) {

			ingredientportion[0] = new YellowtailPortion(.75);

		} else if (type == NigiriType.SHRIMP) {

			ingredientportion[0] = new ShrimpPortion(.75);

		}
	}


	public String getName() {
		String nigirimeat = "";
		if (nigiritype == NigiriType.TUNA) {
			nigirimeat = "tuna nigiri";
		} else if (nigiritype == NigiriType.YELLOWTAIL) {

			nigirimeat = "salmon nigiri";
		} else if (nigiritype == NigiriType.EEL) {

			nigirimeat = "eel nigiri";

		} else if (nigiritype == NigiriType.CRAB) {

			nigirimeat = "crab nigiri";

		} else if (nigiritype == NigiriType.SHRIMP) {

			nigirimeat = "shrimp nigiri";
		}

		return nigirimeat;
	}


	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		
		return ingredientportion.clone();
	}


	public int getCalories() {
		// TODO Auto-generated method stub
		return ((int)((ingredientportion[0].getCalories() + ingredientportion[1].getCalories()) + 0.5 ));
	}

	public double getCost() {
		// TODO Auto-generated method stub
	
		return ((int) (((ingredientportion[0].getCost() + ingredientportion[1].getCost())* 100.0) +0.5)) / 100.0;

	}


	public boolean getHasRice() {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		if( ingredientportion[0].getIsShellfish() || ingredientportion[1].getIsShellfish()) {
			
			return true;
		}
		return false;
	}


	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
	
		if( ingredientportion[0].getIsVegetarian() ||ingredientportion[1].getIsVegetarian()) {
	
			return true;
		}
		
		return false;
	}
}

