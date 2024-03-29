package com.muzaki.protypeonlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnSignIn = findViewById(R.id.btn_login);
        Button btnSignUp = findViewById(R.id.btn_sign_up);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnSignIn.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id==R.id.btn_login){
            if(edtUsername.getText().toString().isEmpty()){
                edtUsername.setError("Username tidak boleh kosong");
            }
            if(edtPassword.getText().toString().isEmpty()){
                edtPassword.setError("Password tidak boleh kosong");
            }
        }else if(id==R.id.btn_sign_up){
            startActivity(new Intent(this,RegisterActivity.class));
        }
    }
}
