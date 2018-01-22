package com.example.innovace.fitorflap;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by innovace on 22/1/18.
 */

public class InfromationPage extends Activity {
    TextView textView;
    ImageView imageView;
    LinearLayout linearLayout;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textView = (TextView)findViewById(R.id.titleText);
        imageView = (ImageView) findViewById(R.id.mainImg);
        linearLayout = (LinearLayout) findViewById(R.id.mainBg);

        String tittle = getIntent().getStringExtra("tittle");
        textView.setText(tittle);


        if (tittle.equalsIgnoreCase(MainActivity.WEIGHT)){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            linearLayout.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }
        else  if (tittle.equalsIgnoreCase(MainActivity.LOTUS)){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            linearLayout.setBackgroundColor(Color.parseColor("#916bcd"));
        }
        else {
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            linearLayout.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
