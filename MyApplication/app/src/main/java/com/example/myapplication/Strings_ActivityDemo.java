package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Strings_ActivityDemo extends AppCompatActivity {
    TextView tv2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strings_layout);
        tv2=(TextView)findViewById(R.id.tv2);
        tv2.setText(R.string.app_class);
    }
}
