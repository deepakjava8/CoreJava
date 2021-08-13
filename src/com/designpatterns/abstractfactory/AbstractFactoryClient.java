package com.designpatterns.abstractfactory;

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

class Octopus implements Animal{
	@Override
	public String speak() {
			return "Octopus is speaking";
	}
}

class Shark implements Animal{
	@Override
	public String speak() {
			return "Shark can't speak";
	}
}


abstract class AnimalFactory{
	
	public  abstract Animal getAnimal(String animalType);
	
	public static AnimalFactory getAnimalFactory(String factoryType) {
		AnimalFactory animalFactory=null;
		switch(factoryType) {
		case "SEA" :
			animalFactory=new SeaAnimalFactory();
			break;
		case "LAND" :
			animalFactory=new LandAnimalFactory();
			break;
		default : throw new IllegalStateException("No suche Factory avialable for factory type : "+factoryType);
		}
		return animalFactory;
	}	
}

class LandAnimalFactory extends AnimalFactory{

	@Override
	public  Animal getAnimal(String animalType) {
		Animal animal=null;
		switch (animalType) {
		case "DOG":
			animal=new Dog();
			break;
		case "CAT" :
			animal=new Cat();
			break;
		case "LION" : 
			animal=new Lion();
			break;

		default: throw new IllegalArgumentException("There is no animal avialable for : "+animalType);
		}
		return animal;
	}
	
}
class SeaAnimalFactory extends AnimalFactory{

	@Override
	public Animal getAnimal(String animalType) {
		Animal animal=null;
		switch (animalType) {
		case "OCTOPUS" :
			animal=new Octopus();
			break;

		case "SHARK" :
			animal=new Shark();
			break;
		default: throw new IllegalArgumentException("There no animal avialable for "+animalType);
		}
		return animal;
	}
	
}
enum AnimalType{
	CAT,DOG,LION,OCTOPUS,SHARK
}
enum FactoryType{
	SEA,LAND
}
public class AbstractFactoryClient {
public static void main(String[] args) {
	AnimalFactory animalFactory = AnimalFactory.getAnimalFactory(FactoryType.LAND.toString());
	Animal landAnimal = animalFactory.getAnimal(AnimalType.LION.toString());
	System.out.println("How lion speaks :: "+landAnimal.speak());
}
}
