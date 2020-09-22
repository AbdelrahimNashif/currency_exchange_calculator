package com.example.currency_exchange_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Spinner spinner1,spinner2;
    private EditText amount;
    private Button calcbtn,tablebtn;
    private Currency from,to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1=findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.arrayone,R.layout.spinner_custom);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
        spinner2=findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);
        amount=findViewById(R.id.amountet);
        calcbtn=findViewById(R.id.calcbtn);
        calcbtn.setOnClickListener(this);
        tablebtn=findViewById(R.id.table_compbtn);
        tablebtn.setOnClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(adapterView.getId()==spinner1.getId()) {
            String text = adapterView.getItemAtPosition(i).toString();
            for(int k=0;k<Currency.currencies.length; k++){
             if (Currency.currencies[k].getCode().equals(text))
                   from=Currency.currencies[k];
            }

            Toast.makeText(this, "from: "+text, Toast.LENGTH_SHORT).show();
        }


        else if (adapterView.getId()==spinner2.getId()){
            String text = adapterView.getItemAtPosition(i).toString();
            for(int k=0;k<Currency.currencies.length; k++){
                if (Currency.currencies[k].getCode().equals(text))
                    to=Currency.currencies[k];
            }

            Toast.makeText(this, "to: "+text, Toast.LENGTH_SHORT).show();
        }

        }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        if(calcbtn==view){
            if(to==from&&!amount.getText().toString().equals(""))
                Toast.makeText(this,"The selected currencies are the same",Toast.LENGTH_LONG).show();
            else{
            Intent intent=new Intent(this,ResultActivity.class);
            if(amount.getText().toString().equals("")) {
                Toast.makeText(this,"there's an empty field!",Toast.LENGTH_LONG).show();
            }
            else {
                double result = (double) Double.parseDouble(amount.getText().toString()) * from.getValue() / to.getValue();
                Exchange exchange = new Exchange(from, to, Double.parseDouble(amount.getText().toString()), result);
                intent.putExtra("exchange", exchange);
                startActivity(intent);
            }
            }
        }
        else if(tablebtn==view){
            Intent intent=new Intent(this,TableCombination.class);
            startActivity(intent);
        }
    }
}