package com.example.text_to_speech.LEVELS;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.text_to_speech.ALPHABETS.Level1;
import com.example.text_to_speech.NUMBERS.SingleNumber;
import com.example.text_to_speech.QUIZ.Quiz_alph;
import com.example.text_to_speech.R;

public class Levels extends AppCompatActivity {

    Button lvlone,lvltwo,lvlthree ,quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);


        lvlone = (Button) findViewById(R.id.lvlone);
        lvltwo = (Button) findViewById(R.id.lvltwo);
        lvlthree = (Button) findViewById(R.id.lvlthree);
        quiz = (Button) findViewById(R.id.quiz);

        quiz.setOnClickListener(v -> {

            startActivity(new Intent(this, Quiz_alph.class));
        });

        lvlone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Levels.this, Level1.class);
                startActivity(intent);
            }
        });

        lvlthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Levels.this, Level3.class);
                startActivity(intent);
            }
        });

        lvltwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Levels.this, Level2.class);
                startActivity(intent);
            }
        });

    }



}