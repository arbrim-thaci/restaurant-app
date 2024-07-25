package org.makerminds.jcoaching.restaurantapp;

public class RestaurantApp {
	
	public static void main(String[] args) {
		// create an object of restaurant
		Restaurant restaurant = new Restaurant();
		// add values to restaurant object attributes
		restaurant.name = "Route 66";
		restaurant.address = "Te Heroinat, Prishtine";
		
		// Create a client object
		Client client = new Client();
		// add values to client object attributes
		client.name = "Arbrim Thaci";
		client.phoneNr = "+38343123456";
		
		// create an order object and add product names as String to it
		Order order = new Order();
		order.product1 = "Hamburger";
		order.product2 = "Sandwich";
		order.product3 = "CocaCola";
		order.product4 = "Fanta";
		
		// print a message which client ordered which products in which restaurant
		System.out.println("The client " + client.name + " ordered a " + order.product1
			+ ", a " + order.product2 + ", a " + order.product3 + " and " + order.product4
			+ " at " + restaurant.name + " in " + restaurant.address + ".");
	}
}
