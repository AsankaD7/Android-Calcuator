package com.example.asankad7.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button adButton,subButton,devideButton,mulButton;
    private EditText firstView,secondView,fin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        init();
    }

    private void init(){
        adButton = findViewById(R.id.buttonAddition);
        subButton= findViewById(R.id.buttonSubtraction);
        devideButton=findViewById(R.id.buttonDivide);
        mulButton=findViewById(R.id.buttonMultiply);
        firstView=findViewById(R.id.firstNumber);
        secondView=findViewById(R.id.secondNumber);
        fin= findViewById(R.id.textEP);

        adButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        devideButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        String num1 = firstView.getText().toString();
        String num2 = secondView.getText().toString();
        switch (view.getId()){
            case R.id.buttonAddition:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                fin.setText(String.valueOf(addition));
                break;

            case R.id.buttonSubtraction:
                int substraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                fin.setText(String.valueOf(substraction));
                break;

            case R.id.buttonDivide:
                int devide = Integer.parseInt(num1) / Integer.parseInt(num2);
                fin.setText(String.valueOf(devide));
                break;

            case R.id.buttonMultiply:
                int multi = Integer.parseInt(num1) * Integer.parseInt(num2);
                fin.setText(String.valueOf(multi));
                break;

        }
    }
}
