package com.example.pr2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RRR";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "error in onStart");
        Log.w(TAG,"warning in onStart");
        Log.i("IKBO-66-23","info in onStart");
        Log.d("IKBO-66-23","debug in onStart");
        Log.v("IKBO-66-23","verbose in onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "IKBO-66-23", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnProgrammatically = findViewById(R.id.btnGoToSecondActivity);


        btnProgrammatically.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("fullName", "Gordillo Ariza");
                intent.putExtra("groupNumber", "IKBO 66-23");
                intent.putExtra("age", 20);
                intent.putExtra("grade", 5.0);
                startActivity(intent);

            }
        });

    }
    
    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
