package com.example.gtr_task_app1;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GTR Task1");


        String url = "https://pqstec.com/invoiceapps/Values/GetProductList";
        Volley.newRequestQueue(this);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                response -> Log.d("Response", response.toString()),
                error -> Log.e("Error", error.toString())
        ) {
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiI3OCIsIkN1glibcRDb21JZCI6IjEiLCJuYmYiOjE2NzYwOTMwNjEsImV4cCI6MTY3NjY5Nzg2MSwiaWF0IjoxNjc2MDkzMDYxfQ.mTgT0m9L9VZ1L2d41IGTVFoCpnoIQdexTxBjaZEnBGweyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOiI3OCIsIkN1cnJlbnRDb21JZCI6IjEiLCJuYmYiOjE2NzYwOTMwNjEsImV4cCI6MTY3NjY5Nzg2MSwiaWF0IjoxNjc2MDkzMDYxfQ.mTgT0m9L9VZ1L2d41IGTVFoCpnoIQdexTxBjaZEnBGw");
                return headers;
            }
        };

       // SubClassMain.getInstance(createDisplayContext()).addToRequestQueue(request);
    }

    private Context createDisplayContext() {
        return getContext();
    }

    @Nullable
    private static Context getContext() {
        return null;
    }
}