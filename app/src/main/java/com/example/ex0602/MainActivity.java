package com.example.ex0602;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.mainbutton);
        btn.setOnClickListener(new View.OnClickListener()
        {
            int clicks =0;
            public void onClick(View view) {
                clicks++;
                btn.setText("This is a click number: " + clicks);
                if (clicks%7 == 0 || clicks%10 == 7)
                {
                    btn.setText("BOOM!");
                }
            }
        });
    }



}