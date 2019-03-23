package com.dondyprax.laboratorio03_pdm_ejercicio_00128917;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.dondyprax.laboratorio03_pdm_ejercicio_00128917.utils.AppConstant;

public class ShareInfoActivity extends AppCompatActivity {

    TextView tvUsername, tvPassword, tvEmail;
    Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_info);

        tvUsername = findViewById(R.id.tv_share_username);
        tvPassword = findViewById(R.id.tv_share_password);
        tvEmail = findViewById(R.id.tv_share_email);
        shareButton = findViewById(R.id.action_share_button);

        Intent mIntent = getIntent();

        if(mIntent != null) {
            tvUsername.setText(mIntent.getStringExtra(AppConstant.USERNAME_KEY));
            tvPassword.setText(mIntent.getStringExtra(AppConstant.PASSWORD_KEY));
            tvEmail.setText(mIntent.getStringExtra(AppConstant.EMAIL_KEY));
        }

        shareButton.setOnClickListener(v -> {
            Intent mIntentShare = new Intent();
            Bundle mBundle = new Bundle();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");

            mBundle.putString(AppConstant.USERNAME_KEY, tvUsername.getText().toString());
            mBundle.putString(AppConstant.PASSWORD_KEY, tvPassword.getText().toString());
            mBundle.putString(AppConstant.EMAIL_KEY, tvEmail.getText().toString());

            mIntentShare.putExtras(mBundle);
            startActivity(mIntentShare);
        });

    }
}
