package com.example.projectviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.projectviewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String dataEmail = getIntent().getStringExtra("email");
        String dataPassword = getIntent().getStringExtra("password");

        binding.tvEmailmain.setText(dataEmail);
        binding.tvPasswordmain.setText(dataPassword);
    }
}