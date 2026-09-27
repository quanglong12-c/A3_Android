package com.example.a3android;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvStudent = findViewById(R.id.tvStudent);
        tvStudent.setText(getString(R.string.student_info));

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v ->
                Snackbar.make(v, R.string.login_success, Snackbar.LENGTH_SHORT).show()
        );
    }
}
