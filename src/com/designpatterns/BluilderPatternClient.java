package com.designpatterns;

import com.designpatterns.Pizza.PizzaBuilder;

public class BluilderPatternClient {
public static void main(String[] args) throws Exception{
	Pizza pizza1=new PizzaBuilder("Bread").build();
	Pizza pizza2=new PizzaBuilder("Bread")
			.setPizzaType(PizzaType.NON_VEG_PIZZA)
			.setExtraCheese("Amul")
			.build();
	System.out.println(pizza1);
	System.out.println(pizza2);
  }

}

enum PizzaType{
	VEG_PIZZA,NON_VEG_PIZZA
}
class Pizza{
	private String base;
	private PizzaType pizzaType;
	private String extraCheese;
	private String extraCorn;
	
	private Pizza(PizzaBuilder builder) {
		this.base=builder.base;
		this.pizzaType=builder.pizzaType;
		this.extraCheese=builder.extraCheese;
		this.extraCorn=builder.extraCorn;
	}
	public String getBase() {
		return base;
	}
	public PizzaType getPizzaType() {
		return pizzaType;
	}
	public String getExtraCheese() {
		return extraCheese;
	}
	public String getExtraCorn() {
		return extraCorn;
	} 
	
	public static class PizzaBuilder{
		private String base;
		private PizzaType pizzaType;
		private String extraCheese;
		private String extraCorn;
		
		
		
		public PizzaBuilder(String base) {
			this.base=base;
		}

		public PizzaBuilder setPizzaType(PizzaType pizzaType) {
			this.pizzaType = pizzaType;
			return this;
		}

		public PizzaBuilder setExtraCheese(String extraCheese) {
			this.extraCheese = extraCheese;
			return this;
		}

		public PizzaBuilder setExtraCorn(String extraCorn) {
			this.extraCorn = extraCorn;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
		}	
	}

	@Override
	public String toString() {
		return "Pizza [base=" + base + ", pizzaType=" + pizzaType + ", extraCheese=" + extraCheese + ", extraCorn="
				+ extraCorn + "]";
	}
	
}