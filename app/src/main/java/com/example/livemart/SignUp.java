package com.example.livemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import com.google.android.material.textfield.TextInputEditText;

public class SignUp extends AppCompatActivity {

    private Button callLogin;
    private Button authButton;
    private TextInputEditText mEdit;
    private TextInputEditText fullName;
    private TextInputEditText userName;
    private TextInputEditText email;
    private TextInputEditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        callLogin=findViewById(R.id.login_screen);
        mEdit = (TextInputEditText)findViewById(R.id.phoneNo);
        authButton = findViewById(R.id.authenticate);
        fullName = findViewById(R.id.name);
        userName = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
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
                  intent.putExtra("name",fullName.getText().toString());
                  intent.putExtra("username", userName.getText().toString());
                  intent.putExtra("email", email.getText().toString());
                  intent.putExtra("password", password.getText().toString());
                  intent.putExtra("purpose", "signup");
                  startActivity(intent);
              }
        });
    }
}