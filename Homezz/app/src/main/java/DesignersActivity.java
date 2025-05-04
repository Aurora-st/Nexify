package com.example.homezz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class DesignersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_designers);

        Button btnDetails = findViewById(R.id.btnDetails);
        Button btnPricing = findViewById(R.id.btnPricing);
        Button btnDesigners = findViewById(R.id.btnDesigners);
        Button btnReviews = findViewById(R.id.btnReviews);

        btnDetails.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
        btnPricing.setOnClickListener(v -> startActivity(new Intent(this, PricingActivity.class)));
        btnDesigners.setOnClickListener(v -> { /* Already here */ });
        btnReviews.setOnClickListener(v -> startActivity(new Intent(this, ReviewsActivity.class)));
    }
}