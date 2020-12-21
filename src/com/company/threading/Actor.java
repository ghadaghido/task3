package com.company.threading;

public class Actor implements  Runnable {
    private String name;
    private void ActorBase(String name){
        super();
        this.name=name;
    }

    public Actor(String s) {
    }

    public Actor() {

    }

    @Override
    synchronized  public void run() {
        int x = 0;
        System.out.println(Thread.currentThread().getName() + "start name=" + name);
        processname();
        System.out.println(Thread.currentThread().getName() + "End name=");
    }
    private void processname() {

        try {
            Thread.sleep(1000);

    }
        catch(InterruptedException e){
            e.printStackTrace();

        }



    }


}
