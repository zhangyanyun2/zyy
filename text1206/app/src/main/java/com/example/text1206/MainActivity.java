package com.example.text1206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bnt_login;
    EditText et_username,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnt_login=findViewById(R.id.bnt_login);
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);
        bnt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent( MainActivity.this,MainActivity2.class);
                intent.putExtra( "username",et_username.getText().toString());
                intent.putExtra( "password",et_password.getText().toString());
                startActivity(intent);

            }
        });
    }
}