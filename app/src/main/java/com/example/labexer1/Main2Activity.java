package com.example.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void ustWebsiteOnClick(View v){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.ust.edu.ph"));
        startActivity(intent);
    }

    public void myUSTeOnClick(View v){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://myuste.ust.edu.ph/student/"));
        startActivity(intent);
    }

    public void blackboardOnClick(View v){
        Intent intent = new Intent (Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://ust.blackboard.com/"));
        startActivity(intent);
    }
}
