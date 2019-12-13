package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TabAccess tabAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.view_pager);
        tabAccess = new TabAccess(getSupportFragmentManager());
        viewPager.setAdapter(tabAccess);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId() == R.id.logout){

                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);

        }
        if (item.getItemId() == R.id.settings){
            Toast.makeText(MainActivity.this, "You will be moved to profile settings", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, settings.class);
            startActivity(intent);
        }

        if (item.getItemId() == R.id.Services){
            Toast.makeText(MainActivity.this, "You will be moved to Services settings", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, services.class);
            startActivity(intent);
        }
        return true;
    }
}