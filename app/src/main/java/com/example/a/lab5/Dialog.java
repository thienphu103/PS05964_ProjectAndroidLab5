package com.example.a.lab5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class Dialog extends AppCompatActivity {
    Button btn;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }



    public void CustomDialog() {
        final android.app.Dialog dialog = new android.app.Dialog(Dialog.this);
        dialog.setTitle("Custom Dialog");
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
        btn = (Button) dialog.findViewById(R.id.button);
        txt = (EditText) dialog.findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog.this.setTitle(txt.getText().toString());
                dialog.dismiss();
            }

        });
        dialog.show();
    }
}
