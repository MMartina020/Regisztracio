package com.example.regisztracios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev=findViewById(R.id.nev);
        EditText szuletesi=findViewById(R.id.szuletesi);
        EditText jelszo=findViewById(R.id.jelszo);
        Button regisztral=findViewById(R.id.regisztracio);


        regisztral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,  MainActivity2.class);
                i.putExtra("nev",nev.getText().toString());
                i.putExtra("szuldat",szuletesi.getText().toString());
                i.putExtra("jelszo", jelszo.getText().toString());

                startActivity(i);
            }
        });
    }
}