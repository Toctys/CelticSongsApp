package net.androidbootcamp.celticsongsapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    Button button1, button2;
    MediaPlayer mpjig, mpbagpipes;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.btnJig);
        button2 = (Button)findViewById(R.id.btnPipes);
        button1.setOnClickListener(bjig);
        button2.setOnClickListener(bbagpipes);
        mpjig = new MediaPlayer();
        mpjig = MediaPlayer.create(this, R.raw.jig);
        mpbagpipes = new MediaPlayer();
        mpbagpipes = MediaPlayer.create(this, R.raw.bagpipes);
        playing = 0;
    }
    Button.OnClickListener bjig= new Button.OnClickListener() {
    @Override
    public void onClick(View v) {
        switch(playing) {
            case 0:
                mpjig.start();
                playing = 1;
                button2.setText("Pause Irish Jig");
                button1.setVisibility(View.INVISIBLE);
                break;
            case 1:
                mpjig.pause();
                playing = 0;
                button2.setText("Play Irish Jig ");
                button1.setVisibility(View.VISIBLE);
                break;
        }

       }

};
    Button.OnClickListener bbagpipes= new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (playing) {
                case 0:
                    mpbagpipes.start();
                    playing = 1;
                    button2.setText("Pause Bagpipes Song");
                    button1.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpbagpipes.pause();
                    playing = 0;
                    button2.setText("Play Bagpipes Song");
                    button1.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}



