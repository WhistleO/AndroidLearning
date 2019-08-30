package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"执行了onCreate()方法");

        Button button =(Button)findViewById(R.id.btn_finish);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent =new Intent();
                intent.setAction(intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:18205847410"));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"执行了onStart()方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"执行了onResume()方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"执行了onStop()方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"执行了onPause()方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"执行了onRestart()方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"执行了onDestroy()方法");
    }
}
