package com.example.vivek.assignment53;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MentorName extends AppCompatActivity {

    TextView mentorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_name);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mentorName=(TextView)findViewById(R.id.mentorName);

        Intent intent = getIntent();

        String name=intent.getStringExtra("Name");

        mentorName.setText(name);
    }

}
