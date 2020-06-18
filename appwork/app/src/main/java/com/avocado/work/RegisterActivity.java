package com.avocado.work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.alibaba.fastjson.JSON;
import com.avocado.entity.Customer;

import java.io.IOException;
import java.util.Date;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RegisterActivity extends Activity {
    //Customer customer;
    private EditText username,password,repassword;
    private Button regSummitBtn,regReturnBtn;
    private static final String TAG = "springboot";
    private String urlStr = "http://10.0.2.2:8080/customer";
    private static  final int index1=2;
    private static  final int index2=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        username=(EditText)findViewById(R.id.usernameReg);
        password=(EditText)findViewById(R.id.passwordReg);
        repassword=(EditText)findViewById(R.id.repasswordReg);
        regSummitBtn=(Button)findViewById(R.id.regSummitBtn);
        regReturnBtn=(Button)findViewById(R.id.regReturnBtn);


        regSummitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        regReturnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                //startActivityForResult(intent,index2);
            }
        });
    }


    //用户注册
    private void register(){
        Customer customer=new Customer(username.getText().toString(),password.getText().toString(),"0","0",new Date(),0);
        String jsonOutput= JSON.toJSONString(customer);
        System.out.println(jsonOutput);
        String url = urlStr+"/register";
        OkHttpClient okHttpClient = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody = new FormBody.Builder()//post请求
                .add("customer",jsonOutput)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(mediaType,jsonOutput))
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if (response.body().string().equals(0)){
//                    Looper.prepare();
//                    Toast.makeText(RegisterActivity.this,"注册失败，输入正确的注册信息",Toast.LENGTH_SHORT).show();
//                    Looper.loop();
                }else {
                    Intent intent=new Intent(RegisterActivity.this,IndexActivity.class);
                    //startActivityForResult(intent,index1);
                }



            }


        });
    }
}
