package com.kuliah.biodata;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivEmail = findViewById(R.id.ivEmail);
        ivEmail.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:111202012480@mhs.dinus.ac.id")); // only email apps should handle this
            startActivity(intent);
        });

        ImageView ivCall = findViewById(R.id.ivCall);
        ivCall.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:085290004925"));
            startActivity(intent);
        });

        ImageView ivHome = findViewById(R.id.ivHome);
        ivHome.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/Q6SvDrbPsnqTWKmS9");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

    }
}