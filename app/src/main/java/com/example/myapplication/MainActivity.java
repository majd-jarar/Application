package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("majd");
        System.out.println("majd");
        System.out.println("zain");
        System.out.println("zain");
        System.out.println("zain");
        System.out.println("zain");

        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Main", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Activity", Toast.LENGTH_SHORT).show();

    }
}