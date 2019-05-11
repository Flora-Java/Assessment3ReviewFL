package co.grandcircus;

public class Slurpee extends Food {

//	public void setPrice(double price) {
//		this.setPrice() = 2.99;
//	}
	
	public Slurpee() {
		super();
		this.setPrice(2.99);
		// TODO Auto-generated constructor stub
	}
	

	public Slurpee(String ordername, double price, int quantity) {
		super(ordername, price, quantity);
		// TODO Auto-generated constructor stub
	}
	
	public Slurpee(String ordername,  int quantity) {
	//	super(ordername, price quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTotal() {
		return (2.99 * super.getQuantity());
	}

	@Override
	public double getTotalTax() {
		return (2.99 * super.getQuantity()* .06) ;   // getTotal
	}

	
	
}
