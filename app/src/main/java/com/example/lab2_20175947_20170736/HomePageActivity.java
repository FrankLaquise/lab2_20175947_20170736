package com.example.lab2_20175947_20170736;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        //jhgjjh
    }
    public void regresar(View view){
        Intent regresar = new Intent(this,MainActivity.class);
        startActivity(regresar);
    }
}