package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.myapplication.R;

public class MainActivity extends Activity {
WebView t;
EditText t1;
Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
t=findViewById(R.id.t);
t1=findViewById(R.id.t1);

t1.setText("<html>\n"
              +"\t<body> \n\n\n"
              
              +"\t</body>\n"
             +"</html>");
            t.setWebViewClient(new WebViewClient());
            t.getSettings().setJavaScriptEnabled(true);
           
}

public void ss(View v)
{

  
        String about =t1.getText().toString();
        t.loadData(about, "text/html", "UTF-8");
    }
    
public void sl(View v)
{Button b=(Button)v;


  String sk=b.getText().toString();
  if(sk.equals("javascript"))
  {
  
  t1.setText("<html>\n"
              +"\t<body>\n \t<script> \n\n\n\t\t"
             +"</script>"
              
              
              
              +"\t</body>\n"
             +"</html>");
    
  }
  else
  {
  t1.setText("<html>\n"
              +"\t<body> \n\n\n"
              
              +"\t</body>\n"
             +"</html>");
    
  }
}
}
