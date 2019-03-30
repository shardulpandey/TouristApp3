package com.ggi.touristapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class placeAdapter extends ArrayAdapter<place> {
    public placeAdapter(@NonNull Context context, ArrayList<place> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        place temp = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.imageViewTemp);
        TextView name = (TextView) convertView.findViewById(R.id.nameTextViewTemp);
        TextView des = (TextView) convertView.findViewById(R.id.descriptionTextViewTemp);

        img.setImageResource(temp.getImage());
        name.setText(temp.getNameOfPlace());
        des.setText(temp.getDescriptionOfPlace());

        return convertView;
    }
}
