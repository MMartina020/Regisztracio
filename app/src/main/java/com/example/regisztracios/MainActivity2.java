package com.example.regisztracios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText kiir = findViewById(R.id.kiir);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            kiir.setText(extras.getString("nev")+" "+extras.getString("szuletesi")+" ");
        }


    }
}
