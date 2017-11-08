package com.example.coordinatorlayoutdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.coordinatorlayoutdemo.R;
import com.example.coordinatorlayoutdemo.utils.SnackBarUtils;

/**
 * Created by 亮亮 on 2017/11/8.
 */

public class SnackBarActivity extends Activity {
    int count=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar_coordinator);
    }
    public void click(View v){

        SnackBarUtils.showSnack(findViewById(R.id.fl),"如果有来生我要做一棵树"+count++);

    }
}
