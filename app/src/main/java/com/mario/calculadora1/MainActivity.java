package com.mario.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSuma = (Button) findViewById(R.id.btnSuma);
        Button btnResta = (Button) findViewById(R.id.btnResta);
        Button btnMulti = (Button) findViewById(R.id.btnMulti);
        Button btndivision = (Button) findViewById(R.id.btnDivisión);

    }

    @Override
    public void onClick(View v) {
        int buttonid;
        
    }
}