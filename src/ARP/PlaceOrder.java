package ARP;

public class PlaceOrder {
	public int orderNumber;
	ItemStock itemStock;
	DeliveryProduct deliveryProduct;
	MakePayment makePayment;

	public PlaceOrder(int orderNumber, ItemStock itemStock, DeliveryProduct deliveryProduct, MakePayment makePayment) {
		this.orderNumber = orderNumber;
		this.itemStock = itemStock;
		this.deliveryProduct = deliveryProduct;
		this.makePayment = makePayment;
	}

	public void display() {
		System.out.println("Order Number: " + orderNumber);
		itemStock.display();
		deliveryProduct.display();
		makePayment.display();
	}

	/*public static void main(String[] args) {
		
	}*/
}
