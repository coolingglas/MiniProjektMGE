package com.example.sinth.miniprojekt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.sinth.miniprojekt.R;

import java.util.ArrayList;
import java.util.List;

import domain.Gadget;

/**
 * Created by sinth on 16.10.2017.
 */

public class MyArrayAdapter<Gadget> extends ArrayAdapter {

    List<Gadget> gadgets = new ArrayList<>();

    public MyArrayAdapter(Context context, int resource, int textViewResourceId, List<Gadget> objects){
        super(context, resource, textViewResourceId, objects);
    }

    @override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Gadget gadget = gadgets.get(position);

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.layout_row, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.label);
        //CheckBox checkBox = convertView.findViewById(R.id.checkBox);

        textView.setText(gadget. + " " + gadget.getManufacturer());
        //checkBox.setText(module.getName());
        //checkBox.setChecked(module.isSelected());

        return convertView;
    }

    public void setList (List<Gadget> gadgets){
        this.gadgets = gadgets;
    }

}
