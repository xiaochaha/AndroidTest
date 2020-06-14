package com.avocado.work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.avocado.entity.Customer;
import com.avocado.entity.Food;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class IndexActivity extends Activity {
    Button button;
    Food food=null;
    private static final String TAG = "springboot";
    private String urlStr = "http://10.0.2.2:8080/food";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_layout);
        Intent loginIntent = getIntent();
        String loginMessage = loginIntent.getStringExtra("username");
//        button=(Button)findViewById(R.id.btn4);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IndexActivity.this,MainActivity.class);
//                setResult(RESULT_OK,intent);
//                finish();
//            }
//        });
        TextView textView = (TextView) findViewById(R.id.txv1);
        textView.setText(loginMessage);

        ImageView imageView = (ImageView) findViewById(R.id.imgDis1);
        showDis();

    }


    //显示折扣菜品
    private void showDis(){

        String url = urlStr + "/discountFoodList";
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();

        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d(TAG, "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d(TAG, response.protocol() + " " +response.code() + " " + response.message());
                Headers headers = response.headers();
                for (int i = 0; i < headers.size(); i++) {
                    Log.d(TAG, headers.name(i) + ":" + headers.value(i));
                }
                Log.d(TAG, "onResponse: " + response.body().string());
                food = JSON.parseObject(response.body().string(), Food.class);//解析json数据
                if (food == null) {
//                    Looper.prepare();
//                    Toast.makeText(IndexActivity.this, "用户名或者密码错误", Toast.LENGTH_SHORT).show();
//                    Looper.loop();
                } else {
//                    Intent intent = new Intent(IndexActivity.this, IndexActivity.class);
//                    Customer customer;
//                    intent.putExtra("username", customer.getcUsername());
//                    startActivityForResult(intent, Index);
                }


            }
        });
    }
}
