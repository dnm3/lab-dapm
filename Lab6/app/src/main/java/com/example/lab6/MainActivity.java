package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button saveBtn;
    Button nextBtn;
    EditText editText;
    MySharedPreference preference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveBtn = findViewById(R.id.saveBtn);
        nextBtn = findViewById(R.id.nextBtn);
        editText = findViewById(R.id.editTxt);
        preference = new MySharedPreference(getApplicationContext());


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();
                if(text != null){
                    Log.e("text",text);
                    preference.save(text);
                    editText.setText("");
                    Toast.makeText(getApplicationContext(),"Data text has been saved! :)", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getApplicationContext(),"Field empty!  Write something! :(", Toast.LENGTH_SHORT).show();

                 }
            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("string","Primitive - mainActivity" );
                startActivity(i);
            }
        });


    }
}
