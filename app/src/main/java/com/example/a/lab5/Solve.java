package com.example.a.lab5;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Solve extends AppCompatActivity {
    TextView solve;
String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);
        solve=(TextView) findViewById(R.id.txtsovle);
        final Intent intent = getIntent();
        Intent mIntent = new Intent(this,Math.class);
        mIntent.putExtra("profile", value);
        value = getIntent().getExtras().getString("math");
        solve.setText("Solve:"+"\n" + value + "");
        solve.setTextSize(20);
        solve.setTextColor(Color.BLUE);
    }
}
