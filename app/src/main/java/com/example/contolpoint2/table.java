package com.example.contolpoint2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class table extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
        Button button3  = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(this::onClick1);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(this::onClick2);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(this::onClick3);

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(this::onClick4);

        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView5.setOnClickListener(this::onClick5);

        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        imageView6.setOnClickListener(this::onClick6);



    }
    @Override
    public void onClick(View view){
        Intent intent = new Intent(table.this, MainActivity.class);
        startActivity(intent);
    }


    public void onClick1(View view){
        Intent intent = new Intent(table.this, ViewResourceActivity.class);
        intent.putExtra("filename","anima1.png");
        startActivity(intent);
    }

    public void onClick2(View view){
        Intent intent = new Intent(table.this, ViewResourceActivity.class);
        intent.putExtra("filename","anima2.png");
        startActivity(intent);
    }

    public void onClick3(View view){
        Intent intent = new Intent(table.this, ViewResourceActivity.class);
        intent.putExtra("filename","cat2.png");
        startActivity(intent);
    }

    public void onClick4(View view){
        Intent intent = new Intent(table.this, ViewResourceActivity.class);
        intent.putExtra("filename","cat1.png");
        startActivity(intent);
    }

    public void onClick5(View view){
        Intent intent = new Intent(table.this, ViewResourceActivity.class);
        intent.putExtra("filename","anima4.png");
        startActivity(intent);
    }

    public void onClick6(View view){
        Intent intent = new Intent(table.this, ViewResourceActivity.class);
        intent.putExtra("filename","anima3.png");
        startActivity(intent);
    }


}
