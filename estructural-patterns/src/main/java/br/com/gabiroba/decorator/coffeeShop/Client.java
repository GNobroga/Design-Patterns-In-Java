package br.com.gabiroba.decorator.coffeeShop;

import br.com.gabiroba.decorator.coffeeShop.model.Drink;
import br.com.gabiroba.decorator.coffeeShop.model.Expresso;
import br.com.gabiroba.decorator.coffeeShop.model.Tea;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		
	}
}
