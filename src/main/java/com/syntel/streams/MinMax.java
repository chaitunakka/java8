package com.syntel.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class MinMax {

	public static void main(String[] args) {
		int[] integers = new int[] {1,2,3,4,5,6,7,8,9};
		
		int min = Arrays.stream(integers)
				.min()
				.getAsInt();
		IntStream intStream = Arrays.stream(integers);
		int max = intStream.max()
						   .getAsInt();
		System.out.printf("min: %d, max: %d \n",min, max);
		
		//min max of objects
		Car[] sooperCars = { new Car("Porsche",324), new Car("Bugatti",375), new Car("McLaren",360), new Car("Camaro",246) };
		Car fastest = Arrays.stream(sooperCars)
							.max(Comparator.comparing(Car::getTopSpeed))
//							.orElseGet(MinMax::customCar);
							.orElseThrow(NoSuchElementException::new);
		System.out.println(fastest);
	}

	static Car customCar() {
		return new Car("Muscle",199);
	}
	
}


class Car {
	private String name;
	private int topSpeed;
	
	public Car(String name, int topSpeed) {
		super();
		this.name = name;
		this.topSpeed = topSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", topSpeed=" + topSpeed + "]";
	}
	
}