package com.example.lat;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;


import android.os.Bundle;
import android.view.Menu;

import android.widget.Toast;

import com.example.lat.databinding.ActivityCareerMeritBinding;


import java.util.ArrayList;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class careerMerit extends AppCompatActivity {

    ActivityCareerMeritBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCareerMeritBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

       FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
       transaction.replace(R.id.content, new HomeFragment());
       transaction.commit();

        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i){
                    case 0:
                        transaction.replace(R.id.content, new HomeFragment());
                        transaction.commit();
                        break;
                    case 1:
                        transaction.replace(R.id.content, new LeaderboardsFragment());
                        transaction.commit();
                        break;
                    case 2:
                        transaction.replace(R.id.content, new WalletFragment());
                        transaction.commit();
                        break;
                    case 3:
                        transaction.replace(R.id.content, new ProfileFragment());
                        transaction.commit();
                        break;

                }
                return false;
            }
        });



    }



}
