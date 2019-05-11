package co.grandcircus;

public class FoodCreator  {
	
	public static Food buildOrder(String name, int quantity, String food) {
		Food foodChoice = null;
		if (food.equals("Slider"))  {
			 foodChoice = new Sliders();
			foodChoice.setOrdername(name);
			foodChoice.setQuantity(quantity);
		} else {
			foodChoice = new Slurpee();
			foodChoice.setOrdername(name);
			foodChoice.setQuantity(quantity);
		} return foodChoice;
	}
	
	public static String describeOrder(Food food) {
		
		
		return "Order Name: " + food.getOrdername()+ " Order Subtotal: " + food.getTotal() + " Order Total w/Tax: " +
		(food.getTotal()+ food.getTotal());
	}
	
	

}
