package com.example.nexify;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class DesignVirtuallyActivity extends AppCompatActivity {

    private ImageView previewImage;
    private ActivityResultLauncher<Void> takePictureLauncher;
    private ActivityResultLauncher<String> requestPermissionLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_virtually);

        Button takePhotoButton = findViewById(R.id.takePhotoButton);
        ImageView previewImage = findViewById(R.id.previewImage); // ✅ correct

        // Register permission launcher
        requestPermissionLauncher = registerForActivityResult(
                new ActivityResultContracts.RequestPermission(),
                isGranted -> {
                    if (isGranted) {
                        launchCamera();
                    } else {
                        Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        // Register camera launcher
        takePictureLauncher = registerForActivityResult(
                new ActivityResultContracts.TakePicturePreview(),
                result -> {
                    if (result != null) {
                        previewImage.setImageBitmap(result);
                        Toast.makeText(this, "Photo captured!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "No photo taken", Toast.LENGTH_SHORT).show();
                    }
                }
        );

        takePhotoButton.setOnClickListener(v -> {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                    == PackageManager.PERMISSION_GRANTED) {
                launchCamera();
            } else {
                requestPermissionLauncher.launch(Manifest.permission.CAMERA);
            }
        });
    }

    private void launchCamera() {
        takePictureLauncher.launch(null);
    }
}
