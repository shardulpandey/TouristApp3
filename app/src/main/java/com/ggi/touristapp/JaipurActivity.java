package com.ggi.touristapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JaipurActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur);

        ArrayList<place> listOfPlaces = new ArrayList<>();

        listOfPlaces.add(new place(R.drawable.qutub4,"Hawa Mahal","Built by Maharaja Sawai Pratap Singh"));
        listOfPlaces.add(new place(R.drawable.redf2,"Amber Fort","Built by Raja Man Singh"));
        listOfPlaces.add(new place(R.drawable.redf3,"Nahargarh Fort","Built by Jai Singh II"));

        placeAdapter adapter = new placeAdapter(getApplicationContext(),listOfPlaces);

        ListView listView = (ListView) findViewById(R.id.jaipurListView);
        listView.setAdapter(adapter);
    }
}
