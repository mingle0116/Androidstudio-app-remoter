package com.example.a726version;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
   private Button btnlogin;
   private EditText etaccount,etpassword;
   private String username="mmm";
   private String Pass="223";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("登录");
        btnlogin=findViewById(R.id.btnlogin);
        etaccount=findViewById(R.id.et_account);
        etpassword=findViewById(R.id.et_password);


        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               String account=etaccount.getText().toString();
               String password=etpassword.getText().toString();
               if(TextUtils.equals(account,username)){
                   if(TextUtils.equals(password,Pass)){
                       Toast.makeText(Login.this,"恭喜，登陆成功", Toast.LENGTH_LONG).show();
                       Intent intent=new Intent(Login.this,MainActivity.class);
                       startActivity(intent);
                   }
                   else{
                       Toast.makeText(Login.this,"密码错误",Toast.LENGTH_LONG).show();
                   }
               }
                   else{
                       Toast.makeText(Login.this,"账号或用户名错误",Toast.LENGTH_LONG).show();
                   }

            }
        });

    }
    public void jumptosignin(View view) {
        Intent intent= new Intent(Login.this,SignIn.class);
        startActivity(intent);
    }
}