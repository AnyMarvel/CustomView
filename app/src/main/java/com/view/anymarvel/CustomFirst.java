package com.view.anymarvel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.view.anymarvel.view.CustomListView;
import com.view.anymarvel.view.CustomListViewAdapter;
import com.view.anymarvel.view.MyTitle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lijuntao on 17-7-5.
 */

public class CustomFirst extends AppCompatActivity {
    // 自定义Lv
    private CustomListView mCustomLv;
    // 自定义适配器
    private CustomListViewAdapter mAdapter;
    // 内容列表
    private List<String> contentList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_first);


        //隐藏默认显示的actionBar（标题栏）
        getSupportActionBar().hide();
        //查询组件
        MyTitle mytitle = (MyTitle) findViewById(R.id.mytitle);
        //后退按钮设置监听事件
        mytitle.setLeftBunttonListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomFirst.this.getBaseContext(), R.string.left_btn_Prompt, Toast.LENGTH_LONG).show();
            }
        });
        //设置标题
        mytitle.setTitleText(getString(R.string.app_name));

        initContentList();

        mCustomLv = (CustomListView) findViewById(R.id.custom_lv);
        mCustomLv.setOnDeleteListener(new CustomListView.OnDeleteListener() {

            @Override
            public void onDelete(int index) {
                contentList.remove(index);
                mAdapter.notifyDataSetChanged();
            }
        });

        mAdapter = new CustomListViewAdapter(this, 0, contentList);
        mCustomLv.setAdapter(mAdapter);

    }

    // 初始化内容列表
    private void initContentList() {
        for (int i = 0; i < 20; i++) {
            contentList.add("内容项" + i);
        }
    }

    @Override
    public void onBackPressed() {
        if (mCustomLv.isDeleteShown()) {
            mCustomLv.hideDelete();
            return;
        }
        super.onBackPressed();
    }
}
