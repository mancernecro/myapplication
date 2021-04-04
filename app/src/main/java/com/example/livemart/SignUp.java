package com.example.livemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    Button callLogin;
    Button authButton;
    TextInputEditText mEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        callLogin=findViewById(R.id.login_screen);
        mEdit = (TextInputEditText)findViewById(R.id.phoneNo);
        authButton = findViewById(R.id.authenticate);
        callLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });
        authButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent=new Intent(SignUp.this, ReceiveSMS.class);
                  intent.putExtra("phone", mEdit.getText().toString());
                  startActivity(intent);
              }
        });
    }
}