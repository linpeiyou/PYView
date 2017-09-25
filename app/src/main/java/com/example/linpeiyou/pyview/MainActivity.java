package com.example.linpeiyou.pyview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.linpeiyou.pyview.circle.CircleActivity;
import com.example.linpeiyou.pyview.drip.DripActivity;
import com.example.linpeiyou.pyview.freestyle.CanvasTranslateActivity;

public class MainActivity extends AppCompatActivity {

    Button btnCircle;
    Button btnDrip;
    Button btnCanvasTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findView();
        initView();
    }

    private void findView() {
        btnCircle = (Button) findViewById(R.id.btn_circle);
        btnDrip = (Button) findViewById(R.id.btn_drip);
        btnCanvasTranslate = (Button) findViewById(R.id.btn_canvas_translate);
    }

    private void initView() {
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CircleActivity.class);
                startActivity(intent);
            }
        });
        btnDrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DripActivity.class);
                startActivity(intent);
            }
        });
        btnCanvasTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CanvasTranslateActivity.class);
                startActivity(intent);
            }
        });
    }
}









