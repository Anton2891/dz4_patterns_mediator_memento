package com.company.mediator.components;

import com.company.mediator.Mediator;

import java.util.Random;

public class Component {
    protected Mediator mediator;
    public Random rd = new Random();
    public int val;
    public boolean bool;

    public Component() {
    }

    public synchronized void randomGen() {
        val = rd.nextInt(100);
        System.out.println("random number = " + val);
        notifyAll();
        try {
//            Thread.sleep(2000);
            wait(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void waiting(String name) {
        System.out.println(name + " " + val);
        try {
            Thread.sleep(500);
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
