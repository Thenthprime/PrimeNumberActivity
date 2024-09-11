package edu.psu.swen888.primenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        mCheckIfPrimeButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                //Get the number from the EditText
                String numberString = mInputNumberEditText.getText().toString();
                int number = Integer.parseInt(numberString);

                //Check if the number is prime
                boolean isPrime = checkIfPrime(number);

                mResultTextView.setText(isPrime ? "is prime" : "is not prime");
                mResultTextView.setVisibility(View.VISIBLE);
            }
        });
    }


    public boolean checkIfPrime(int number){
        if(number <= 1) return false;

        for(int i = 2; i < Math.sqrt(number); i++){
            if(number %i == 0){
                return false;
            }
        }
        return true;
    }


}
