package com.arathus.materaexample;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.arathus.materaexample.view_pager.CustomPagerAdapter;
import com.pixelcan.inkpageindicator.InkPageIndicator;

public class AdvancedUsageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_usage);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        InkPageIndicator inkPageIndicator = findViewById(R.id.indicator);
        inkPageIndicator.setViewPager(viewPager);

    }

}
