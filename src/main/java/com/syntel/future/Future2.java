package com.syntel.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.lang.System.out;

class FutureDemo {

    static ExecutorService es = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        Future<String> f1 = getFuture();
        Future<String> f2 = getFuture();
        System.out.println("calling future.get()");
        IntStream.range(1, 10).forEach(out::print);
        try {
            f1.get();
            f2.get();
        } catch (InterruptedException | ExecutionException e) { }
        es.shutdownNow();
        System.out.println("shutdown");
    }

    static Future<String> getFuture(){
        return es.submit(() -> {
            System.out.println("callable started");
            try {
                Thread.sleep(5000);
            } catch (Exception e) { }
            System.out.println(Thread.currentThread().getName());
            return "return from callable";
        });
    }
}