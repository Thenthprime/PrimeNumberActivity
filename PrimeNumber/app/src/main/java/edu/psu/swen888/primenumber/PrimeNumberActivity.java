package edu.psu.swen888.primenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeNumberActivity extends AppCompatActivity  {
    private TextView mResultTextView;
    private EditText mInputNumberEditText;
    private Button mCheckIfPrimeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_prime_number);

        mResultTextView = findViewById(R.id.result_text);
        mInputNumberEditText = findViewById(R.id.number_field);
        mCheckIfPrimeButton = findViewById(R.id.check_button);
    }


    public boolean checkIfPrime(int number){
        return true;
    }


}
