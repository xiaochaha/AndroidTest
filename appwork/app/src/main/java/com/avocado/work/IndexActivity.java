package com.avocado.work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_layout);
        Intent loginIntent=getIntent();
        String loginMessage=loginIntent.getStringExtra("username");
//        button=(Button)findViewById(R.id.btn4);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(IndexActivity.this,MainActivity.class);
//                setResult(RESULT_OK,intent);
//                finish();
//            }
//        });
        TextView textView=(TextView)findViewById(R.id.txv1);
        textView.setText(loginMessage);
    }
}
