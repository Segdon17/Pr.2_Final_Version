package com.example.pr2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String fullName = intent.getStringExtra("fullName");
        String groupNumber = intent.getStringExtra("groupNumber");
        int age = intent.getIntExtra("age", 0);
        double grade = intent.getDoubleExtra("grade", 0.0);

        TextView tvFullName = findViewById(R.id.tvFullName);
        TextView tvGroupNumber = findViewById(R.id.tvGroupNumber);
        TextView tvAge = findViewById(R.id.tvAge);
        TextView tvGrade = findViewById(R.id.tvGrade);

        tvFullName.setText("Name: " + fullName);
        tvGroupNumber.setText("Group: " + groupNumber);
        tvAge.setText("Age: " + age);
        tvGrade.setText(getString(R.string.grade) + grade);
    }

}