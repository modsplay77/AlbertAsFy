package com.example.afinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button mBoton;
    private Context mCont=this;


    // private Context mCont=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Versión BETA, no hace falta loguearse", Toast.LENGTH_LONG).show();

        mBoton = findViewById(R.id.boton);
        mBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mCont,play.class);
                startActivity(intent);
            }
        });
    }


}