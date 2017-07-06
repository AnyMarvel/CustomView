package com.view.anymarvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.view.anymarvel.view.CustomListView;
import com.view.anymarvel.view.CustomListViewAdapter;
import com.view.anymarvel.view.MyTitle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Unbinder unbinder;

    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.rainbow_bar)
    Button button2;
    @BindView(R.id.progrecessbar)
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                startActivity(new Intent(MainActivity.this, CustomFirst.class));
                break;
            case R.id.rainbow_bar:
                startActivity(new Intent(MainActivity.this, Rainbow.class));
                break;
            case R.id.progrecessbar:
                startActivity(new Intent(MainActivity.this, NumberProgressBarActivity.class));
                break;
            default:
                break;
        }
    }
}
