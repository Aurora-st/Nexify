package com.example.nexify;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ReviewsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);

        // Optional: Set title in the ActionBar (if you're using one)
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Reviews");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enables back button
        }
    }

    // Handle the back button in the toolbar
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
