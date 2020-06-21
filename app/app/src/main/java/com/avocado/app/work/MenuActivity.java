package com.avocado.app.work;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuActivity extends FragmentActivity{
    Button button1,button2,button3,menuToIndexBtn,menuToOrderBtn;
    private static final String TAG = "springboot";
    private String urlStr = "http://10.0.2.2:8080/food";
    private static final int menuToIndex = 7;
    private static final int menuToOrder = 8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Intent loginIntent = getIntent();
        final String loginMessage = loginIntent.getStringExtra("cId");

        TextView textView = (TextView) findViewById(R.id.menuCId);
        textView.setText(textView.getText()+loginMessage);
        //showCategory("1");
        button1=(Button)findViewById(R.id.menuBtn1);
        button2=(Button)findViewById(R.id.menuBtn2);
        button3=(Button)findViewById(R.id.menuBtn3);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //步骤一：FlagmentTransaction的实例
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //步骤二：用add方法加上Fragment的对象rightFragment
                MenuRightFragment menuRightFragment =new MenuRightFragment();
                Bundle bundle=new Bundle();
                bundle.putString("categoryId","1");
                menuRightFragment.setArguments(bundle);
                transaction.replace(R.id.menuRight, menuRightFragment);
                transaction.commit();

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            //步骤一：FlagmentTransaction的实例
            @Override
            public void onClick(View v) {
                //步骤一：FlagmentTransaction的实例
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //步骤二：用add方法加上Fragment的对象rightFragment
                MenuRightFragment menuRightFragment =new MenuRightFragment();
                Bundle bundle=new Bundle();
                bundle.putString("categoryId","2");
                menuRightFragment.setArguments(bundle);
                transaction.replace(R.id.menuRight, menuRightFragment);
                transaction.commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //步骤一：FlagmentTransaction的实例
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //步骤二：用add方法加上Fragment的对象rightFragment
                MenuRightFragment menuRightFragment =new MenuRightFragment();
                Bundle bundle=new Bundle();
                bundle.putString("categoryId","3");
                menuRightFragment.setArguments(bundle);
                transaction.replace(R.id.menuRight, menuRightFragment);
                transaction.commit();
            }
        });

        menuToIndexBtn=(Button) findViewById(R.id.menuToIndex);
        menuToIndexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, IndexActivity.class);
                intent.putExtra("cId", loginMessage);
                startActivityForResult(intent, menuToIndex);
            }
        });
        menuToOrderBtn=(Button) findViewById(R.id.menuToOrder);
        menuToOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, OrderActivity.class);
                intent.putExtra("cId", loginMessage);
                startActivityForResult(intent, menuToOrder);
            }
        });
    }


}
