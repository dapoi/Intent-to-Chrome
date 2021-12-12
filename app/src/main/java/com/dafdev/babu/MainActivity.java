package com.dafdev.babu;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView card1 = findViewById(R.id.card1);
        CardView card2 = findViewById(R.id.card2);

        String url1 = "http://www.facebook.com";
        String url2 = "http:///www.instagram.com";

        card1.setOnClickListener(view -> {
            Uri facebook = Uri.parse("googlechrome://navigate?url=" + url1);
            Intent moveToFacebook = new Intent(Intent.ACTION_VIEW, facebook);
            moveToFacebook.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(moveToFacebook);
        });

        card2.setOnClickListener(view -> {
            Uri instagram = Uri.parse("googlechrome://navigate?url=" + url2);
            Intent moveToInstagram = new Intent(Intent.ACTION_VIEW, instagram);
            moveToInstagram.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(moveToInstagram);
        });
    }
}