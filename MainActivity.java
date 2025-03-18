package com.example.edittext_task;

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

    //에디트텍스트 tText;
    //버튼 tButton;
    //텍스트뷰 tTextView;

    public EditText tText1;
    public EditText tText2;
    public EditText tText3;
    public Button tButton;
    public TextView tTextView1;
    public TextView tTextView2;
    public TextView tTextView3;

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
        tText1 = (EditText) findViewById(R.id.editTextText);
        tText2 = (EditText) findViewById(R.id.editTextTextPassword2);
        tText3 = (EditText) findViewById(R.id.editTextPhone);
        tButton = (Button) findViewById(R.id.button);
        tTextView1 = (TextView) findViewById(R.id.textView01);
        tTextView2 = (TextView) findViewById(R.id.textView02);
        tTextView3 = (TextView) findViewById(R.id.textView03);

    }

    public void tonClicked(View view) {

        String str1 = tText1.getText().toString();
        tTextView1.setText("아이디: " + str1);
        String str2 = tText2.getText().toString();
        tTextView2.setText("패스워드: " + str2);
        String str3 = tText3.getText().toString();
        tTextView3.setText("전화번호: " + str3);

        /* tTextView.setText("아이디: " + str1);
        tTextView.setText("패스워드: " + str2);
        tTextView.setText("전화번호: " + str3); */
    }
}