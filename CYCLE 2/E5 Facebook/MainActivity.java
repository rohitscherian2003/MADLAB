package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView facebookView = findViewById(R.id.fbView);
        ImageView likeView = findViewById(R.id.likeView);
        ImageView commentView = findViewById(R.id.cmmntView);
        ImageView shareView = findViewById(R.id.shareView);

        likeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the like button");

            }
        });
        commentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the comment button");
            }
        });
        shareView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the share button");

            }
        });
    }
        private void showToast(String message)
        {
            Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}