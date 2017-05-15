package com.example.aleix.calculadorasenzilla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ConfirmarBorrarActivity extends AppCompatActivity {

    String tag = "ConfirmarBorrar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_borrar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "Event onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "Event onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "Event onPause()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "Event onStop()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "Event onRestart()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "Event onDestroy()");

    }

    public void goToListaOperaciones(View view) {
        Intent inb1 = new Intent(ConfirmarBorrarActivity.this, HistorialActivity.class);
        startActivity(inb1);
    }
}