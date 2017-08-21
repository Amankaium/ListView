package com.example.kiamanbaev.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<MyClass> listOfObjects;
    ArrayAdapter<MyClass> adapter;
    MyClass object, puppy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        listView.setAdapter(adapter);
        listOfObjects.add(object);
        listOfObjects.add(puppy);

    }

    private void init() {
        object = new MyClass("Title", "Here is text.");
        puppy = new MyClass("Toto", "Good boy!");
        listView = (ListView) findViewById(R.id.listView);
        listOfObjects = new ArrayList<>();
        adapter = new MyArrayAdapter(MainActivity.this, R.layout.new_layout, listOfObjects);
    }
}
