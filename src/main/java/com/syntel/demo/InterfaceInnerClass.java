package com.syntel.demo;

interface Demo{
    class InsideDemo{
        static void print(){
            System.out.println("Inside class of Inteface");
        }
    }
}

class InterfaceInnerClass extends Demo.InsideDemo{
    public static void main(String[] args) {
        InterfaceInnerClass i = new InterfaceInnerClass();
        //i.print();
    }
}