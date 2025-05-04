package com.example.nexify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage); // Make sure this matches your layout file name

        // Button references
        Button detailsButton = findViewById(R.id.detailsButton);
        Button designersButton = findViewById(R.id.designersButton);
        Button reviewsButton = findViewById(R.id.reviewsButton);
        Button designVirtuallyButton = findViewById(R.id.designVirtuallyButton);

        // Set button click listeners
        detailsButton.setOnClickListener(v -> {
            Intent intent = new Intent(Homepage.this, MainActivity.class); // Your Details page
            startActivity(intent);
        });

        designersButton.setOnClickListener(v -> {
            Intent intent = new Intent(Homepage.this, DesignersActivity.class);
            startActivity(intent);
        });

        reviewsButton.setOnClickListener(v -> {
            Intent intent = new Intent(Homepage.this, ReviewsActivity.class);
            startActivity(intent);
        });

        designVirtuallyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Homepage.this, DesignVirtuallyActivity.class);
            startActivity(intent);
        });
    }
}
