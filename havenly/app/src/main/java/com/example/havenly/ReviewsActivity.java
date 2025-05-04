package com.example.havenly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        Button btnDetails = findViewById(R.id.btnDetails);
        Button btnPricing = findViewById(R.id.btnPricing);
        Button btnDesigners = findViewById(R.id.btnDesigners);
        Button btnReviews = findViewById(R.id.btnReviews);

        btnDetails.setOnClickListener(v -> startActivity(new Intent(ReviewsActivity.this, MainActivity.class)));
        btnPricing.setOnClickListener(v -> startActivity(new Intent(ReviewsActivity.this, PricingActivity.class)));
        btnDesigners.setOnClickListener(v -> startActivity(new Intent(ReviewsActivity.this, DesignersActivity.class)));
        btnReviews.setOnClickListener(v -> {
            // Already on this page
        });
    }
}
