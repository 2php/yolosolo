package com.example.yolosolo.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class YoloActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yolo);

        final Button mewtwo_button = (Button) findViewById(R.id.mewtwo_butts);
        mewtwo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMewtwo(mewtwo_button);
            }
        });
    }

    public void showMewtwo(Button button) {
        final Button mewtwo_button = button;
        ImageView mewtwo = (ImageView) findViewById(R.id.mewtwo);
        mewtwo.setVisibility(View.VISIBLE);
        mewtwo_button.setText("You Insolent Fool");
        mewtwo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideMewtwo(mewtwo_button);
            }
        });
    }

    public void hideMewtwo(Button button) {
        final Button mewtwo_button = button;
        ImageView mewtwo = (ImageView) findViewById(R.id.mewtwo);
        mewtwo.setVisibility(View.INVISIBLE);
        mewtwo_button.setText("Summon Mewtwo");
        mewtwo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMewtwo(mewtwo_button);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_yolo, menu);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.pokedex) {
            Intent openPoke = new Intent(this, PokedexActivity.class);
            startActivity(openPoke);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
