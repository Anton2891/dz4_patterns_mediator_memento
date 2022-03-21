package com.company.mediator.components;

public class ThirdThread extends Thread {
    private final Component component;
    private final FirstThread firstThread;
    public boolean life = true;

    public ThirdThread(Component component, FirstThread firstThread) {
        this.component = component;
        this.firstThread = firstThread;
    }

    @Override
    public void run() {
        while (life && firstThread.isAlive()) {
            component.waiting(this.getName());
        }
    }

    public void stopRun() {
        this.life = false;
    }
}
