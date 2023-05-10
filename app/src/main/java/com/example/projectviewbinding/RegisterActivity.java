package com.example.projectviewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.projectviewbinding.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //membuat/menginput variabel / isi paket
                String email = binding.etRegemail.getText().toString().trim();
                String password = binding.etRegpassword.getText().toString().trim();

                //meamstikan data terisi tidak kosong
                if (TextUtils.isEmpty(email)) {
                    binding.etRegemail.setError("Email harus di isi");
                } else if (TextUtils.isEmpty(password)) {
                    binding.etRegpassword.setError("Password harus di isi");
                }else {
                    //mengirim data dari register activity ke registersuccess activity
                    Intent register = new Intent(RegisterActivity.this, RegistersuccessActivity.class);
                    register.putExtra("regemail", email);
                    register.putExtra("regpassword", password);
                    startActivity(register);
                    finish();
                }

            }
        });


    }
}