package com.example.prac;

interface Vehicle {
	default void print() {
		System.out.println("vehicle print");
	}
}

interface Truck {
	default void print() {
		System.out.println("Truck print");
	}
	
	void get();
}

class Print implements Vehicle {

	@Override
	public void print() {
		Vehicle.super.print();
	}
	
}

class Impl implements Truck{

	@Override
	public void get() {
		
	}
	
}

public class DefaultMethod {

	public static void main(String[] args) {
		Truck t = () -> {};
		t.get();
	}

}
