package eShop;

public class Product {
	
	//Name, price, description, availability 
	
	private String name;
	private double price;
	private String desc;
	private int itemsLeft;
	
	public Product(String n, double p, String d, int av) {
		this.name = n;
		this.price = p;
		this.desc = d;
		this.itemsLeft = av;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getItemsLeft() {
		return itemsLeft;
	}

	public void setItemsLeft(int itemsLeft) {
		this.itemsLeft = itemsLeft;
	}

	
	
}
