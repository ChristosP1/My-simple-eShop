package eShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	private static ArrayList<Product> products = new ArrayList<Product>() 
	{{

		add(new Product("Potato Chips", 1.50, "Country", 15));
		add(new Product("Coca Cola", 2.20, "Zero 1L", 15));
		add(new Product("Coca Cola", 2.20, "Light 1L", 15));
		add(new Product("Coca Cola", 2.20, "Regular 1L", 15));
		add(new Product("Fanta", 1.90, "Lemonade", 15));
		add(new Product("Nuts", 1.00, "Cashews", 15));
		add(new Product("Water", 1.50, "6-pack", 15));
		add(new Product("Beer", 1.50, "Mythos", 15));
		add(new Product("Beer", 1.80, "Bud", 15));
		add(new Product("Beer", 2.00, "Primator", 15));
		add(new Product("Chocolate", 2.20, "Crunch White", 15));
		add(new Product("Chocolate", 2.20, "Crunch Brown", 15));
		add(new Product("Cigarrets", 4.30, "Prince Red", 15));
		add(new Product("Cigarettes", 4.30, "Stuyvesant", 15));
		add(new Product("Cigarettes", 4.30, "Camel Activate", 15));
		add(new Product("Cigarettes", 4.30, "Camel Gold", 15));
		add(new Product("Cigarettes", 4.10, "Marlboro Lights", 15));
		add(new Product("Cigarettes", 4.30, "Marlboro Red", 15));
		add(new Product("Cigarettes", 4.30, "Carelia Gold", 15));
		add(new Product("Cigarettes", 4.30, "Carelia Red", 15));
		
		
	}};

	static Scanner scan = new Scanner(System.in);
	public static final int[] operations = {0,1,2,3,4};
	
	public static void run() {
			
		//Print menu to user
		showMenu();
		//Scan for an operation from the menu
		String answer = scan.nextLine();
		int answerNum = Integer.parseInt(answer);
		
		while(answerNum != 0) {
			
			//Validating the answer and only then operate (repeatedly)
			if(validateMenuAnswer(answer)) {
				System.out.println("--- TEST VALID ANSWER ---");
				
				switch(answerNum) {
				case 1:
					System.out.println("--- TEST CASE 1 ---");
					showAllProducts();
					break;
				case 2:
					System.out.println("--- TEST CASE 2 ---");
					addProduct();
					break;
				case 3:
					System.out.println("--- TEST CASE 3 ---");
					break;
				case 4:
					System.out.println("--- TEST CASE 4 ---");
					break;
				default:
					System.out.println("--- DEFAULT ---");
					break;
				
				}
				
				
			}
			else {
				System.out.println("Please enter a valid number");
			}
			
			
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Print menu to user
			showMenu();
			//Scan for an operation from the menu
			answer = scan.nextLine();
			answerNum = Integer.parseInt(answer);
		}
			
	}
	
	
	public static void showMenu() {
		System.out.println("Welcome to my spectacular E-Shop");
		System.out.println("================================");
		System.out.println("Choose operation:");
		System.out.println("\t1. Show All Products");
		System.out.println("\t2. Add Product");
		System.out.println("\t3. Delete Product");
		System.out.println("\t4. Total Price");
		System.out.println("0. EXIT");
	
	}
	
	public static boolean validateMenuAnswer(String ans) {
		boolean flag = false;
		try {
			for(int i : operations) {
				if(Integer.parseInt(ans) == i)
					flag=true;
			}
		}
		catch(Exception e){
			System.out.println("Please enter a number");
			return false;
		}
		
		
		return flag;
	}
	
	public static void showAllProducts() {
		System.out.println("--- TEST SHOW ALL ITEMS ---");	
		for(Product i : products) {
			System.out.format("\nName: %s \nPrice: %.2f \n",i.getName(), i.getPrice());
			
		}
	}
	
	public static void addProduct() {
		System.out.println("--- TEST ADD PRODUCT ---");
		System.out.println("\n\nYou entered the adding process!\n");
		
		System.out.println("-Name: ");
		String name = scan.nextLine();
		
		
		System.out.println("-Price: ");
		double price = scan.nextDouble();
		
		System.out.println("-Description: ");
		String description = scan.nextLine();
		scan.next();
		
		System.out.println("-Stock: ");
		int stock = scan.nextInt();
		
		products.add(new Product(name,price,description,stock));
		
	}
	
	public static void removeProduct() {
		System.out.println("--- TEST REMOVE PRODUCT ---");
	}
	
}











