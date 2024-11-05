package com.example.tugas_bp3_m3_handy_nanda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class form_register extends AppCompatActivity {

    // Deklarasi EditText dan Button
    private EditText etEmail, etUsername, etPassword;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_register);

        etEmail = findViewById(R.id.Email);
        etUsername = findViewById(R.id.Username);
        etPassword = findViewById(R.id.Password);
        btnRegister = findViewById(R.id.button2);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString().trim();
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(form_register.this, "Semua field harus diisi",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(form_register.this, "Registrasi berhasil!",
                            Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(form_register.this,
                                    form_login.class);
                        startActivity(intent);
                }
            }
        });
    }
}
