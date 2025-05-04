package com.example.havennly;
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
        Button btnDesigners = findViewById(R.id.btnDesigners);

        btnDetails.setOnClickListener(v -> startActivity(new Intent(this, MainActivity.class)));
        btnDesigners.setOnClickListener(v -> startActivity(new Intent(this, DesignersActivity.class)));
    }
}