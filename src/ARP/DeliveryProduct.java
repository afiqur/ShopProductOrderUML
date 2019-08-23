package ARP;

public class DeliveryProduct {
	public String deliveryAddress;

	public DeliveryProduct(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public void display() {
		System.out.println("Delivery Address: " + deliveryAddress);
	}
}
