package com.example.lab2_20175947_20170736;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class ConfirmationActivity extends AppCompatActivity {

    Button button;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        setContentView(R.layout.activity_confirmation);
        CheckBox checkBox=findViewById(R.id.checkBox1);
        CheckBox checkBox2=findViewById(R.id.checkBox2);
        CheckBox checkBox3=findViewById(R.id.checkBox3);
        Log.d("estadoc1", String.valueOf(checkBox.isChecked()));
        Log.d("estadoc2", String.valueOf(checkBox2.isChecked()));
        Log.d("estadoc3", String.valueOf(checkBox2.isChecked()));
        button=findViewById(R.id.button_register);
        dialog = new Dialog(this);
        ArrayList<String> tickets = new ArrayList<>();
        ArrayList<Float> prices = new ArrayList<>();
        if(checkBox.isChecked()) {
            prices.add(15.00f);
            tickets.add("ticket 1");
        }
        if(checkBox2.isChecked()) {
            prices.add(26.00f);
            tickets.add("ticket 2");
        }
        if(checkBox3.isChecked()) {
            prices.add(23.00f);
            tickets.add("ticket 3");
        }


        button.setOnClickListener(view ->{
            dialog.setContentView(R.layout.popupmenu);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        });

    }
}