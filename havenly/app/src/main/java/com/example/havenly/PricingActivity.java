package com.example.havenly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PricingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricing);

        Button btnDetails = findViewById(R.id.btnDetails);
        Button btnPricing = findViewById(R.id.btnPricing);
        Button btnDesigners = findViewById(R.id.btnDesigners);
        Button btnReviews = findViewById(R.id.btnReviews);

        btnDetails.setOnClickListener(v -> startActivity(new Intent(PricingActivity.this, MainActivity.class)));
        btnPricing.setOnClickListener(v -> {
            // Already on this page
        });
        btnDesigners.setOnClickListener(v -> startActivity(new Intent(PricingActivity.this, DesignersActivity.class)));
        btnReviews.setOnClickListener(v -> startActivity(new Intent(PricingActivity.this, ReviewsActivity.class)));
    }
}
