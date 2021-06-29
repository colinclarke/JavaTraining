package com.hcl.day3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class A {
	private String name;
	private int number;
	
	public void doSomething() {
		System.out.println("This method is in A");
	}
}

@Getter
@Setter
class B extends A {
	private double decimal;
	
	B(String name, int number, double decimal) {
		super(name, number);
		this.decimal = decimal;
	}
}


