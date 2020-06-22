package com.example.board4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ViewActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Intent intent = getIntent();
        TextView title = (TextView)findViewById(R.id.titleview);
        TextView writer = (TextView)findViewById(R.id.writerview);
        TextView date = (TextView)findViewById(R.id.dateview);
        TextView content = (TextView)findViewById(R.id.contentview);

        title.setText(intent.getStringExtra("title"));
        writer.setText(intent.getStringExtra("writer"));
        date.setText(intent.getStringExtra("date"));
        content.setText(intent.getStringExtra("content"));

        //버튼 선언, xml에서 가져오기
        final Button btn_like = (Button) findViewById(R.id.btn_like);

        btn_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                Toast.makeText(getApplicationContext(), count + "명이 좋아요를 눌렀습니다", Toast.LENGTH_SHORT).show();


            }
        });

    }

}


