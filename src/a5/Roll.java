package a5;

public class Roll implements Sushi{

	
	private String name;
	private IngredientPortion[] roll_ingredients;

	public Roll(String name, IngredientPortion[] roll_ingredients) {
		for(int i=0; i < roll_ingredients.length; i++) {
			if(roll_ingredients[i] == null) {
				throw new RuntimeException("Null ingredient entry");
			}
		}
		if(name == null || roll_ingredients == null) {
			throw new RuntimeException("Null entry");
		}
		this.name = name;
		this.roll_ingredients = roll_ingredients.clone(); 
		
	}

	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		return roll_ingredients.clone();
	}

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		double cal_count =0; 
		for(int i =0; i < roll_ingredients.length; i++) {
			cal_count+= roll_ingredients[i].getCalories();
		}
		return ((int)(cal_count + 0.5));
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		double cost_count= 0; 
		for(int i=0; i < roll_ingredients.length; i++) {
			cost_count+= roll_ingredients[i].getCost();
		}
		
		return ((int) ((cost_count * 100.0)+0.5))/100.0 ;
	}

	@Override
	public boolean getHasRice() {
		// TODO Auto-generated method stub
		for(int i =0; i< roll_ingredients.length; i++) {
			if(roll_ingredients[i].getIsRice()) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
		for( int i=0; i<roll_ingredients.length; i++) {
			if(roll_ingredients[i].getIsShellfish()) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		for(int i =0; i< roll_ingredients.length; i++) {
			if(!roll_ingredients[i].getIsVegetarian()) {
				return false; 
			}
		}
	
		
		return true;
	}

}