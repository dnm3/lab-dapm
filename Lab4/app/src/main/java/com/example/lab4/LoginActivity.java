package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    Button btn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = getApplicationContext();
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(context, MainActivity.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                if(e1.getText().toString().equals("danielmiu") && e2.getText().toString().equals("1234")){

                    Log.d("blabla", "bla");
                    context.startActivity(myIntent);}
            }
        });
    }
}
