package com.hcl.day3;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 1.
    	Bike M = new Bike();
    	
    	// 2.
    	Dog dog = new Dog(); 
        dog.walk(); 
        dog.eat();
        dog.bark();
        
        // 3.
        B test = new B("Gerald", 5, 71.32);
        test.doSomething();
        
        // 4.
        Dog d = new Dog();
        d.setFurColor("Black");
        System.out.println("Dog has "+d.getFurColor()+" fur.");
        // 5.
        Animal animal = new Animal();
        animal = animal.makeNoise();
        d = d.makeNoise();
    }
}
