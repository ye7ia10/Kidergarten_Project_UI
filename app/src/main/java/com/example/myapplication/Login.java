package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public  class Login extends AppCompatActivity {

    private Button btn;
    private  EditText textView;
    private  EditText pass;
    private ImageView imageView;
    private  TextView tex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView = (EditText) findViewById(R.id.emaillogin);
        pass = (EditText) findViewById(R.id.passLogin);
        btn = (Button) findViewById(R.id.loginit);
        imageView = (ImageView) findViewById(R.id.lp);
        tex = (TextView)findViewById(R.id.ttp);

        String str= "";
            btn.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    if (textView.getText().toString().equals("admin")){
                        Intent intent = new Intent(Login.this, Admin.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    } else {
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    }
                }
            });


    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
