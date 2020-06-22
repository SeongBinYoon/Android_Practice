package com.example.board4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ViewActivity extends AppCompatActivity {

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

    }

}


