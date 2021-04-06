package com.example.mcsf19a015_assignment_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void urdu(View view) {

       Intent intent=new Intent(this,urdu.class);
       startActivity(intent);

    }

    public void english(View view) {

        Intent intent=new Intent(this, English.class);
        startActivity(intent);

    }

    public void counting(View view) {

        Intent intent=new Intent(this,counting.class);
        startActivity(intent);
    }

    public void poem(View view) {

        Intent intent=new Intent(this,poem.class);
        startActivity(intent);
    }
}