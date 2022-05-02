package com.example.tarea_1_compu_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
    }
    public void iraCalendario(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}