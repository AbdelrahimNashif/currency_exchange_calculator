package com.example.currency_exchange_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableCombination extends AppCompatActivity implements View.OnClickListener {
    private Button backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_combination);
        backbtn=findViewById(R.id.tablebaclbtn);
        backbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (backbtn==view){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}