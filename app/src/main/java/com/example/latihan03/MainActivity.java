package com.example.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Kenalkan view ke object di source code kita
        EditText etUsername = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btlogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(view -> {
            //mengosongkan EditText
            etUsername.setText("");
            etPassword.setText("");
            //meletakkan kursor di etUsername
            etUsername.requestFocus();
          });

        btlogin.setOnClickListener(v -> {
            //mengosongkan EditText
            etUsername.setText("");
            etPassword.setText("");
            //meletakkan
            etUsername.requestFocus();

          });
        }
    }

