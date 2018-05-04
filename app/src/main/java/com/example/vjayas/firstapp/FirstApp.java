package com.example.vjayas.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstApp extends AppCompatActivity {
    private EditText Name;
    private EditText Passsword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app);

        Name =(EditText)findViewById(R.id.username);
        Passsword =(EditText)findViewById(R.id.password);
        button =(Button)findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Passsword.getText().toString());
            }
            });
    }

    private void validate(String username, String userpassword)
    {
        if ( (username.equals("Admin"))&& (userpassword.equals("1234"))){
        Intent intent = new Intent(FirstApp.this,SecondActivity.class);
        startActivity(intent);
    }
    }
}
