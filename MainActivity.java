package com.example.dice_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView1 = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView4);
    }

    public void randomDice(View view) {

        Random random = new Random();
        int randomnumber1 = random.nextInt(5);
        int randomnumber2 = random.nextInt(5);

        if (randomnumber1 == 0){
            imageView1 = findViewById(R.id.imageView3);
            imageView1.setImageResource(R.drawable.one);
        }

        if (randomnumber1 == 1){
            imageView1 = findViewById(R.id.imageView3);
            imageView1.setImageResource(R.drawable.two);
        }

        if (randomnumber1 == 2){
            imageView1 = findViewById(R.id.imageView3);
            imageView1.setImageResource(R.drawable.three);
        }

        if (randomnumber1 == 3){
            imageView1 = findViewById(R.id.imageView3);
            imageView1.setImageResource(R.drawable.four);
        }

        if (randomnumber1 == 4){
            imageView1 = findViewById(R.id.imageView3);
            imageView1.setImageResource(R.drawable.five);
        }

        if (randomnumber1 == 5){
            imageView1 = findViewById(R.id.imageView3);
            imageView1.setImageResource(R.drawable.six);
        }

        if (randomnumber2 == 0){
            imageView2 = findViewById(R.id.imageView4);
            imageView2.setImageResource(R.drawable.one);
        }

        if (randomnumber2 == 1){
            imageView2 = findViewById(R.id.imageView4);
            imageView2.setImageResource(R.drawable.two);
        }

        if (randomnumber2 == 2){
            imageView2 = findViewById(R.id.imageView4);
            imageView2.setImageResource(R.drawable.three);
        }

        if (randomnumber2 == 3){
            imageView2 = findViewById(R.id.imageView4);
            imageView2.setImageResource(R.drawable.four);
        }

        if (randomnumber2 == 4){
            imageView2 = findViewById(R.id.imageView4);
            imageView2.setImageResource(R.drawable.five);
        }

        if (randomnumber2 == 5){
            imageView2 = findViewById(R.id.imageView4);
            imageView2.setImageResource(R.drawable.six);
        }
        //textViewRandomNumber.setText("난수: " + randomnumber);


    }
}