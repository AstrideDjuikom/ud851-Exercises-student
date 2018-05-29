package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView msgTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        msgTv=(TextView)findViewById(R.id.tv_display);

    }


}
