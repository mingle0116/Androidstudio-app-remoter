package com.example.a726version;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity implements View.OnClickListener {

    private Button btnsignin;
    private EditText etaccount,etpassword,etpasswordcomfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("注册");
        etaccount = findViewById(R.id.et_account);
        etpassword = findViewById(R.id.et_password);
        etpasswordcomfirm=findViewById(R.id.et_password_comfirm);
        btnsignin = findViewById(R.id.btnsignin);
        btnsignin.setOnClickListener(this);
        }
        public void onClick(View v) {
            String name=etaccount.getText().toString();
            String password=etpassword.getText().toString();
            String pass=etpasswordcomfirm.getText().toString();
            if(TextUtils.isEmpty(name)){
                Toast.makeText(SignIn.this,"用户名不能为空",Toast.LENGTH_LONG).show();

            }
           else  if(TextUtils.isEmpty(password)){
                Toast.makeText(SignIn.this,"密码不能为空",Toast.LENGTH_LONG).show();
            }
           else if (TextUtils.equals(password,pass)){
                Toast.makeText(SignIn.this,"恭喜，注册成功",Toast.LENGTH_LONG).show();
            }
    }


    public void jumptologin(View view) {
        Intent intent=new Intent(SignIn.this,Login.class);
        startActivity(intent);
    }



}