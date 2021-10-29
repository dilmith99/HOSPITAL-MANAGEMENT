package com.example.iproject;

import com.braintreepayments.cardform.view.CardForm;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ok = findViewById(R.id.btnNext);

        final CardForm cardForm = (CardForm) findViewById(R.id.card_form);
        cardForm.cardRequired(true)
                .expirationRequired(true)
                .cvvRequired(true)
                .cardholderName(CardForm.FIELD_REQUIRED)
                .postalCodeRequired(true)
                .mobileNumberRequired(true)
                .mobileNumberExplanation("SMS is required on this number")
                .actionLabel("Purchase")
                .setup(MainActivity.this);

            ok.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    if(cardForm.isValid()){

                        //Send data to a bank

                    }else
                        {
                        Toast.makeText(MainActivity.this,"Please Complete the Form", Toast.LENGTH_LONG).show();
                        }

                }
            });









    }
}
