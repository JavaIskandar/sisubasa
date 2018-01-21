package com.example.iskandarjava.suratbebaslab;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void login(View v) {
        Intent intent = new Intent(Menu.this, Login.class);
        startActivity(intent);

//        final TextView mTextView = (TextView) findViewById(R.id.text);
//
//// Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url ="http://sisubasa.herokuapp.com/mobile/mahasiswa/get/1";
//
//// Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//
//                        String in="";
//                        try
//                        {
//                            JSONArray reader= new JSONArray(response.toString());
//
//                            Toast.makeText(getApplicationContext(),""+reader.length(),Toast.LENGTH_SHORT).show();
//
//                            JSONObject mhs = reader.getJSONObject(0);
//                            mTextView.setText("Response is: "+ mhs.getString("nama"));
//                        }
//                        catch (JSONException e)
//                        {
//                            e.printStackTrace();
//                        }
//
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                mTextView.setText("That didn't work!");
//            }
//        });
//// Add the request to the RequestQueue.
//        queue.add(stringRequest);

    }

    public void pengajuan(View v)
    {
        Intent intent = new Intent(Menu.this, PengajuanActivity.class);
        startActivity(intent);
    }

    public void unduh(View v)
    {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
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
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
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
