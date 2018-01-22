package com.example.innovace.fitorflap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String WEIGHT="weight";
    public static final String LOTUS="lotus";
    public static final String CARDIO="cardio";
    public static final String TITLE = "item_title";
    RelativeLayout wRelativeLayout,lRelativeLayout,cRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_file);
        wRelativeLayout = (RelativeLayout)findViewById(R.id.weight_layout);
        lRelativeLayout = (RelativeLayout)findViewById(R.id.lotus_layout);
        cRelativeLayout = (RelativeLayout)findViewById(R.id.heart_layout);

        wRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoInformationPage(WEIGHT);
            }
        });

        lRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoInformationPage(LOTUS);
            }
        });

        cRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoInformationPage(CARDIO);
            }
        });




    }

    public void gotoInformationPage(String tittle) {


        Intent intent = new Intent(MainActivity.this,InfromationPage.class);
        intent.putExtra("tittle",tittle);
        startActivity(intent);
    }
}
