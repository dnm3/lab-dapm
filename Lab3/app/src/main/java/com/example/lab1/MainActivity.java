    package com.example.lab1;

    import androidx.annotation.RequiresApi;
    import androidx.appcompat.app.AppCompatActivity;

    import android.app.KeyguardManager;
    import android.content.ContentResolver;
    import android.content.Context;
    import android.content.Intent;
    import android.os.Build;
    import android.os.Bundle;
    import android.provider.Settings;
    import android.util.Log;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        EditText e1;
        EditText e2;
        Button btn;
        Context context;

        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            context = getApplicationContext();
            e1 = findViewById(R.id.edit1);
            e2 = findViewById(R.id.edit2);
            btn = findViewById(R.id.btn);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(context, NumberActivity.class);
                    myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                    if(e1.getText().toString().equals("danielmiu") && e2.getText().toString().equals("1234")){

                        Log.d("blabla", "bla");
                    context.startActivity(myIntent);}
                }
            });



        }

    }
