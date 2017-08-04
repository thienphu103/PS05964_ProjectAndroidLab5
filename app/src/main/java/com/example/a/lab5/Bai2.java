package com.example.a.lab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.example.a.lab5.R.id.txtTel;

public class Bai2 extends AppCompatActivity {
    EditText txttelnumber;
    Button btncall;
    Button btnclear;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button nums1;
    Button nums2;
    ImageButton del;
    String txttel;
    String delcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        txttelnumber = (EditText) findViewById(txtTel);
        btncall = (Button) findViewById(R.id.btnCallDial);
        btnclear = (Button) findViewById(R.id.btnCallClear);
        num0 = (Button) findViewById(R.id.number0);
        num1 = (Button) findViewById(R.id.number1);
        num2 = (Button) findViewById(R.id.number2);
        num3 = (Button) findViewById(R.id.number3);
        num4 = (Button) findViewById(R.id.number4);
        num5 = (Button) findViewById(R.id.number5);
        num6 = (Button) findViewById(R.id.number6);
        num7 = (Button) findViewById(R.id.number7);
        num8 = (Button) findViewById(R.id.number8);
        num9 = (Button) findViewById(R.id.number9);
        nums1 = (Button) findViewById(R.id.numberstar1);
        nums2 = (Button) findViewById(R.id.numberstar2);
        del = (ImageButton) findViewById(R.id.btnDelCall);

        txttel = txttelnumber.getText().toString();
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String tel = "tel:" + txttelnumber.getText().toString();
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(tel));
                    startActivity(intent);
                } catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), "API or Device Not Support "
                            + "\n" + "Show Error:" + ex.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txttelnumber.setText("");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txttelnumber.getText().toString().isEmpty()))
                    txttelnumber.setText(delcall = txttelnumber.getText().toString().
                            substring(0, txttelnumber.getText().toString().length() - 1));
                txttelnumber.setSelection(txttelnumber.getText().length());

            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num0);

            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num1);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num2);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num3);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num4);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num5);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num6);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num7);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num8);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(num9);
            }
        });
        nums1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(nums1);
            }
        });
        nums2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickNumber(nums2);
            }
        });


    }


    public void onClickNumber(Button b) {
        txttelnumber.append(txttel + b.getText().toString());

    }


}
