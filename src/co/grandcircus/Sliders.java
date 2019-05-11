package co.grandcircus;

public class Sliders extends Food {

	
	public Sliders() {
		super();
		this.setPrice(1.95 * 3);
		// TODO Auto-generated constructor stub
	}

	public Sliders(String ordername, double price, int quantity) {
		super(ordername, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return (1.95 *3) * super.getQuantity();
	}

	@Override
	public double getTotalTax() {
		// TODO Auto-generated method stub
		return (1.95 *3) * super.getQuantity() * .06;
	}

	
	

}
