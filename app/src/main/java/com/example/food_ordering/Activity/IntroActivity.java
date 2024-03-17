package com.example.food_ordering.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.food_ordering.R;
import com.example.food_ordering.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {

    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setVariable();
        getWindow().setStatusBarColor(Color.parseColor("#FFE4B9"));
    }

    private void setVariable() {
        binding.login.setOnClickListener(view -> {
        if(mAuth.getCurrentUser()!= null){
            startActivity(new Intent(IntroActivity.this, MainActivity.class));
        }else {
            startActivity(new Intent(IntroActivity.this,LoginActivity.class));
        }
        });
        binding.signup.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this,SignupActivity.class)));
    }
}