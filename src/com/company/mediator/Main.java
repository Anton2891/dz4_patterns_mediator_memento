package com.company.mediator;

import com.company.mediator.components.Component;
import com.company.mediator.components.FirstThread;
import com.company.mediator.components.SecondThread;
import com.company.mediator.components.ThirdThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Component component = new Component();
        MediatorImpl mediator= new MediatorImpl();
        mediator.run();
//        FirstThread firstThread = new FirstThread(component);
//        SecondThread secondThread = new SecondThread(component);
//        ThirdThread thirdThread = new ThirdThread(component);
//        firstThread.start();
//        secondThread.start();
//        thirdThread.start();
//        System.out.println(firstThread.isAlive());
//        System.out.println(firstThread.isAlive());
//                val = component.val;
//                System.out.println("1_" + val);
//        firstThread.join(10000);
//        component.stop();
//        mediator.stopRun(component);
//                Thread.sleep(2000);
//        System.out.println("firstThread " + firstThread.isAlive());
//        System.out.println("secondThread " + secondThread.isAlive());
//        System.out.println("thirdThread " + thirdThread.isAlive());
    }
}
