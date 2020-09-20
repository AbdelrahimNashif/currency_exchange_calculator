package com.example.currency_exchange_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    private Button resultbtn,backbtn;
    private TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultbtn=findViewById(R.id.resultbtn);
        resultbtn.setOnClickListener(this);
        tvresult=findViewById(R.id.tvresult);
        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(resultbtn==view){
            Intent intent=getIntent();
            Currency currency=(Currency) intent.getSerializableExtra("currency");
            tvresult.setText(currency.getFrom()+" "+currency.getAmount()+'\n'+'\n'+"="+'\n'+'\n'+currency.getTo()+" "+currency.getResult());
        }
        else if (backbtn==view){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }
}