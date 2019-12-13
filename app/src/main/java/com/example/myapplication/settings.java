package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button btn = (Button) findViewById(R.id.update);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(settings.this, "Your data updated successfully", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(settings.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
