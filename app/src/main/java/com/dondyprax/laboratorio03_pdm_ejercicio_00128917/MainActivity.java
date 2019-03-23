package com.dondyprax.laboratorio03_pdm_ejercicio_00128917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.dondyprax.laboratorio03_pdm_ejercicio_00128917.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword, etEmail;
    Button buttonSend;
    String username, password, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        etEmail = findViewById(R.id.et_email);
        buttonSend = findViewById(R.id.btn_send);

        buttonSend.setOnClickListener(v -> {
            username = etUsername.getText().toString();
            password = etPassword.getText().toString();
            email = etEmail.getText().toString();

            Intent mIntent = new Intent(MainActivity.this, ShareInfoActivity.class);
            Bundle mBundle =  new Bundle();

            mBundle.putString(AppConstant.USERNAME_KEY, username);
            mBundle.putString(AppConstant.PASSWORD_KEY, password);
            mBundle.putString(AppConstant.EMAIL_KEY, email);

            mIntent.putExtras(mBundle);
            startActivity(mIntent);
        });
    }
}
