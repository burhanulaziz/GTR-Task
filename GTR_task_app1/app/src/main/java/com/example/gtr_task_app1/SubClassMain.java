package com.example.gtr_task_app1;

import android.annotation.SuppressLint;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
public class SubClassMain {

        @SuppressLint("StaticFieldLeak")
        private static SubClassMain instance;
        private RequestQueue requestQueue;
        @SuppressLint("StaticFieldLeak")
        private static Context context;
        private SubClassMain(Context context) {
            SubClassMain.context = context;
            requestQueue = getRequestQueue();
        }

        public static synchronized SubClassMain getInstance(Context context) {
            if (instance == null) {
                instance = new SubClassMain(context);
            }
            return instance;
        }

        public RequestQueue getRequestQueue() {
            if (requestQueue == null) {
                requestQueue = Volley.newRequestQueue(context.getApplicationContext());
            }
            return requestQueue;
        }

        public <T> void addToRequestQueue(Request<T> request) {
            getRequestQueue().add(request);
        }

}
