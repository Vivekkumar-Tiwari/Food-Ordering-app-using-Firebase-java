package com.example.food_ordering.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.food_ordering.R;
import com.example.food_ordering.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class LoginActivity extends BaseActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        setVariable();

    }

    private void setVariable() {
        binding.btnlogin.setOnClickListener(view -> {
            String Email = binding.email2.getText().toString();
            String Password = binding.password2.getText().toString();
            if(!Email.isEmpty() && !Password.isEmpty()){
                mAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(LoginActivity.this, task -> {
                    if(task.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "Login Successfully :", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }
                    else {
                        Toast.makeText(LoginActivity.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                    }
                });
            }else {
                Toast.makeText(LoginActivity.this, "Please fill the user name and password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}