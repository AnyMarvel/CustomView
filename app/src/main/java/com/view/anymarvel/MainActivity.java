package com.view.anymarvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.view.anymarvel.view.MyTitle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //隐藏默认显示的actionBar（标题栏）
        getSupportActionBar().hide();
        //查询组件
        MyTitle mytitle = (MyTitle) findViewById(R.id.mytitle);
        //后退按钮设置监听事件
        mytitle.setLeftBunttonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this.getBaseContext(), R.string.left_btn_Prompt, Toast.LENGTH_LONG).show();
            }
        });
        //设置标题
        mytitle.setTitleText(getString(R.string.app_name));

    }
}
