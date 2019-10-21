package com.example.malangbuilding.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.malangbuilding.R;
import com.example.malangbuilding.fragments.HomeFragment;
import com.example.malangbuilding.fragments.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

//    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

//        int images[] = {R.drawable.dome, R.drawable.gracak, R.drawable.sasbud, R.drawable.poltek};
//        v_flipper = findViewById(R.id.v_flipper);
//
//        for(int image: images)
//        {
//            flipperImages(image);
//        }
    }

//    public void flipperImages(int image){
//        ImageView imageView = new ImageView(this);
//        imageView.setBackgroundResource(image);
//
//        v_flipper.addView(imageView);
//        v_flipper.setFlipInterval(4000);
//        v_flipper.setAutoStart(true);
//
//        v_flipper.setInAnimation(this, R.anim.slide_in_left);
//        v_flipper.setOutAnimation(this, R.anim.slide_in_right);
//    }
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_food:
                fragment = new HomeFragment();
                break;
            case R.id.action_movie:
                fragment = new SearchFragment();
                break;
        }
        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
