package ARP;

public class Customer {
	public String customerName;
	PlaceOrder placeOrder;

	public Customer(String customerName, PlaceOrder placeOrder) {
		this.customerName = customerName;
		this.placeOrder = placeOrder;
	}

	public void display() {
		System.out.println("Customer Name: " + customerName);
		placeOrder.display();
	}

	public static void main(String[] args) {
		ItemStock itemStock = new ItemStock(100);
		ShopOwner shopOwner = new ShopOwner("DIU", itemStock);
		shopOwner.display();
		DeliveryProduct deliveryProduct = new DeliveryProduct("Mirpur");
		MakePayment makePayment = new MakePayment(500.00);
		PlaceOrder placeOrder = new PlaceOrder(05, itemStock, deliveryProduct, makePayment);
		Customer customer = new Customer("ARP", placeOrder);
		customer.display();
	}
}
