package com.avocado.work;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avocado.entity.Category;
import com.avocado.entity.Customer;
import com.avocado.entity.Food;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class IndexActivity extends Activity {
    Button button1,button2;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private static final String TAG = "springboot";
    private String urlStr = "http://10.0.2.2:8080/food";
    private static final int IndexToMenu = 5;
    private static final int IndexToOrder = 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_layout);
        Intent loginIntent = getIntent();
        final int loginMessage = loginIntent.getIntExtra("cId",0);
        TextView textView = (TextView) findViewById(R.id.txv1);
        textView.setText(loginMessage);

        imageView1=(ImageView)findViewById(R.id.imgRec1);
        imageView2=(ImageView)findViewById(R.id.imgRec2);
        imageView3=(ImageView)findViewById(R.id.imgRec3);
        imageView4=(ImageView)findViewById(R.id.imgDis1);
        imageView5=(ImageView)findViewById(R.id.imgDis2);
        imageView6=(ImageView)findViewById(R.id.imgDis3);

        showImgDis();
        showImgRec();

        button1=(Button) findViewById(R.id.indexToMenu);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, MenuActivity.class);
                intent.putExtra("cId", loginMessage);
                startActivityForResult(intent, IndexToMenu);
            }
        });
        button2=(Button) findViewById(R.id.indexToOrder);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IndexActivity.this, OrderActivity.class);
                intent.putExtra("cId", loginMessage);
                startActivityForResult(intent, IndexToOrder);
            }
        });
    }

    //显示推荐菜品
    private void showImgRec(){

        final String url = urlStr + "/recommendFoodList";
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
                //System.out.println(response.body().string());
                JSONArray foods=JSONObject.parseArray(response.body().string());
                System.out.println(foods.get(0));
                Food food1 = JSON.parseObject(foods.get(0).toString(),Food.class);//解析json数据
                Food food2 = JSON.parseObject(foods.get(1).toString(),Food.class);//解析json数据
                Food food3 = JSON.parseObject(foods.get(2).toString(),Food.class);//解析json数据
                showimg(food1.getfPicture(),1);
                showimg(food2.getfPicture(),2);
                showimg(food3.getfPicture(),3);
            }
        });
    }



    //显示折扣菜品
    private void showImgDis(){

        final String url = urlStr + "/discountFoodList";
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
                JSONArray foods=JSONObject.parseArray(response.body().string());
                System.out.println(foods.get(0));
                Food food4 = JSON.parseObject(foods.get(0).toString(),Food.class);//解析json数据
                Food food5 = JSON.parseObject(foods.get(1).toString(),Food.class);//解析json数据
                Food food6 = JSON.parseObject(foods.get(2).toString(),Food.class);//解析json数据
                showimg(food4.getfPicture(),4);
                showimg(food5.getfPicture(),5);
                showimg(food6.getfPicture(),6);
            }
        });


    }





    private void showimg(String s, final int n){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://10.0.2.2:8080/"+s)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            public void onFailure(Call call, IOException e) {

            }
            public void onResponse(Call call, Response response) throws IOException {
                InputStream inputStream = response.body().byteStream();//得到图片的流
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                Message msg = new Message();
                msg.arg1=n;
                msg.obj=bitmap;
                handler.sendMessage(msg);
            }
        });
    }

    private Handler handler = new Handler(){
        public void handleMessage(Message msg) {
            Bitmap bitmap = (Bitmap)msg.obj;
            switch (msg.arg1){
                case 1:imageView1.setImageBitmap(bitmap);break;//将图片的流转换成图片
                case 2:imageView2.setImageBitmap(bitmap);break;
                case 3:imageView3.setImageBitmap(bitmap);break;
                case 4:imageView4.setImageBitmap(bitmap);break;//将图片的流转换成图片
                case 5:imageView5.setImageBitmap(bitmap);break;
                case 6:imageView6.setImageBitmap(bitmap);break;
                default:break;
            }

        }
    };


}
