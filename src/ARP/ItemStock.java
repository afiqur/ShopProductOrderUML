package ARP;

public class ItemStock {
	public int stocks;

	public ItemStock(int stocks) {
		this.stocks = stocks;
	}

	public void display() {
		System.out.println("Remaining Stocks: " + stocks);
	}
}
