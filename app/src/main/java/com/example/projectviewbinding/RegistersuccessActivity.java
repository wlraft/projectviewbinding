package com.example.projectviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.projectviewbinding.databinding.ActivityRegistersuccessBinding;

public class RegistersuccessActivity extends AppCompatActivity {

    ActivityRegistersuccessBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistersuccessBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLoginsuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menerima data dari register activity
                String email = getIntent().getStringExtra("regemail");
                String password = getIntent().getStringExtra("regpassword");

                //mengirim data yang diterima ke login activity
                Intent registersuccess = new Intent(RegistersuccessActivity.this, LoginActivity.class);
                registersuccess.putExtra("successemail", email);
                registersuccess.putExtra("successpassword", password);
                startActivity(registersuccess);
                finish();
            }
        });
    }
}