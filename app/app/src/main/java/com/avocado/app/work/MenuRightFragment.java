package com.avocado.app.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.avocado.app.entity.Food;

import java.io.IOException;
import java.io.InputStream;


import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class MenuRightFragment extends Fragment {
    private View v;
    private TextView textView;
    private LinearLayout linearLayout;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;
    private static final String TAG = "springboot";
    private String urlStr = "http://10.0.2.2:8080/food";
    //Bean bean=new Bean();
    //Bundle bundle=getArguments();
    //String categoryId=bundle.getString("categoryId");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.menu_right_layout, container, false);
        linearLayout = (LinearLayout) v.findViewById(R.id.menuRightContent);
        textView = (TextView) v.findViewById(R.id.menuRightID);
        Bundle bundle = this.getArguments();
        String categoryId;
        if (bundle != null) {
            categoryId = bundle.getString("categoryId");
            textView.setText(textView.getText() + categoryId);
            showCategory(categoryId);
        }
        return v;
    }


    @Override
    public void onPause() {
        super.onPause();
    }

    //获取菜单
    private void showCategory(String categoryId) {

        final String url = urlStr + "/categoryFoodList?categoryId=" + categoryId;
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
                JSONArray foods = JSONObject.parseArray(response.body().string());
                System.out.println(foods.get(0));
                //bean.jsonArray=foods;
                Message msg = new Message();
                msg.obj = foods;
                handler.sendMessage(msg);
            }
        });
    }

    //显示图片
    private void showimg(String s, final int n){
        System.out.println("n:"+n);
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
//                Message msg1 = new Message();
//                System.out.println("msg1-1:"+n);
//                Bean bean=new Bean();
//                bean.n=n;
//                bean.bitmap=bitmap;
//                msg1.obj=bean;
//                handler1.sendMessage(msg1);

                Message message = Message.obtain(handler1, n, bitmap);
                message.sendToTarget();

            }
        });
    }



    Handler handler1 =new Handler(new Handler.Callback(){

        @Override
        public boolean handleMessage(@NonNull Message msg1) {
            imageView1=(ImageView)v.findViewById(R.id.pic_view_0);
            imageView2=(ImageView)v.findViewById(R.id.pic_view_1);
            imageView3=(ImageView)v.findViewById(R.id.pic_view_2);
            imageView4=(ImageView)v.findViewById(R.id.pic_view_3);
            imageView5=(ImageView)v.findViewById(R.id.pic_view_4);
            imageView6=(ImageView)v.findViewById(R.id.pic_view_5);
            //Bean bean=(Bean) msg1.obj;
            Bitmap bitmap =(Bitmap) msg1.obj;
            System.out.println("msg1-2:"+msg1.what);

            switch (msg1.what){
                case 0:imageView1.setImageBitmap(bitmap);break;//将图片的流转换成图片
                case 1:imageView2.setImageBitmap(bitmap);break;
                case 2:imageView3.setImageBitmap(bitmap);break;
                case 3:imageView4.setImageBitmap(bitmap);break;
                case 4:imageView5.setImageBitmap(bitmap);break;
                case 5:imageView6.setImageBitmap(bitmap);break;
                default:break;
            }
            return false;
        }
    });

    Handler handler =new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            //Bean bean1=(Bean) msg.obj;
            JSONArray foods = (JSONArray) msg.obj;
            //System.out.println(msg.obj);
            for (int i = 0; i < foods.size(); i++) {
                Food food = JSON.parseObject(foods.get(i).toString(), Food.class);

//                TextView textView = new TextView(getActivity());
//                textView.setText(food.getfName());
//                linearLayout.addView(textView);
                //1.创建外围LinearLayout控件
                LinearLayout layout0 = new LinearLayout(getActivity());
                LinearLayout.LayoutParams layoutLayoutParams = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutLayoutParams.height=220;
                layoutLayoutParams.topMargin=10;
                layout0.setBackgroundColor(getResources().getColor(R.color.colorWhite));

                //2.创建内部ImageView控件和LinearLayout控件
                ImageView img1 = new ImageView(getActivity());
                LinearLayout.LayoutParams imgParam = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                img1.setId(R.id.pic_view_1);
                imgParam.height=100;
                //imgParam.width=100;
                imgParam.weight=2;
                imgParam.leftMargin=30;


                LinearLayout layout1 = new LinearLayout(getActivity());
                LinearLayout.LayoutParams layoutLayoutParams1 = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                //layout1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                layoutLayoutParams1.weight=1;
                layoutLayoutParams1.gravity= Gravity.CENTER_VERTICAL;
                layout1.setOrientation(LinearLayout.VERTICAL);
                //layoutLayoutParams1.

                //2.创建内部TextView控件和LinearLayout控件
                TextView textView1 = new TextView(getActivity());
                TextView textView2 = new TextView(getActivity());
                TextView textView3 = new TextView(getActivity());
                LinearLayout.LayoutParams textParam = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.MATCH_PARENT);

                textView1.setText(food.getfName());
                textView1.setTextSize(16);

                textView2.setText("描述:"+food.getfDescribe());
                textView2.setTextSize(16);

                textView3.setText("好评率:"+food.getfRecommend());
                textView3.setTextSize(16);

                //3.创建内内部TextView控件和imageButton控件
                LinearLayout layout2 = new LinearLayout(getActivity());
                LinearLayout.LayoutParams layoutLayoutParams2 = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);

                //layout2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                layout2.setOrientation(LinearLayout.HORIZONTAL);

