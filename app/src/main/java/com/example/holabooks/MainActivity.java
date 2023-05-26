package com.example.holabooks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<SetsModel> list;
    SetsAdapter adapter;
    RecyclerView recyclerView;

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ImageView menu;
    View header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.recyclerView);

        menu = findViewById(R.id.menu);
        navigationView = findViewById(R.id.navmenu);
        drawerLayout = findViewById(R.id.drawerLayout);

        list = new ArrayList<>();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        list.add(new SetsModel("SET 1"));
        list.add(new SetsModel("SET 2"));
        list.add(new SetsModel("SET 3"));
        list.add(new SetsModel("SET 4"));
        list.add(new SetsModel("SET 5"));
        list.add(new SetsModel("SET 6"));
        list.add(new SetsModel("SET 7"));
        list.add(new SetsModel("SET 8"));
        list.add(new SetsModel("SET 9"));
        list.add(new SetsModel("SET 10"));

        adapter = new SetsAdapter(list, this);
        recyclerView.setAdapter(adapter);
        header = navigationView.getHeaderView(0);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.home:
//                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                    case R.id.sharing:
//                        Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                    case R.id.rate:
//                        Toast.makeText(MainActivity.this, "Rate", Toast.LENGTH_SHORT).show();
//                        drawerLayout.closeDrawer(GravityCompat.START);
//                        break;
//                }
//                return true;
//            }
//        });
    }
}
