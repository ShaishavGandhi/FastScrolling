package com.shaishavgandhi.fastscrolling;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerStateAdapter(mockData()));
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

    private List<State> mockData() {
        List<State> stateList = new ArrayList<>();
        stateList.add(new State("Alabama","AL"));
        stateList.add(new State("Alaska","AK"));
        stateList.add(new State("Alberta","AB"));
        stateList.add(new State("American Samoa","AS"));
        stateList.add(new State("Arizona","AZ"));
        stateList.add(new State("Arkansas","AR"));
        stateList.add(new State("Armed Forces (AE)","AE"));
        stateList.add(new State("Armed Forces Americas","AA"));
        stateList.add(new State("Armed Forces Pacific","AP"));
        stateList.add(new State("British Columbia","BC"));
        stateList.add(new State("California","CA"));
        stateList.add(new State("Colorado","CO"));
        stateList.add(new State("Connecticut","CT"));
        stateList.add(new State("Delaware","DE"));
        stateList.add(new State("District Of Columbia","DC"));
        stateList.add(new State("Florida","FL"));
        stateList.add(new State("Georgia","GA"));
        stateList.add(new State("Guam","GU"));
        stateList.add(new State("Hawaii","HI"));
        stateList.add(new State("Idaho","ID"));
        stateList.add(new State("Illinois","IL"));
        stateList.add(new State("Indiana","IN"));
        stateList.add(new State("Iowa","IA"));
        stateList.add(new State("Kansas","KS"));
        stateList.add(new State("Kentucky","KY"));
        stateList.add(new State("Louisiana","LA"));
        stateList.add(new State("Maine","ME"));
        stateList.add(new State("Manitoba","MB"));
        stateList.add(new State("Maryland","MD"));
        stateList.add(new State("Massachusetts","MA"));
        stateList.add(new State("Michigan","MI"));
        stateList.add(new State("Minnesota","MN"));
        stateList.add(new State("Mississippi","MS"));
        stateList.add(new State("Missouri","MO"));
        stateList.add(new State("Montana","MT"));
        stateList.add(new State("Nebraska","NE"));
        stateList.add(new State("Nevada","NV"));
        stateList.add(new State("New Brunswick","NB"));
        stateList.add(new State("New Hampshire","NH"));
        stateList.add(new State("New Jersey","NJ"));
        stateList.add(new State("New Mexico","NM"));
        stateList.add(new State("New York","NY"));
        stateList.add(new State("Newfoundland","NF"));
        stateList.add(new State("North Carolina","NC"));
        stateList.add(new State("North Dakota","ND"));
        stateList.add(new State("Northwest Territories","NT"));
        stateList.add(new State("Nova Scotia","NS"));
        stateList.add(new State("Nunavut","NU"));
        stateList.add(new State("Ohio","OH"));
        stateList.add(new State("Oklahoma","OK"));
        stateList.add(new State("Ontario","ON"));
        stateList.add(new State("Oregon","OR"));
        stateList.add(new State("Pennsylvania","PA"));
        stateList.add(new State("Prince Edward Island","PE"));
        stateList.add(new State("Puerto Rico","PR"));
        stateList.add(new State("Quebec","PQ"));
        stateList.add(new State("Rhode Island","RI"));
        stateList.add(new State("Saskatchewan","SK"));
        stateList.add(new State("South Carolina","SC"));
        stateList.add(new State("South Dakota","SD"));
        stateList.add(new State("Tennessee","TN"));
        stateList.add(new State("Texas","TX"));
        stateList.add(new State("Utah","UT"));
        stateList.add(new State("Vermont","VT"));
        stateList.add(new State("Virgin Islands","VI"));
        stateList.add(new State("Virginia","VA"));
        stateList.add(new State("Washington","WA"));
        stateList.add(new State("West Virginia","WV"));
        stateList.add(new State("Wisconsin","WI"));
        stateList.add(new State("Wyoming","WY"));
        stateList.add(new State("Yukon Territory","YT"));

        stateList.add(new State("Alabama","AL"));
        stateList.add(new State("Alaska","AK"));
        stateList.add(new State("Alberta","AB"));
        stateList.add(new State("American Samoa","AS"));
        stateList.add(new State("Arizona","AZ"));
        stateList.add(new State("Arkansas","AR"));
        stateList.add(new State("Armed Forces (AE)","AE"));
        stateList.add(new State("Armed Forces Americas","AA"));
        stateList.add(new State("Armed Forces Pacific","AP"));
        stateList.add(new State("British Columbia","BC"));
        stateList.add(new State("California","CA"));
        stateList.add(new State("Colorado","CO"));
        stateList.add(new State("Connecticut","CT"));
        stateList.add(new State("Delaware","DE"));
        stateList.add(new State("District Of Columbia","DC"));
        stateList.add(new State("Florida","FL"));
        stateList.add(new State("Georgia","GA"));
        stateList.add(new State("Guam","GU"));
        stateList.add(new State("Hawaii","HI"));
        stateList.add(new State("Idaho","ID"));
        stateList.add(new State("Illinois","IL"));
        stateList.add(new State("Indiana","IN"));
        stateList.add(new State("Iowa","IA"));
        stateList.add(new State("Kansas","KS"));
        stateList.add(new State("Kentucky","KY"));
        stateList.add(new State("Louisiana","LA"));
        stateList.add(new State("Maine","ME"));
        stateList.add(new State("Manitoba","MB"));
        stateList.add(new State("Maryland","MD"));
        stateList.add(new State("Massachusetts","MA"));
        stateList.add(new State("Michigan","MI"));
        stateList.add(new State("Minnesota","MN"));
        stateList.add(new State("Mississippi","MS"));
        stateList.add(new State("Missouri","MO"));
        stateList.add(new State("Montana","MT"));
        stateList.add(new State("Nebraska","NE"));
        stateList.add(new State("Nevada","NV"));
        stateList.add(new State("New Brunswick","NB"));
        stateList.add(new State("New Hampshire","NH"));
        stateList.add(new State("New Jersey","NJ"));
        stateList.add(new State("New Mexico","NM"));
        stateList.add(new State("New York","NY"));
        stateList.add(new State("Newfoundland","NF"));
        stateList.add(new State("North Carolina","NC"));
        stateList.add(new State("North Dakota","ND"));
        stateList.add(new State("Northwest Territories","NT"));
        stateList.add(new State("Nova Scotia","NS"));
        stateList.add(new State("Nunavut","NU"));
        stateList.add(new State("Ohio","OH"));
        stateList.add(new State("Oklahoma","OK"));
        stateList.add(new State("Ontario","ON"));
        stateList.add(new State("Oregon","OR"));
        stateList.add(new State("Pennsylvania","PA"));
        stateList.add(new State("Prince Edward Island","PE"));
        stateList.add(new State("Puerto Rico","PR"));
        stateList.add(new State("Quebec","PQ"));
        stateList.add(new State("Rhode Island","RI"));
        stateList.add(new State("Saskatchewan","SK"));
        stateList.add(new State("South Carolina","SC"));
        stateList.add(new State("South Dakota","SD"));
        stateList.add(new State("Tennessee","TN"));
        stateList.add(new State("Texas","TX"));
        stateList.add(new State("Utah","UT"));
        stateList.add(new State("Vermont","VT"));
        stateList.add(new State("Virgin Islands","VI"));
        stateList.add(new State("Virginia","VA"));
        stateList.add(new State("Washington","WA"));
        stateList.add(new State("West Virginia","WV"));
        stateList.add(new State("Wisconsin","WI"));
        stateList.add(new State("Wyoming","WY"));
        stateList.add(new State("Yukon Territory","YT"));

        return stateList;
    }
}
