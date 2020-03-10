package com.example.fragmentation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 =findViewById(R.id.f1);
        Button b2 =findViewById(R.id.f2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });
    }

    public  void ChangeFragment(View view){
        Fragment fragment;
        if(view == findViewById(R.id.f1)){
            fragment = new Fragment1();
            //FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentplace, fragment);
            fragmentTransaction.commit();
        }
        if(view == findViewById(R.id.f2)){
            fragment = new Fragment2();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentplace, fragment);
            fragmentTransaction.commit();
        }
    }
}
