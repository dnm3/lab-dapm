package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NumberActivity extends AppCompatActivity {
    EditText editText;
    Button btn2;
    double sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        editText = findViewById(R.id.editText);
        btn2 = findViewById(R.id.btn2);
 sa = Math.floor(Math.random() * 10) + 1;

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

          //      Toast.makeText(NumberActivity.this, sa+"", Toast.LENGTH_LONG).show();
                if (Double.parseDouble(editText.getText().toString()) == sa) {
                    Toast.makeText(NumberActivity.this, "AI CASTIGAT", Toast.LENGTH_LONG).show();
                    sa = Math.floor(Math.random() * 10) + 1;
                }else if(Double.parseDouble(editText.getText().toString()) > sa){
                    Toast.makeText(NumberActivity.this, "MAI MIC", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(NumberActivity.this, "MAI MARE", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
