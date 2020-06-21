package com.example.board4;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViewActivity extends AppCompatActivity {
//    //데이터를 받아올 php 주소
//    String url = "http://kimmessi.dothome.co.kr/BBSList.php";
//    //데이터를 보기 위한 textview 변수
//    TextView tv;
//    //php를 읽어올 때 사용할 변수
//    public GettingPHP gPHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


    }
}
//        //php를 읽어올 때 사용할 변수 선언
//        gPHP = new GettingPHP();
//        tv = (TextView)findViewById(R.id.titleview);
//        gPHP.execute(url);
//    }
//
//    //PHP를 받아오는 함수
//   class GettingPHP extends AsyncTask<String,Integer,String>{
//
//        //PHP에서 데이터를 읽어오는 함수
//        @Override
//        protected String doInBackground(String... params){
//            StringBuilder jsonHtml = new StringBuilder();
//            try {
//                URL phpUrl = new URL(params[0]);
//                HttpURLConnection conn = (HttpURLConnection)phpUrl.openConnection();
//
//                if ( conn != null ) {
//                    conn.setConnectTimeout(10000);
//                    conn.setUseCaches(false);
//
//                    if ( conn.getResponseCode() == HttpURLConnection.HTTP_OK ) {
//                        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//                        while ( true ) {
//                            String line = br.readLine();
//                            if ( line == null )
//                                break;
//                            jsonHtml.append(line + "\n");
//                        }
//                        br.close();
//                    }
//                    conn.disconnect();
//                }
//            } catch ( Exception e ) {
//                e.printStackTrace();
//            }
//            return jsonHtml.toString();
//        }
//
//        //가져온 데이터를 이용해 실행
//        protected void onPostExecute(String str) {
//            try {
//                // PHP에서 받아온 JSON 데이터를 JSON오브젝트로 변환
//                JSONObject jObject = new JSONObject(str);
//                // results라는 key는 JSON배열로 되어있음
//                JSONArray results = jObject.getJSONArray("results");
//                String zz = "";
//                zz += "Status : " + jObject.get("status");
//                zz += "\n";
//                zz += "Number of results : " + jObject.get("num_result");
//                zz += "\n";
//                zz += "Results : \n";
//
//                for ( int i = 0; i < results.length(); ++i ) {
//                    JSONObject temp = results.getJSONObject(i);
//                    zz += "\tdoc_idx : " + temp.get("doc_idx");
//                    zz += "\tmember_idx : " + temp.get("member_idx");
//                    zz += "\tsubject : " + temp.get("subject");
//                    zz += "\tcontent : " + temp.get("content");
//                    zz += "\treg_date : " + temp.get("reg_date");
//                    zz += "\n\t--------------------------------------------\n";
//                }
//                tv.setText(zz);
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }

