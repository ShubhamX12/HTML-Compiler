package com.example.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.myapplication.R;

public class sa extends Activity {
WebView t;
EditText t1;
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sa);
        t=findViewById(R.id.b);
        t.setWebViewClient(new WebViewClient());
        t.loadUrl("https://www.javatpoint.com/html-tutorial");
        }
        
        public void onBackPressed()
        {
          if(t.canGoBack())
          {
            t.goBack();
          }
          else
          {
            super.onBackPressed();
          }
        }
        }