//<TextView-->
//<!--                    android:layout_width="140dp"-->
//<!--                    android:layout_height="30dp"-->
//<!--                    android:textSize="20dp"-->
//<!--                    android:layout_gravity="center"-->
//<!--                    android:text="$10000元"-->
//<!--                    android:textColor="@android:color/holo_red_dark"/>-->
                TextView textView4 = new TextView(getActivity());
                textView3.setText("￥"+food.getfPrice()+"/份");
                textView3.setWidth(140);
                textView3.setHeight(30);
                textView3.setTextSize(20);
                textView3.setGravity(Gravity.CENTER);
                textView3.setTextColor(getResources().getColor(R.color.colorRed));

//<Button-->
//<!--                    android:layout_width="40dp"-->
//<!--                    android:layout_height="40dp"-->
//<!--                    android:layout_gravity="center"-->
//<!--                    android:layout_marginLeft="80dp"-->
//<!--                    />-->
                ImageButton imageButton=new ImageButton(getActivity());
                LinearLayout.LayoutParams imageButtonParams2 = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                imageButtonParams2.leftMargin=80;
                imageButton.setBackground(getResources().getDrawable(R.drawable.add));
                imageButton.setMinimumHeight(20);
                imageButton.setMinimumHeight(20);
                imageButton.setMaxWidth(20);
                imageButton.setMaxHeight(20);
                imageButton.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View arg0) {
                        // TODO 自动生成的方法存根
                        Toast.makeText(getActivity(), "返回", Toast.LENGTH_LONG).show();
                    }
                });




                layout2.addView(textView4);
                layout2.addView(imageButton);
                layout1.addView(textView1,textParam);
                layout1.addView(textView2,textParam);
                layout1.addView(textView3,textParam);
                layout1.addView(layout2,layoutLayoutParams2);
                layout0.addView(img1,imgParam);
                layout0.addView(layout1,layoutLayoutParams1);
                linearLayout.addView(layout0,layoutLayoutParams);
                System.out.println("i:"+i);
            }
            //图片问题
//            for (int j=0;j<foods.size();j++){
//                Food food = JSON.parseObject(foods.get(j).toString(), Food.class);
//                showimg(food.getfPicture(),j);
//            }
            return false;
        }
    });

}
