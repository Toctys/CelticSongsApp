package net.androidbootcamp.celticsongsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;

public class SlashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slash);
        TimerTask task = new TimerTask( ) {

            @Override
            public void run() {
                finish();
                startActivity(new Intent(SlashActivity.this, Activity.class));
            }
        };
        Timer opening = new Timer( );
        opening.schedule(task, 4000);




    }
}
