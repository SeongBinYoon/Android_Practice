package com.example.board4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //받아올 data(사용자가 쓴 글)
    List<String> data = new ArrayList<>();

    //test for listview
//    static final String[] LIST_POST = {
//            "post1 - Paul - 2020/6/6",
//            "post2 - Mike - 2020/6/7",
//            "post3 - Sarah - 2020/6/8"
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //xml에서 담아온 listview 정의
        ListView listView = (ListView) findViewById(R.id.listview_posts);
        //adapter 선언: 리스트 방식, LIST_POST의 정보를 adapter에
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        //listview와 adapter를 연결
        listView.setAdapter(adapter);

        //listview 테스트
        data.add("post1 - Paul - 2020/6/6");
        data.add("post2 - Mike - 2020/6/7");
        data.add("post3 - Sarah - 2020/6/8");
        //상태 저장
        adapter.notifyDataSetChanged();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //list를 눌렀을 때 화면 전환 -> 게시글 보여주기
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "게시글", Toast.LENGTH_SHORT).show();
            }
        });



        //버튼 선언, xml에서 가져오기
        Button btn_write = (Button) findViewById(R.id.btn_write);

        btn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //버튼을 눌렀을 때 화면 전환 -> 작성페이지로
                //fill blank -> Activity name.class
                Intent intent = new Intent(MainActivity.this, WriteActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"새 게시글 작성",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
