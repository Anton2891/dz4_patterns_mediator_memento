package com.company.memento;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        Settings settings = new Settings("grey", "utf8", "arial", 14);
        System.out.println("settings = " + settings);

        Memento memento = new Memento();
        memento.saveJson(settings);

        Settings settings1 = memento.getJson(new File("Settings.json"));
        System.out.println("settings1 = " + settings1);
    }
}
