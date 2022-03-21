package com.company.memento;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Memento {
    private String color;
    private String encoding;
    private String font;
    private int fontSize;

    public Memento() {
    }

    public Memento(Settings settings) {
        this.color = settings.getColor();
        this.encoding = settings.getEncoding();
        this.font = settings.getFont();
        this.fontSize = settings.getFontSize();

    }

    public void saveJson(Settings settings){
        Gson gson = new Gson();
        String json = gson.toJson(new Memento(settings));
        try {
            FileUtils.write(new File("Settings.json"), json, "utf8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Settings getJson(File file){
        Gson gson = new Gson();
        String json = null;
        try {
            json = FileUtils.readFileToString(file, "utf8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Memento memento = gson.fromJson(json, Memento.class);
        return new Settings(memento.getColor(), memento.getEncoding(), memento.getFont(), memento.getFontSize());
    }

    public String getColor() {
        return color;
    }

    public String getEncoding() {
        return encoding;
    }

    public String getFont() {
        return font;
    }

    public int getFontSize() {
        return fontSize;
    }
}
