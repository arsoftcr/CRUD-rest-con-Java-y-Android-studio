package com.example.itco.rest;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RequestQueue queue;


TextView text1;

ListView lista;


 private String cadena="";

List<Respuesta> jsons;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView)findViewById(R.id.textView2);

        //text1.setVisibility(View.INVISIBLE);

        lista=(ListView)findViewById(R.id.list_view);




      get();



    }



    public void get() {
        queue = Volley.newRequestQueue(this);
        String url="https://androidfe.herokuapp.com/items";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                            Log.i("sizejson","sizejson");
                            meterjson(response);
                        meterjson(response);
                        meterjson(response);meterjson(response);meterjson(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        text1.setText(error.toString());
                    }
                }
        );

        queue.add(jsonArrayRequest);



    }

    private void meterjson(JSONArray json) {
        ArrayList<String> lis=new ArrayList<String>();
        for ( int a=0;a<json.length();a++){
            try {
                lis.add(json.getJSONObject(a).getString("Descripcion"));
            } catch (JSONException e) {
               text1.setText(e.toString());
            }
        }

        ArrayAdapter<String> adap=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,lis);
        lista.setAdapter(adap);

    }


}








