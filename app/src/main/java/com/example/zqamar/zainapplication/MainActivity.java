package com.example.zqamar.zainapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private ImageButton topRightButton;
    private ImageButton topLeftButton;
    private ImageButton bt1;
    private ImageButton bt3;

    @OnClick
    public void toAnimation() {
        toAnimation(AnimationActivity.class);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();
    }

    private void initialListener(){


        topRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LaunchViewActivityA.class);
                startActivity(intent);
            }
        });
    }

    private void initialView() {
        bt1 = (ImageButton)findViewById(R.id.bt1);
        bt3 = (ImageButton)findViewById(R.id.bt3);
        topLeftButton = (ImageButton)findViewById(R.id.topLeftButton);
        topRightButton = (ImageButton)findViewById(R.id.topRightButton);
    }
    }


}
