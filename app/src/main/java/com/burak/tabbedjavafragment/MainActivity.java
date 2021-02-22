package com.burak.tabbedjavafragment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.burak.tabbedjavafragment.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager()); //sectionsPagerAdapter'ı yakalıyoruz
        ViewPager viewPager = findViewById(R.id.view_pager); //viewPager tab'ın alt kısmındaki alan yakalanıyor
        viewPager.setAdapter(sectionsPagerAdapter); // viewPager'a sectionsPagerAdapter set ediyoruz (tab'a bastığımızda değişik alanı belirtiyoruz)
        TabLayout tabs = findViewById(R.id.tabs); //tab alanın id'sini yakalıyoruz
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab); //Ekranın alt kısmındaki mail butonun id'si yakalanıyor

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}