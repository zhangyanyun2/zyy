package com.example.text1206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview=findViewById(R.id.textView4);
        Intent intent=getIntent();
        String username=intent.getStringExtra( "username");
        String password=intent.getStringExtra( "password");
        textview.setText("获取到的值：\n用户名名"+username+"\n密码："+password);
    }
}