package com.example.threads;

/**
 * SampleStatic
 */
public class SampleStatic {

    static int optCount = 0;
    int j = 1;
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        Calculator cname = new Calculator("6354672", "USA");
        c1.add();
        c2.sub();
        c1.mul();
        System.out.println(optCount);
        System.out.println(cname);
    }
}

class Calculator {

    String name = "Syntel";
    String pincode = "23455";
    String country = "India";

    Calculator() {
        this.name = "chaitu";
        System.out.println("Constructor");
    }

    Calculator(String pincode, String country) {
        this.country = country;
        this.pincode = pincode;
    }

    Calculator(String name) {
        this.name = name;
    }

    static void inc() {
        SampleStatic.optCount += 1;
    }

    void add() {
        inc();
    }
    void sub() {
        inc();
    }
    void mul() {
        inc();
    }
    void div() {
        inc();
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    @Override
    public String toString() {
        // System.out.println("Name is - " + this.name);
        return "Name is - " + this.name + "\n Country is - " + this.country;
    }
}