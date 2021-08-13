package com.designpatterns.factory;

interface Animal{
	public String speak();
}
class Dog implements Animal{

	@Override
	public String speak() {
			return "Bark Bark";
	}
	
}


class Cat implements Animal{
	@Override
	public String speak() {
			return "Meow Meow";
	}
}

class Lion implements Animal{
	@Override
	public String speak() {
			return "Roar Roar";
	}	
}

class AnimalFactory{
	
	public static Animal createAnimal(String type) {
		Animal animal=null;
		switch(type) {
		case "CAT" :
			animal=new Cat();
			break;
		case "DOG" :
			animal=new Dog();
			break;
		case "LION" :
			animal=new Lion();
			break;
		default : throw new IllegalStateException("No suche object to create");
		}
		return animal;
	}
	
	public Animal getAnimal(String type) {
		Animal animal=null;
		
		if("dog".equalsIgnoreCase(type)) {
			animal=new Dog();
		}else if("lion".equalsIgnoreCase(type)) {
			animal=new Lion();
		}else if("cat".equalsIgnoreCase(type)) {
			animal=new Cat();
		}
		return animal;
		
	}
}
enum AnimalType{
	CAT,DOG,LION
}
public class FactoryClient {
public static void main(String[] args) {
	/*AnimalFactory factory=new AnimalFactory();
	Animal cat = factory.getAnimal(AnimalType.DOG.toString());
	String catSound=cat.speak();
	System.out.println(catSound);*/
	
	Animal animalObj = AnimalFactory.createAnimal(AnimalType.LION.toString());
	System.out.println("Lion speaks like : "+animalObj.speak());
}
}
