package com.i053114.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.img_item_cardview);
        Picasso.with(this).load("https://scontent-mia3-1.xx.fbcdn.net/v/t31.0-8/16665649_1615500745133528_2665002130043165363_o.jpg?oh=4175018eaff30bcf6f900b7120c9aa8d&oe=5A4318F9").into(imageView);
    }
}
