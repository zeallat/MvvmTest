package com.appg.mvvmtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appg.mvvmtest.data.User;
import com.appg.mvvmtest.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
//        MainActivityDa
        MainActivityBinding binding =
                DataBindingUtil.setContentView(this, R.layout.main_activity);
        User user = new User();
        user.setAge(1);
        user.setName("이름이름");
        user.setPhoneNumber("010010101010");

        binding.setUser(user);
    }
}
