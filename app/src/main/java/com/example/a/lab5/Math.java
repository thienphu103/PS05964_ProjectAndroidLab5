package com.example.a.lab5;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Math extends AppCompatActivity {
    EditText txte1;
    TextView txtsum;
    Button btn;
    int a, b;
    int test = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math);
        txte1 = (EditText) findViewById(R.id.txtN);
        txte1.setHint("Input n");
        txtsum = (TextView) findViewById(R.id.txtSum);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(txte1.getText().toString());

                if (txte1.getText().toString().equals("")) {
                    txte1.setText("Enter Number not Empty . Please!!!");
                    txte1.setTextColor(Color.RED);
                    txte1.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public boolean onTouch(View v, MotionEvent event) {
                            txte1.setText("");
                            txte1.setTextColor(Color.BLACK);
                            return false;
                        }
                    });
                }
                Intent intent =new Intent(getApplicationContext(),Solve.class);
                Bundle mBundle = new Bundle();
                String profile =("S= " + a * (a + 1) / 2);
                mBundle.putString("math",profile );
                intent.putExtras(mBundle);
                startActivity(intent);

            }


        });

    }
}
