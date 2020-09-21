package com.example.currency_exchange_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    private Button resultbtn,backbtn;
    private TextView tvresult;
    private Dialog d;
    private Button yesbtn,nobtn;
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
            if(!tvresult.getText().toString().equals(""))
                tvresult.setText("");
            else {
                Intent intent = getIntent();
                Exchange exchange = (Exchange) intent.getSerializableExtra("exchange");
                tvresult.setText(exchange.getFrom().getCode() + ": " + exchange.getAmount() + exchange.getFrom().getSymbol() + '\n' + '\n' + "=" + '\n' + '\n' + exchange.getTo().getCode() + ": " + exchange.getResult() + exchange.getTo().getSymbol());
            }
        }
        else if (backbtn==view){
            d=new Dialog(this);
            d.setContentView(R.layout.back);
            d.setCancelable(true);
            yesbtn=d.findViewById(R.id.yesbtn);
            yesbtn.setOnClickListener(this);
            nobtn=d.findViewById(R.id.nobtn);
            nobtn.setOnClickListener(this);
            d.show();
        }
        else if(yesbtn==view){
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else if (nobtn==view){
            d.dismiss();
        }
    }
}