package com.example.coordinatorlayoutdemo.activity;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.coordinatorlayoutdemo.R;

/**
 * Created by 亮亮 on 2017/11/8.
 */

public class CollapsingToolbarLayoutActivity extends Activity {
    private TextView tv;
    private Toolbar toolbar;
    private CollapsingToolbarLayout ctl;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsingtoolbar);
        initView();
        initData();
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initData() {
        for (int i=0;i<50;i++){
            tv.append("我是第"+(i+1)+"行\n");
        }
        ctl.setTitle("我是谁");
        ctl.setContentScrim(new BitmapDrawable(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher)));
    }

    private void initView() {
        tv= findViewById(R.id.tv);
        toolbar = findViewById(R.id.toolbar);
        ctl = findViewById(R.id.ctl);
    }
}
