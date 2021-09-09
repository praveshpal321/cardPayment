package com.example.cardpayment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
CircleIndicator circleIndicator;
TextView swipeCard,tapCard,printReceipt;
ImageView menu,profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu=(ImageView) findViewById(R.id.menu);
        profile=(ImageView) findViewById(R.id.profile);
        swipeCard=(TextView)findViewById(R.id.swipeCard);
        tapCard=(TextView)findViewById(R.id.tapCard);
        printReceipt=(TextView)findViewById(R.id.printReceipt);

       circleIndicator=(CircleIndicator)findViewById(R.id.circleIndicator);
       viewPager=(ViewPager)findViewById(R.id.viewPager);
       ViewPageAdapter viewPageAdapter=new ViewPageAdapter(this);
       viewPager.setAdapter(viewPageAdapter);
       circleIndicator.setViewPager(viewPager);

       swipeCard.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               swipeCard.setBackgroundResource(R.drawable.shap1);
               swipeCard.setTextColor(Color.WHITE);

               tapCard.setBackgroundResource(R.drawable.shap);
               tapCard.setTextColor(Color.BLACK);

               printReceipt.setBackgroundResource(R.drawable.shap);
               printReceipt.setTextColor(Color.BLACK);


           }
       });
       tapCard.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               tapCard.setBackgroundResource(R.drawable.shap1);
               tapCard.setTextColor(Color.WHITE);

               swipeCard.setBackgroundResource(R.drawable.shap);
               swipeCard.setTextColor(Color.BLACK);

               printReceipt.setBackgroundResource(R.drawable.shap);
               printReceipt.setTextColor(Color.BLACK);

           }
       });
       printReceipt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               printReceipt.setBackgroundResource(R.drawable.shap1);
               printReceipt.setTextColor(Color.WHITE);

               swipeCard.setBackgroundResource(R.drawable.shap);
               swipeCard.setTextColor(Color.BLACK);

               tapCard.setBackgroundResource(R.drawable.shap);
               tapCard.setTextColor(Color.BLACK);
           }
       });

       menu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"Menu",Toast.LENGTH_SHORT).show();
           }
       });
       profile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getApplicationContext(),"Set Profile",Toast.LENGTH_SHORT).show();
           }
       });

    }
}