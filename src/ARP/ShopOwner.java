package ARP;

public class ShopOwner {
	public String ownerName;
	ItemStock itemStock;

	public ShopOwner(String ownerName, ItemStock itemStock) {
		this.ownerName = ownerName;
		this.itemStock = itemStock;
	}

	public void display() {
		System.out.println("Shop Owner Name: " + ownerName);
		itemStock.display();
	}
}
