package com.example.kiamanbaev.listview;

/**
 * Created by KIAmanbaev on 21.08.2017.
 */

class MyClass {
    String Title;
    String text;

    public MyClass() {
    }

    public MyClass(String title, String text) {
        Title = title;
        this.text = text;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
