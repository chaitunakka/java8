package com.example.demo;

/**
 * AbsClass
 */

abstract class Abs {
	public String getString() {
		return "abs class meth";
	}
}

public class AbsClass extends Abs {

	public static void main(String[] args) {
		Abs abs = new AbsClass();
		System.out.println(abs.getString());
	}
}