package com.improgrammer.materui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    MaterialToolbar materialToolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        materialToolbar = findViewById(R.id.matTool);
        drawerLayout = findViewById(R.id.draw);
        navigationView = findViewById(R.id.nav_view);
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(getApplicationContext(),"home",Toast.LENGTH_SHORT).show();
                    case R.id.profile:
                        Toast.makeText(getApplicationContext(),"profile",Toast.LENGTH_SHORT).show();
                    case R.id.setting:
                        Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
                    case R.id.aboutus:
                        Toast.makeText(getApplicationContext(),"aboutus",Toast.LENGTH_SHORT).show();
                    case R.id.contact_us:
                        Toast.makeText(getApplicationContext(),"contactus",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        materialToolbar.onM
    }
}