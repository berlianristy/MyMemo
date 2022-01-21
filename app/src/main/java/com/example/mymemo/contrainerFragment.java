package com.example.mymemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment_mymemo.fragment.allFragment;
import com.example.fragment_mymemo.fragment.eventFragment;
import com.example.fragment_mymemo.fragment.personalFragment;
import com.example.fragment_mymemo.fragment.shoppingFragment;
import com.example.fragment_mymemo.fragment.sportFragment;

public class contrainerFragment extends FragmentActivity implements View.OnClickListener {
    ImageButton buttonSemua, buttonShop, buttonEvent, buttonPersonal, buttonSport;

    allFragment allFragment;
    eventFragment eventFragment;
    personalFragment personalFragment;
    shoppingFragment shoppingFragment;
    sportFragment sportFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrainer_fragment);
        buttonSemua = findViewById(R.id.buttonSemua);
        buttonShop = findViewById(R.id.buttonShop);
        buttonEvent = findViewById(R.id.buttonEvent);
        buttonPersonal = findViewById(R.id.buttonPersonal);
        buttonSport = findViewById(R.id.buttonSport);

        buttonSemua.setOnClickListener(this);
        buttonShop.setOnClickListener(this);
        buttonEvent.setOnClickListener(this);
        buttonPersonal.setOnClickListener(this);
        buttonSport.setOnClickListener(this);
    }

    void menuSemua() {
        allFragment = new allFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentcontainer, allFragment);
        ft.commit();
    }

    void menuPersonal() {
        personalFragment = new personalFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentcontainer, personalFragment);
        ft.commit();
    }

    void menuEvent() {
        eventFragment = new eventFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentcontainer, eventFragment);
        ft.commit();
    }

    void menushopping() {
        shoppingFragment = new shoppingFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentcontainer, shoppingFragment);
        ft.commit();
    }

    void menuSport() {
        sportFragment = new sportFragment();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentcontainer, sportFragment);
        ft.commit();
    }


    @Override
    public void onClick(View v) {
        if (v == buttonSemua) {
            menuSemua();
        }
        if (v == buttonPersonal) {
            menuPersonal();
        }
        if (v == buttonEvent) {
            menuEvent();
        }
        if (v == buttonShop) {
            menushopping();
        }
        if (v == buttonSport) {
            menuSport();
        }

    }

}