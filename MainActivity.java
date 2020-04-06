package com.ravi.someproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Spinner sp;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.countries);
        bt = findViewById(R.id.check);

//        created a arrayadapter and binded data to adapter
        ArrayAdapter ad = ArrayAdapter.createFromResource(
                        this,
                        R.array.countryList,
                        android.R.layout.simple_spinner_item
                );

//        specified dropdown view
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

//        binded adapter to spinner
        sp.setAdapter(ad);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//               getSelectedItem() -> to get the selected item from spinner
                String val = sp.getSelectedItem().toString();
                Log.i("country",val);
            }
        });


    }
}
