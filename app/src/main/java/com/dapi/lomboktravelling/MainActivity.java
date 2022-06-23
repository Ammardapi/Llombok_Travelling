package com.dapi.lomboktravelling;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser user;
    String TAG = "LOGIN ACTIVITY";


    private void goToMainApp() {
        Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // User is signed in
            Log.w("USER", user.getEmail());
            goToMainApp();

        } else {
            // No user is signed in
        }

        EditText etEmail = findViewById(R.id.et_email);
        EditText etPassword = findViewById(R.id.et_Password);
        Button btnLogin = findViewById(R.id.btn_login);
        TextView tvDaftar = findViewById(R.id.tv_daftar);

        tvDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.w("USER", user.getEmail());
                            goToMainApp();
                        } else {
                            Toast.makeText(MainActivity.this, "Login gagal", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }
        });
    }
}