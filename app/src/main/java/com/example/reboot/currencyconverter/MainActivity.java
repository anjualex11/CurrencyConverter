package com.example.reboot.currencyconverter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void CON(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);
        String usd=editText.getText().toString();
        int i=Integer.parseInt(usd);
        Toast.makeText(this,i*65+"",Toast.LENGTH_LONG).show();
    }
}

