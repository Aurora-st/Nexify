package com.example.havennly;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDesigners = findViewById(R.id.btnDesigners);
        Button btnReviews = findViewById(R.id.btnReviews);

        btnDesigners.setOnClickListener(v -> startActivity(new Intent(this, DesignersActivity.class)));
        btnReviews.setOnClickListener(v -> startActivity(new Intent(this, ReviewsActivity.class)));
    }
}