package com.example.calcul_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public EditText num1;
    public EditText num2;
    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    public TextView result;

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

        num1 = (EditText) findViewById(R.id.editTextNumber);
        num2 = (EditText) findViewById(R.id.editTextNumber2);
        but1 = (Button) findViewById(R.id.button5);
        but2 = (Button) findViewById(R.id.button6);
        but3 = (Button) findViewById(R.id.button7);
        but4 = (Button) findViewById(R.id.button8);
        result = (TextView) findViewById(R.id.textView2);

    }

    public void plus(View view) {
        int answer = num1 + num2;
        result.setText(answer);

    }

    public void subtraction(View view) {
    }

    public void multipli(View view) {
    }

    public void division(View view) {
    }
}