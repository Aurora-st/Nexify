package com.example.nexify;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DesignersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designers);

        // Navigate to Details
        Button detailsButton = findViewById(R.id.detailsButton);
        detailsButton.setOnClickListener(v -> {
            Intent intent = new Intent(DesignersActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        // Navigate to Reviews
        Button reviewsButton = findViewById(R.id.reviewsButton);
        reviewsButton.setOnClickListener(v -> {
            Intent intent = new Intent(DesignersActivity.this, ReviewsActivity.class);
            startActivity(intent);
        });
    }
}
