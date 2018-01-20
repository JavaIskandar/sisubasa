package com.example.iskandarjava.suratbebaslab;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void login(View v)
    {
        Intent intent = new Intent(Menu.this, Login.class);
        startActivity(intent);

    }

    public void pengajuan(View v)
    {
        Intent intent = new Intent(Menu.this, PengajuanActivity.class);
        startActivity(intent);
    }

    public void unduh(View v)
    {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(LAYOUT_INFLATER_SERVICE);
        //Inflate the view from a predefined XML layout
        View layout = inflater.inflate(R.layout.dialog_unduh,null);

        Button unduh = (Button)layout.findViewById(R.id.unduh);
        unduh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unduhFile();
            }
        });

        mBuilder.setView(layout);
        AlertDialog dialog= mBuilder.create();
        dialog.show();
    }

    public void unduhFile()
    {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(LAYOUT_INFLATER_SERVICE);
        //Inflate the view from a predefined XML layout
        View layout = inflater.inflate(R.layout.dialog_onproses,null);

        Button ok = (Button)layout.findViewById(R.id.ok);

        mBuilder.setView(layout);
        final AlertDialog dialog= mBuilder.create();
        dialog.show();
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }
}
