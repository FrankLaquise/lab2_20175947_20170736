package com.example.lab2_20175947_20170736;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et_correo;
    private EditText et_contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_correo=(EditText)findViewById(R.id.t_email);
        et_contraseña=(EditText)findViewById(R.id.t_pass);

    }

    public void iniciarsesion(View view){
        Intent iniciar = new Intent(this,MainActivity2.class);
        startActivity(iniciar);


    }



}