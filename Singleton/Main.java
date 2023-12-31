package DesignPattern.Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        for(int i=0;i<100;i++){
            executorService.execute(()->User.getInstance());
        }

    }
}