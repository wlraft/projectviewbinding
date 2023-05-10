package com.example.projectviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.projectviewbinding.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent login = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(login);

            }
        });

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logemail = getIntent().getStringExtra("successemail");
                String logpassword = getIntent().getStringExtra("successpassword");

                if (TextUtils.isEmpty(logemail)) {
                    binding.etEmail.setError("nama harus diisi");
                }Intent login = new Intent(LoginActivity.this, MainActivity.class);
                login.putExtra("email", logemail);
                login.putExtra("password", logpassword);
                startActivity(login);
            }
        });
    }


}