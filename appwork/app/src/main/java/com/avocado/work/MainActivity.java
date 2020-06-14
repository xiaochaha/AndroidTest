package com.avocado.work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.avocado.entity.Customer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends Activity {
    Customer customer =null;
    private EditText username,password;
    private Button loginBtn;
    private static final String TAG = "springboot";
    private String urlStr = "http://10.0.2.2:8080/customer";
    private static  final int Index=0;
    //private static  final int Moon=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        loginBtn=(Button)findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();

            }
        });
    }

//    private void getData(){
//        String url = urlStr+"login";
//        OkHttpClient okHttpClient = new OkHttpClient();
//        final Request request = new Request.Builder()
//                .url(url)
//                .get()//默认就是GET请求，可以不写
//                .build();
//        Call call = okHttpClient.newCall(request);
//        call.enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.d(TAG, "onFailure: "+ e.getMessage());
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                Log.d(TAG, "onResponse: " + response.body().string());
//            }
//        });
//    }

    //用户登录
    private void login(){

        String url = urlStr+"/login";
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()//post请求
                .add("username",username.getText().toString())
                .add("password",password.getText().toString())
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
//                Log.d(TAG, response.protocol() + " " +response.code() + " " + response.message());
//                Headers headers = response.headers();
//                for (int i = 0; i < headers.size(); i++) {
//                    Log.d(TAG, headers.name(i) + ":" + headers.value(i));
//                }
//                Log.d(TAG, "onResponse: " + response.body().string());
                customer= JSON.parseObject(response.body().string(),Customer.class);//解析json数据
                if (customer==null){
                    Looper.prepare();
                    Toast.makeText(MainActivity.this,"用户名或者密码错误",Toast.LENGTH_SHORT).show();
                    Looper.loop();
                }else {
                    Intent intent=new Intent(MainActivity.this,IndexActivity.class);
                    intent.putExtra("username",customer.getcUsername());
                    startActivityForResult(intent,Index);
                }



            }
        });
    }



}
