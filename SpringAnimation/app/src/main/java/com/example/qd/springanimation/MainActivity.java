package com.example.qd.springanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.opensource.svgaplayer.SVGAImageView;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4;
    private SVGAImageView svgaImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        svgaImage = findViewById(R.id.svgaImage);

        final SvgaUtils svgaUtils = new SvgaUtils(MainActivity.this,svgaImage);
        svgaUtils.initAnimator();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgaUtils.startAnimator("aixin");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgaUtils.startAnimator("bujibao");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgaUtils.startAnimator("shengri");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgaUtils.startAnimator("youleyuan");
            }
        });
    }
}
