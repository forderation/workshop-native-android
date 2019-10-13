package com.muzaki.protypeonlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSignIn;
    private EditText edtUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignIn = findViewById(R.id.btn_login);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);
        btnSignIn.setOnClickListener(this);
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
        }
    }
}
