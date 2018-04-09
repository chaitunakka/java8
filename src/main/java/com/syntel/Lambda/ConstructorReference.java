package com.syntel.Lambda;

interface Func {
	Ref myFunc(int n);
}

class Ref {
	private int n;

	Ref() {
		n=0;
		System.out.println("Default constructor "+n);
	}
	Ref(int n) {
		this.n = n;
		System.out.println("Parameter constructor "+n);
	}

	public int getN() {
		return n;
	}
}

public class ConstructorReference {
	public static void main(String[] args) {
		Func f = Ref::new;
		Ref r = f.myFunc(10);
		System.out.println(r.getN());
	}
}
