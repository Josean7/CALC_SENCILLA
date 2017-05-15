package com.example.aleix.calculadorasenzilla;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.*;

import java.util.ArrayList;
import java.util.List;

public class HistorialActivity extends AppCompatActivity {

    String tag = "Llista Operacions"; // tag que indica el ciclo de vida de la app

    private List<Operation> list;
    private List<String> l;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        /*Bundle extra = getIntent().getExtras();
        if (extra == null){
        }
        else{
            Operations ops = (Operations) extra.get("list");
            list = ops.getOpsList(); //obtener la lista
            System.out.println();
        }*/
        lv = (ListView) findViewById(R.id.listV);
        Intent i = getIntent();
        list = (List<Operation>) i.getSerializableExtra("list");
        l=new ArrayList<>();
        for (int j=0; j<list.size();j++){
            String item=list.get(j).toString();
            l.add(item);
        }
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, l);
        // Set The Adapter
        lv.setAdapter(arrayAdapter);

        // register onClickListener to handle click events on each item
        /*lv.setOnItemClickListener(new OnItemClickListener()
        {
            // argument position gives the index of item which is clicked
            public void onItemClick(AdapterView<?> arg0, View v,int position, long arg3)
            {
                String selectedmovie=list.get(position);
                Toast.makeText(getApplicationContext(), "Movie Selected : "+selectedmovie,   Toast.LENGTH_LONG).show();
            }
        });*/
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

    public void goToPantallaPrincipal(View view){
        Intent inb1 = new Intent(HistorialActivity.this, MainActivity.class);
        startActivity(inb1);
    }

    public void goToConfirmarBorrar(View view){
        Intent intent2 = new Intent(HistorialActivity.this, ConfirmarBorrarActivity.class);
        startActivity(intent2);
    }
}
