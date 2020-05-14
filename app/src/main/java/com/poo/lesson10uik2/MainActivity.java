package com.poo.lesson10uik2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int LEVEL_PLAY = 0;
    private static final int LEVEL_PAUSE = 1;
    private ImageView ivPlay;

    private Button btHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        ivPlay = findViewById(R.id.iv_play);
        ivPlay.setOnClickListener(this);
        findViewById(R.id.bt_hello).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        boolean visible;
        if (v.getId() == R.id.iv_play) {
            ivPlay.setImageLevel(ivPlay.getDrawable().getLevel() == LEVEL_PLAY ? LEVEL_PAUSE : LEVEL_PLAY);
        }


    }
}
