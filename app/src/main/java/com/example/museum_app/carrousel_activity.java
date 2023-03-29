package com.example.museum_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class carrousel_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrousel_activity);
    }

    public void handleSelection(View view) {
        Toast.makeText(this, "Selectionner", Toast.LENGTH_SHORT).show();
    }
}
