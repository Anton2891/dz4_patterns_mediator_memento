package com.company.mediator.components;

public class FirstThread extends Thread {
    private final Component component;
    public boolean life = true;

    public FirstThread(Component component) {
        this.component = component;
    }

    @Override
    public void run() {
        while (life) {
            component.randomGen();
        }
    }

    public void setLife(boolean life) {
        this.life = life;
    }
}
