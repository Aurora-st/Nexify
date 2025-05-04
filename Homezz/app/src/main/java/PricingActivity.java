package com.example.homezz;

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

        btnDetails.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
        btnPricing.setOnClickListener(v -> { /* Already here */ });
        btnDesigners.setOnClickListener(v -> startActivity(new Intent(this, DesignersActivity.class)));
        btnReviews.setOnClickListener(v -> startActivity(new Intent(this, ReviewsActivity.class)));
    }
}