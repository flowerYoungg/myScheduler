package com.example.myscheduler;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.LoginButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // 인텐트 객체 생성
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                // 새로운 액티비티 시작
                startActivity(intent);
            }
        });
    }
}
