package com.company;

import com.company.threading.Actor;

public class Main extends Thread{

    public static void main(String[] args) {

        Actor act=new Actor();
        defaultclass def=new defaultclass();
        AutoDec autoD=new AutoDec();
        AutoInc autiC=new AutoInc();
        countWithVal countWith= new countWithVal();


        act.run();
        def.run();
        countWith.run();









//        ExecutorService execute = new Executors.newFixedThreadPool(4);
//        for (int i = 0; i < 10; i++) {
//            Runnable actor = new Actor("" + i);
//            execute.execute(actor);
//            executor.shutdown();
//            while (!executor.isTerminated() ){
//                System.out.println("ur tasks finished");
//            }

            }

}