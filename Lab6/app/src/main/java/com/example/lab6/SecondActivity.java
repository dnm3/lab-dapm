package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    MySharedPreference preference;
    TextView textView;
    TextView bonusTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        preference = new MySharedPreference(getApplicationContext());

        textView = findViewById(R.id.textView);
        textView.setText("Text saved message: " + preference.getValue());

        bonusTextView = findViewById(R.id.bonusTextView);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null) {
            String getString= extras.getString("string");
            bonusTextView.setText("MSG: " + getString);

        }
    }
}
