package com.example.havennly;
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
        Button btnReviews = findViewById(R.id.btnReviews);

        btnDetails.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
        btnReviews.setOnClickListener(v -> startActivity(new Intent(this, ReviewsActivity.class)));
    }
}