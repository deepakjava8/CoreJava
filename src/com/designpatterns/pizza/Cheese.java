package com.designpatterns.pizza;

public enum Cheese {
AMARICAN{
	public float getCost() {
		return 40;
	}
};
public abstract float getCost();
}

//https://www.javacodegeeks.com/2014/08/pizza-problem-builder-vs-decorator.html
