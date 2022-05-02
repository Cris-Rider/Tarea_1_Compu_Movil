package com.example.tarea_1_compu_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void iraTareas(View view){
        Intent intent = new Intent( this, SegundaActividad.class);
        startActivity(intent);
    }
}