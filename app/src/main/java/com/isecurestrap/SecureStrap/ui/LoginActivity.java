package com.isecurestrap.SecureStrap.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.heaton.baselib.base.BaseActivity;
import com.isecurestrap.SecureStrap.R;

public class LoginActivity extends BaseActivity {
    EditText loginUserInfo, loginUserPassword;
    CheckBox rememberCheckBox;
    Button loginBtn;
    TextView signUp;

    @Override
    protected int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void bindData() {

    }

//    @Override
//    protected int layoutId() {
//        return R.layout.activity_login;
//    }
//
//    @Override
//    protected void bindData() {
////        loginUserInfo = findViewById(R.id.login_name);
////        loginUserPassword = findViewById(R.id.login_password);
////        loginBtn = findViewById(R.id.loginBtn);
////        rememberCheckBox = findViewById(R.id.checkbox);
////        loginBtn = findViewById(R.id.loginBtn);
////        signUp = findViewById(R.id.sign_up);
//
////        signUp.setOnClickListener(view -> {
////            toActivity(RegisterActivity.class);
////        });
//    }
}