package com.lxm.aspectj.second;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.lxm.aspectj.AnnotationLog;
import com.lxm.aspectj.R;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        findViewById(R.id.tvSecond).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Log.i("lxm","click second....");

        aspect();
    }

    @AnnotationLog
    private void aspect(){
        Log.i("lxm","使用注解方式标记切点");
    }
}
