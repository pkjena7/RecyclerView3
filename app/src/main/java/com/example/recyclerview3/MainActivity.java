package com.example.recyclerview3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.home:
                        fragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new HomeFragment()).commit();
                        break;

                    case R.id.fav:
                        fragment = new FavFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FavFragment()).commit();
                        break;

                    case R.id.info:
                        fragment = new InfoFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new InfoFragment()).commit();
                        break;
                }
                return true;
            }
        });
    }
}