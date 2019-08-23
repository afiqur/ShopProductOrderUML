package ARP;

public class MakePayment {
	public double paymentAmount;

	public MakePayment(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public void display() {
		System.out.println("Total Amount: " + paymentAmount);
	}
}
