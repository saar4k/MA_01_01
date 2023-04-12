package com.example.a1uebung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textView1:
                Log.d("MainActivity", "Textfeld 1 wurde ausgewählt");
                break;
            case R.id.textView2:
                Log.d("MainActivity", "Textfeld 2 wurde ausgewählt");
                break;
            case R.id.textView3:
                Log.d("MainActivity", "Textfeld 3 wurde ausgewählt");
                break;
            case R.id.textView4:
                Log.d("MainActivity", "Textfeld 4 wurde ausgewählt");
                break;
        }
    }
}