package com.example.kshitij.patentlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class NavigationActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FloatingActionButton button;
    private int score;
    private int footprint;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle("Home");
                    viewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_dashboard:
                    setTitle("Status");
                    viewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_contribute:
                    setTitle("Contribute");
                    viewPager.setCurrentItem(2);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        score = getIntent().getExtras().getInt("score");
        footprint = getIntent().getExtras().getInt("footprint");
        button = findViewById(R.id.form_button);
        setTitle("Home");
        BottomNavigationView navigation = findViewById(R.id.navigation);
        viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        viewPager.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                return;
            }
        });
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FormActivity.class);
                intent.putExtra("score",score);
                intent.putExtra("footprint",footprint);
                startActivity(intent);
            }
        });
    }

}
