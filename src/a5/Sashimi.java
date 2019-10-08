package a5;

public class Sashimi implements Sushi{
	public enum SashimiType{TUNA , YELLOWTAIL, EEL, CRAB, SHRIMP};
	private SashimiType sashimitype;
	private IngredientPortion ingredientportion;
	
	
	public Sashimi(SashimiType type) {
		this.sashimitype = type;
		
		Ingredient ing;
		if(type == SashimiType.TUNA) {
			ingredientportion = new TunaPortion(.75);
			}
		
		else if  (type == SashimiType.CRAB) {

			ingredientportion = new CrabPortion(.75);
			
			}
		else if (type ==SashimiType.EEL) {
			 
			ingredientportion = new EelPortion(.75);
			
			}
		else if (type == SashimiType.YELLOWTAIL) {

			ingredientportion = new YellowtailPortion(.75);
			
			}
		else if (type == SashimiType.SHRIMP) {


			ingredientportion = new ShrimpPortion(.75);
			
			}
		}
	
	
	@Override
	public String getName() {
		String sashimimeat = "";
		if( sashimitype== SashimiType.TUNA) {
			sashimimeat = "tuna sashimi";
			}
		else if(sashimitype== SashimiType.YELLOWTAIL) {
			
			sashimimeat = "yellowtail sashimi";
			}
		else if(sashimitype== SashimiType.EEL) {
			
			sashimimeat = "eel sashimi";
			
		}
		else if(sashimitype== SashimiType.CRAB) {
			
			sashimimeat= "crab sashimi";
			
			}
		else if(sashimitype== SashimiType.SHRIMP) {
			
			sashimimeat = "shrimp sashimi" ;
				}
	
		return sashimimeat;
	}
	
	@Override
	public IngredientPortion[] getIngredients() {
		// TODO Auto-generated method stub
		
		IngredientPortion[] ingredient =  new IngredientPortion[1];
		ingredient[0] = ingredientportion;
		
		return ingredient;
	}
	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
	
		return ((int) (ingredientportion.getCalories()+ 0.5));
		}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return ((int) ((ingredientportion.getCost() * 100.0)+ 0.5)) / 100.0;
	}
	
	@Override
	public boolean getHasRice() {
		// TODO Auto-generated method stub
		return ingredientportion.getIsRice();
	}
	@Override
	public boolean getHasShellfish() {
		// TODO Auto-generated method stub
	
		return ingredientportion.getIsShellfish();
	
	}
	@Override
	public boolean getIsVegetarian() {
		// TODO Auto-generated method stub
		return ingredientportion.getIsVegetarian();
	}

}
