package com.designpatterns.decorator;

interface Pizza{
	public String makePizza();
}

class PlainPizza implements Pizza{

	@Override
	public String makePizza() {
		return "Plain Pizza";
	}
	
}
abstract class PizzaDecorator implements Pizza{
	
	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	public String makePizza() {
		return pizza.makePizza();
	}
}

class ChikenPizzaDecorator extends PizzaDecorator{

	public ChikenPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String makePizza() {
		return pizza.makePizza() + addChikenAndCheese();
	}
	
	private String addChikenAndCheese() {
		return ",chicken and cheese added";
	}
	
}

class VegPizzaDecorator extends PizzaDecorator{
	public VegPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String makePizza() {
		return pizza.makePizza() + addVegetableAndCheese();
	}

	private String addVegetableAndCheese() {
		return ",vegetable and cheese added";
	}
}
public class PizzaClient {
public static void main(String[] args) {
	
	PlainPizza plainPizzaObj=new PlainPizza();
	String plainPizza = plainPizzaObj.makePizza();
	System.out.println(plainPizza);
	
	String chickenPizza=new ChikenPizzaDecorator(plainPizzaObj).makePizza();
	System.out.println("\n"+chickenPizza);
	
	String vegPizza=new VegPizzaDecorator(plainPizzaObj).makePizza();
	System.out.println("\n"+vegPizza);
	
	
}
}
