package com.ggi.touristapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView japuir = (TextView) findViewById(R.id.jaipurTextView);

        japuir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You click Jaipur", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this,JaipurActivity.class);
                startActivity(i);
            }
        });


    }
}
