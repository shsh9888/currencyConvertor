package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvertButtonClicked(View view) {

        EditText dollarsEditText = findViewById(R.id.currency);
        Double dollars = Double.parseDouble(dollarsEditText.getText().toString());
        Double pounds = dollars * 0.86;

        Toast.makeText(MainActivity.this, pounds.toString() + " pounds", Toast.LENGTH_LONG).show();

        Log.i("Conversion:", pounds.toString());
    }
}
