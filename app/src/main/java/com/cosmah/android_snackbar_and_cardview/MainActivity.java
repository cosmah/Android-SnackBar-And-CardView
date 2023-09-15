package com.cosmah.android_snackbar_and_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnSnackBar;
    private ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent);
        btnSnackBar = findViewById(R.id.btnSnackBar);

        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create this method and use it to instantiate
                showSnackbar();
            }

            private void showSnackbar() {
                Snackbar.make(parent, "This is a snack bar", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Retry", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Retry Clicked", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setActionTextColor(Color.RED)
                        .setTextColor(Color.YELLOW)
                        .show();
            }
        });
    }
}