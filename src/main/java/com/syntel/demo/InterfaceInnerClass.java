package com.syntel.demo;


interface Demo{
    class InsideDemo{
        static void print(){
            System.out.println("Inside class of Inteface");
        }
        
        public void print1(){
        	System.out.println("Inside class of Inteface1");
        }
    }
}

class InterfaceInnerClass extends Demo.InsideDemo{
    public static void main(String[] args) {
        Demo.InsideDemo id = new Demo.InsideDemo();
        id.print1();
        Demo.InsideDemo.print();
    }
}