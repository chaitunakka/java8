package com.syntel.LambdaExceptions;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FutureDemo{
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		Future<String> f = es.submit(() -> {
			System.out.println("callable started");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			return "return from callable";
		});
		System.out.println("calling future.get()");
		try {
			f.get();
			System.out.println(f.isDone());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("shutdown");
		es.shutdownNow();
	}
}