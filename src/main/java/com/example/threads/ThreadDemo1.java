package com.example.threads;

class A extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    @Override
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    
}

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new A();
        Thread b = new B();

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println("Done");
    }
}