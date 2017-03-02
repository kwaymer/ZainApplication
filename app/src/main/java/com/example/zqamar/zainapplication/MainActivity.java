package com.example.zqamar.zainapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private ImageButton topRightButton;
    private ImageButton topLeftButton;
    private ImageButton bt1;
    private ImageButton bt3;

    private Button timer;

    //@OnClick(R.id.bt_animation)
    //public void toAnimation() {
     //   toAnimation(AnimationActivity.class);

    @OnClick(R.id.bt2)
    public void button2Click(){
        Intent i = new Intent(this, DialogActivity.class);
        startActivityForResult(i, 2);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        initialListener();
        ButterKnife.bind(this);
    }

    private void initialListener(){
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button 1", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(v.getContext(), ViewPagerActivity.class);
                i.putExtra("key", "value");
                Bundle b = new Bundle();
                b.putInt("Ingeter", 12345);

                Book book = new Book();
                book.setName("Book's Name");
                book.setAuthor("Book's Author");
                b.putSerializable("book", book);

                i.putExtras(b);
                startActivityForResult(i, 1);

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toastShort("Button 3");

                Intent i = new Intent(v.getContext(), ListViewActivity.class);
                startActivityForResult(i, 3);

            }
        });

        topLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


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

    public void onClick(View v){
        Toast.makeText(this,"Button 2 was Clicked", Toast.LENGTH_SHORT).show();
    }

    }



