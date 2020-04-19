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

public class main extends Activity {
WebView t;
EditText t1;
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        }
        
    public void sp(View v)
    {
      Intent i=new Intent(this,MainActivity.class);
      startActivity(i);
    }
    public void sk(View v)
    {
      Intent i=new Intent(this,sa.class);
      startActivity(i);
    }
        }