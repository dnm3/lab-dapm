package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.webkit.ConsoleMessage.MessageLevel.LOG;

public class MainActivity extends AppCompatActivity {
    private ListView carsList;
    CarAdapter carAdapter;
    private EditText addTxt;
    private Button addCarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCarBtn = findViewById(R.id.addBtn);
        addTxt = findViewById(R.id.addCar);


        //TODO 1
        carsList = findViewById(R.id.lv_list_cars);
        //TODO 2
        carAdapter = new CarAdapter(this);
        //TODO 4
        carAdapter.addCar("Audi",R.drawable.audi);
        carAdapter.addCar("BMW",R.drawable.bmw);
        carAdapter.addCar("Renault",R.drawable.renault);
        carAdapter.addCar("Volkswagen",R.drawable.vw);
        //TODO 3
        carsList.setAdapter(carAdapter);


        addCarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newCar = addTxt.getText().toString();
                carAdapter.addCar(newCar,R.drawable.car_icon);
                addTxt.setText("");
                carAdapter.notifyDataSetChanged();

            }
        });



    }
}

 class Car {
    String name;
    int imgResource;
}

class TagCar {
    TextView name;
    ImageView image;
}
