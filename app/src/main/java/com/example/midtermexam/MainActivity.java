package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAbli = (Button) findViewById(R.id.btnOpen);

        btnAbli.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, midterm.class);
            startActivity(intent);
            Toast toast = Toast.makeText(MainActivity.this, "Zedric Marc D. Tabinas", Toast.LENGTH_SHORT);
            toast.show();
        });


    }
}