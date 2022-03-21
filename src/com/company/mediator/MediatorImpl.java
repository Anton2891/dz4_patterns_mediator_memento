package com.company.mediator;

import com.company.mediator.Mediator;
import com.company.mediator.components.Component;
import com.company.mediator.components.FirstThread;
import com.company.mediator.components.SecondThread;
import com.company.mediator.components.ThirdThread;

public class MediatorImpl implements Mediator {
    Component component = new Component();
    FirstThread firstThread = new FirstThread(component);
    SecondThread secondThread = new SecondThread(component, firstThread);
    ThirdThread thirdThread = new ThirdThread(component, firstThread);

    @Override
    public void run() {
        firstThread.start();
        secondThread.setDaemon(true);
        thirdThread.setDaemon(true);
        secondThread.start();
        thirdThread.start();

        try {
            firstThread.join(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.stopRunFirst();
        this.stopRunOther();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("firstThread " + firstThread.isAlive());
        System.out.println("secondThread " + secondThread.isAlive());
        System.out.println("thirdThread " + thirdThread.isAlive());

    }

    @Override
    public void stopRunFirst() {
        this.firstThread.setLife(false);

    }

    @Override
    public void stopRunOther() {
        this.secondThread.stopRun();
        this.thirdThread.stopRun();
    }

    public boolean isAliveFirst(){
        return firstThread.isAlive();
    }

    public boolean isAliveSecond(){
        return secondThread.isAlive();
    }

    public boolean isAliveThird(){
        return thirdThread.isAlive();
    }
}
