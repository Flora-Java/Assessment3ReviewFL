package co.grandcircus;

public abstract class Food {

	private String ordername;
	private double price;
	private int quantity;
	
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
	}
	public Food(String ordername, double price, int quantity) {
		super();
		this.ordername = ordername;
		this.price = price;
		this.quantity = quantity;
	}
	public Food() {
		super();
		ordername = "Grant Chirpus";
		price = .99;
		quantity = 1;
		
	}
	public abstract double getTotal();
	
	public abstract double getTotalTax(); 
	
	
	
	
}
