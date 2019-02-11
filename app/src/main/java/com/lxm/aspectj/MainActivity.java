package com.lxm.aspectj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.lxm.aspectj.second.SecondActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tvMain).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("lxm", "click main.....");

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
