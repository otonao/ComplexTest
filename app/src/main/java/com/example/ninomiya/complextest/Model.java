package com.example.ninomiya.complextest;

public class Model {
    public void first(Callback callback){

        long start = System.currentTimeMillis();

        System.out.println("START");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("END:"+(end - start)  + "ms");
    }

    public void second(Callback callback){
        long start = System.currentTimeMillis();

        System.out.println("START");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("END:"+(end - start)  + "ms");
    }
}
