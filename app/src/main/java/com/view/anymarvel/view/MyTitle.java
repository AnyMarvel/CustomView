package com.view.anymarvel.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.view.anymarvel.R;

/**
 * Created by lijuntao on 17-7-3.
 */

public class MyTitle extends RelativeLayout {
    private Button button;
    private TextView mTitleTv;

    public MyTitle(Context context) {
        super(context);
    }

    public MyTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_bar, this, true);
        button = (Button) findViewById(R.id.left_btn);
        mTitleTv = (TextView) findViewById(R.id.title_tv);
    }

    public void setLeftBunttonListener(OnClickListener onClickListener) {
        button.setOnClickListener(onClickListener);
    }

    // 设置标题的方法
    public void setTitleText(String title) {
        mTitleTv.setText(title);
    }


}
