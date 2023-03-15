package com.example.medic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode);
    }

    public void startAuthBack(View v){
        Intent intent = new Intent(this, AuthActivity.class);
        startActivity(intent);
    }

    public void startPass(View v){
        Intent intent = new Intent(this, CreatePasswordActivity.class);
        startActivity(intent);
    }

}