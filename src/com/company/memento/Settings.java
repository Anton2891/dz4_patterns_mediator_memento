package com.company.memento;

public class Settings {
    private String color;
    private String encoding;
    private String font;
    private int fontSize;
    private String text;

    public Settings(String color, String encoding, String font, int fontSize) {
        this.color = color;
        this.encoding = encoding;
        this.font = font;
        this.fontSize = fontSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "color='" + color + '\'' +
                ", encoding='" + encoding + '\'' +
                ", font='" + font + '\'' +
                ", fontSize=" + fontSize +
                ", text='" + text + '\'' +
                '}';
    }
}
