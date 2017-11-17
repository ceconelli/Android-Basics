package com.example.gceconelli.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView answer;
    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.answer = (TextView) findViewById(R.id.txtView_resposta);
        this.play = (Button) findViewById(R.id.btn_play);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Random rand = new Random();
                int randomNumber = rand.nextInt(10);
                answer.setText(""+randomNumber);
            }
        });
    }
}
