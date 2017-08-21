package com.example.kiamanbaev.listview;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by KIAmanbaev on 21.08.2017.
 */

class MyArrayAdapter extends ArrayAdapter<MyClass> {
    public MyArrayAdapter(MainActivity mainActivity, int new_layout, ArrayList<MyClass> listOfObjects) {
        super(mainActivity, 0, listOfObjects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null){
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.new_layout, parent, false);
        }

        MyClass object = getItem(position);
        TextView title, text;

        title = (TextView) listViewItem.findViewById(R.id.titleTextView);
        text = (TextView) listViewItem.findViewById(R.id.myTextView);

        title.setText(object.getTitle());
        text.setText(object.getText());

        return listViewItem;
    }
}
