package com.example.a.lab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ContactPizza extends AppCompatActivity {
ImageButton btn;
    String tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_pizza);
        btn = (ImageButton) findViewById(R.id.btnCallPizza);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tel = "tel:"+"01239999999";
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(tel));
                    startActivity(intent);
                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"API or Device Not Support "
                            +"\n"+"Show Error:"+ex.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
