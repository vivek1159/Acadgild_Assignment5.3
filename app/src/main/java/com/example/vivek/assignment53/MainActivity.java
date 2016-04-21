package com.example.vivek.assignment53;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter ad;
    String Courses[] = {"Java","Android","Hadoop","Robotics","Front-end Dev.","Node JS",
            "Cloud Computing","Digital Marketing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView=(ListView)findViewById(R.id.listView);

        ad = new ArrayAdapter(this,R.layout.list_view_layout, Courses);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent mentor = new Intent(MainActivity.this,MentorName.class);
                if (Courses[position].equals("Java"))
                {
                    mentor.putExtra("Name","Tabish");
                }
                else if (Courses[position].equals("Android"))
                {
                    mentor.putExtra("Name","Deepti");
                }
                else if (Courses[position].equals("Hadoop"))
                {
                    mentor.putExtra("Name","John");
                }
                else if (Courses[position].equals("Robotics"))
                {
                    mentor.putExtra("Name","Deepali");
                }
                else if (Courses[position].equals("Front-end Dev."))
                {
                    mentor.putExtra("Name","Alex");
                }
                else if (Courses[position].equals("Node JS"))
                {
                    mentor.putExtra("Name","Ravi");
                }
                else if (Courses[position].equals("Cloud Computing"))
                {
                    mentor.putExtra("Name","Abhijeet");
                }
                else if (Courses[position].equals("Digital Marketing"))
                {
                    mentor.putExtra("Name","Suman");
                }
                startActivity(mentor);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
