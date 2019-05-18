package com.njos.tugasmvp.activity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.njos.tugasmvp.fragment.KontakFragment;
import com.njos.tugasmvp.R;
import com.njos.tugasmvp.fragment.ProfileFragment;
import com.njos.tugasmvp.fragment.TemanFragment;



//tanggal 18/05/2019
//NIM : 10116040
//NAMA : Anjas Kurnia Sandy
//Kelas : IF 1
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new ProfileFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.profile_menu:
                fragment = new ProfileFragment();
                break;
            case R.id.kontak:
                fragment = new KontakFragment();
                break;
            case R.id.daftar_teman:
                fragment = new TemanFragment();
                break;
        }
        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}
