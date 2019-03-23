package com.dondyprax.laboratorio03_pdm_ejercicio_00128917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dondyprax.laboratorio03_pdm_ejercicio_00128917.utils.AppConstant;

public class ReceiveInfoActivity extends AppCompatActivity {

    TextView mUsername, mPassword, mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_info);

        mUsername = findViewById(R.id.tv_receive_username);
        mPassword = findViewById(R.id.tv_receive_password);
        mEmail = findViewById(R.id.tv_receive_email);

        Intent mIntent = getIntent();
        Bundle mBundle = mIntent.getExtras();

        if(mIntent != null) {
            mUsername.setText(mBundle.getString(AppConstant.USERNAME_KEY));
            mPassword.setText(mBundle.getString(AppConstant.PASSWORD_KEY));
            mEmail.setText(mBundle.getString(AppConstant.EMAIL_KEY));
        }
    }


}
