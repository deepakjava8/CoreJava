
class Pet {
    public void m1() {
    	System.out.println("Pet-m1");
    }
}
class Cat extends Pet{
	public void m1() {
    	System.out.println("Cat-m1");
    }
	public void m2() {
		System.out.println("Cat-m2");
    }
}
class Dog {
    
    public static void main(String args[]) {
        Pet p = new Pet();
        Cat c=(Cat)p;
        c.m1();
    }
}