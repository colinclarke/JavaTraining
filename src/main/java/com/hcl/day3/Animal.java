package com.hcl.day3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Animal{
	private String furColor;
	
	void walk(){ 
		System.out.println("I am walking"); 
	}
	
	Animal makeNoise() {
		System.out.println("Animal noises");
		return this;
	}
} 
class Dog extends Animal{ 
	void eat(){ 
		System.out.println("I am eating"); 
	}
	void bark() {
		System.out.println("I am barking");
	}
	
	@Override
	Dog makeNoise() {
		System.out.println("Woof woof!");
		return this;
	}
}
