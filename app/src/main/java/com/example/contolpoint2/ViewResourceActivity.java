package com.example.contolpoint2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewres);

        Intent intent = getIntent();
        String value = intent.getStringExtra("filename");
        ImageView imageView = (ImageView) findViewById(R.id.imageView1) ;

        switch (value) {
            case "anima1.png":
                imageView.setImageResource(R.drawable.anima1);
                break;
            case "anima2.png":
                imageView.setImageResource(R.drawable.anima2);
                break;
            case "cat1.png":
                imageView.setImageResource(R.drawable.cat1);
                break;
            case "cat2.png":
                imageView.setImageResource(R.drawable.cat2);
                break;
            case "anima3.png":
                imageView.setImageResource(R.drawable.anima3);
                break;
            case "anima6.png":
                imageView.setImageResource(R.drawable.anima4);
                break;
        }
    }

}
