package com.example.cvpna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout mainTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tab layout on the bottom
        mainTabLayout =  (TabLayout) findViewById(R.id.mainTabLayout);

        //tabs
        mainTabLayout.addTab(mainTabLayout.newTab().setText("VPN"));
        mainTabLayout.addTab(mainTabLayout.newTab().setText("RDP"));
        mainTabLayout.addTab(mainTabLayout.newTab().setText("FM"));
        mainTabLayout.addTab(mainTabLayout.newTab().setText("Mail"));

        //tab positioning
        mainTabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //fragment manager
        Fragment vpnFragment = new VPNFragment();


        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, vpnFragment).addToBackStack(null).commit();

        //tab actions
        mainTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new VPNFragment();
                        break;
                    case 1:
                        fragment = new RDPFragment();
                        break;
                    case 2:
                        fragment = new FMFragment();
                        break;
                    case 3:
                        fragment = new MailFragment();
                        break;

                }

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.mainFrameLayout,  fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //list
        // vpnRecyclerView= findViewById(R.id.VPNListRecyclerView);

        //connection with adapter
        // vpnRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // customAdapter = new CustomAdapter(this, vpnList);
        // vpnRecyclerView.setAdapter(customAdapter);

        //buttons

}
}