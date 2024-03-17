package com.example.food_ordering.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.food_ordering.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class BaseActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseDatabase database;
    public String TAG = "UIliver";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        mAuth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        getWindow().setStatusBarColor(getResources().getColor(R.color.white));
    }
}