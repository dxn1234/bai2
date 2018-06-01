package com.example.administrator.demotablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ViewPager viewPager=findViewById(R.id.viewpaper);
        viewPager.setAdapter(new MyAdapater(getSupportFragmentManager()));
        TabLayout tabLayout=findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
