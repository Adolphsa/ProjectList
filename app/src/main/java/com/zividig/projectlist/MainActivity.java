package com.zividig.projectlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this,R.string.toast_button1,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,R.string.toast_button2,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this,R.string.toast_button3,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this,R.string.toast_button4,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this,R.string.toast_button5,Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this,R.string.toast_button6,Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
