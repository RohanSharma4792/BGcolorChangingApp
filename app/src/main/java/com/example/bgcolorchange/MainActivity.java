package com.example.bgcolorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3;

    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        v = this.getWindow().getDecorView();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            v.setBackgroundResource(R.color.red);
                Toast.makeText(MainActivity.this, "red", Toast.LENGTH_SHORT).show();
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setBackgroundResource(R.color.green);
                Toast.makeText(MainActivity.this, "green", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setBackgroundResource(R.color.blue);
                Toast.makeText(MainActivity.this, "blue", Toast.LENGTH_SHORT).show();
            }
        });
    }
}