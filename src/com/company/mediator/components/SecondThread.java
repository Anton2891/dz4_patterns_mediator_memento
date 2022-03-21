package com.company.mediator.components;

import com.company.mediator.Mediator;

public class SecondThread extends Thread {
    protected Mediator mediator;
    private final Component component;
    private final FirstThread firstThread;
    public boolean life = true;

    public SecondThread(Component component, FirstThread firstThread) {
        this.component = component;
        this.firstThread = firstThread;
    }

    @Override
    public void run() {
        while (this.life && firstThread.isAlive()) {
            component.waiting(this.getName());
        }
    }

    public void stopRun() {
        this.life = false;
    }
}
