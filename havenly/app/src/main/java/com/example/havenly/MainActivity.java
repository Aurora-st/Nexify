package com.example.havenly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDetails = findViewById(R.id.btnDetails);
        Button btnPricing = findViewById(R.id.btnPricing);
        Button btnDesigners = findViewById(R.id.btnDesigners);
        Button btnReviews = findViewById(R.id.btnReviews);

        btnDetails.setOnClickListener(v -> {
            // Already on this page
        });

        btnPricing.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PricingActivity.class)));
        btnDesigners.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, DesignersActivity.class)));
        btnReviews.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ReviewsActivity.class)));
    }
}
