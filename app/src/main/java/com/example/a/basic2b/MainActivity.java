package com.example.a.basic2b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button eq;
    Button akrai;
    Button big;
    Button small;
    TextView tof;
    TextView num1;
    TextView num2;
    int c;
    int d;
    Random rnd=new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eq= (Button)findViewById(R.id.eq);
        big= (Button)findViewById(R.id.big);
        small= (Button)findViewById(R.id.small);
        akrai= (Button)findViewById(R.id.akrai);
        tof=(TextView)findViewById(R.id.tof);
        num1=(TextView)findViewById(R.id.num1);
        num2=(TextView)findViewById(R.id.num2);
    }

    public void akrai(View view) {
         c=rnd.nextInt(100);
         d=rnd.nextInt(100);
        num1.setText("number "+c);
        num2.setText("number "+d);
    }


    public void equ(View view) {
        if (c == d)
            tof.setText("True");
        else
            tof.setText("False");
    }

    public void bi(View view) {
        if(c>d)
            tof.setText("True");
        else
           tof.setText("False");
    }

    public void sma(View view) {
        if(c<d)
            tof.setText("True");
        else
            tof.setText("False");
    }
}

