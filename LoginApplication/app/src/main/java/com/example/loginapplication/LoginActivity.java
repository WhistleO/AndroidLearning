package com.example.loginapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText userNameText;// 用户名
    EditText passwordText;// 密码
    Button loginBtn;// 登录按钮
    TextView tipsTv;// 提示

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        // 初始化控件
        userNameText=(EditText)findViewById(R.id.editUid);
        passwordText=(EditText)findViewById(R.id.editPwd);
        tipsTv=(TextView)findViewById(R.id.textTips);
        loginBtn=(Button)findViewById(R.id.btnLogin);

        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String userName =userNameText.getText().toString(); // 获取用户名
                String passWord=passwordText.getText().toString();// 获取密码
                // 判断用户名
                if(!"admin".equals(userName)){
                    tipsTv.setText("用户名不存在！");
                    tipsTv.setVisibility(View.VISIBLE);
                    Toast.makeText(LoginActivity.this,"用户名不存在！",Toast.LENGTH_SHORT).show();
                }
                if(!"admin".equals(passWord)){
                    tipsTv.setText("密码错误！");
                    tipsTv.setVisibility(View.VISIBLE);
                    Toast.makeText(LoginActivity.this,"密码错误！",Toast.LENGTH_SHORT).show();
                }
                if("admin".equals(userName)&&"admin".equals(passWord)){
                    tipsTv.setText("登录成功！");
                    tipsTv.setVisibility(View.VISIBLE);
                    Toast.makeText(LoginActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();

                }
            }

        });

    }
}
