package com.ahmadkhan.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextCashInHand = findViewById(R.id.editTextCashInHand);
        EditText editTextSavings = findViewById(R.id.editTextSavings);
        EditText editTextGoldSilver = findViewById(R.id.editTextGoldSilver);
        EditText editTextLoans = findViewById(R.id.editTextLoans);

        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        TextView textViewPayableZakat = findViewById(R.id.textViewPayableZakat);
    }
}