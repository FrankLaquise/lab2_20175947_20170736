package com.example.lab2_20175947_20170736;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText et_nombre2;
    private EditText et_numero2;
    private EditText et_correo2;
    private EditText et_contraseña2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_nombre2=(EditText)findViewById(R.id.t_nombre2);
        et_numero2=(EditText)findViewById(R.id.t_num2);
        et_correo2=(EditText)findViewById(R.id.t_email2);
        et_contraseña2=(EditText)findViewById(R.id.t_pass2);

    }


    public void registrar(View view){
        Intent registrar_s = new Intent(this,MainActivity2.class);

        String valor_correo2=et_correo2.getText().toString();
        String valor_contra2=et_contraseña2.getText().toString();
        String valor_nombre2=et_nombre2.getText().toString();
        String valor_numero2=et_numero2.getText().toString();

        if (valor_correo2!=null
                && valor_contra2!=null
                && valor_nombre2!=null
                && valor_numero2!=null){
            startActivity(registrar_s);
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show();

        }else if( valor_correo2==null ){
            Toast.makeText(this, "Debe completar su correo", Toast.LENGTH_SHORT).show();
        }else if(valor_contra2==null  ){
            Toast.makeText(this, "Debe completar su contraseña", Toast.LENGTH_SHORT).show();
        }else if(valor_nombre2==null  ){
            Toast.makeText(this, "Debe completar su nombre", Toast.LENGTH_SHORT).show();
        }else if(valor_numero2==null  ){
            Toast.makeText(this, "Debe completar su número", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Falta completar más de un dato", Toast.LENGTH_SHORT).show();
        }

    }
}