package com.isecurestrap.SecureStrap.ui;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.heaton.baselib.base.BaseActivity;
import com.isecurestrap.SecureStrap.R;

public class RegisterActivity extends BaseActivity {
    EditText userName, userEmail, userPassword, userPasswordConfirm;
    Button registerBtn;
    ImageView backButton;


    @Override
    protected int layoutId() {
        return R.layout.activity_register;
    }

    @Override
    protected void bindData() {
        userName = findViewById(R.id.register_name);
        userEmail = findViewById(R.id.register_email);
        userPassword = findViewById(R.id.register_password);
        userPasswordConfirm = findViewById(R.id.register_password_confirm);

        registerBtn = findViewById(R.id.regBtn);
        backButton = findViewById(R.id.back_btn);
//        backButton.setOnClickListener(view ->{
//            toActivity(LoginActivity.class);
//        });
    }
}
