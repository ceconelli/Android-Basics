package com.example.gceconelli.secapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_generate;
    private TextView answer;
    private List<String> phrases = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.phrases.add("Se");
        this.phrases.add("A");
        this.phrases.add("lenda");
        this.phrases.add("dessa");
        this.phrases.add("paixao");
        this.phrases.add("faz");
        this.phrases.add("sorrir");
        this.phrases.add("ou");
        this.phrases.add("chorar");

        this.answer = (TextView) findViewById(R.id.tv_answer);
        this.btn_generate = (Button) findViewById(R.id.btn_generate);
        btn_generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.shuffle(phrases);
                answer.setText(phrases.get(0));
            }
        });


    }
}
