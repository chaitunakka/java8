package com.syntel.demo;

// Inner class
class DemoInner{
	DemoInner(){
		System.out.println("Demo constructor");
	}

	class InsideClass{
		InsideClass(){
			System.out.println("Inside class constructor");
		}
	}
}

class InnerClass{
	public static void main(String[] args) {
		DemoInner d = new DemoInner();
		DemoInner.InsideClass i = d.new InsideClass();
	}
}