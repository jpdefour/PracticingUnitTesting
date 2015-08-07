package com.riis.testingproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    Button changeTextButton = null;
    Button crazyButton = null;
    TextView changeTextView = null;
    CrazyStuff crazyStuff = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextButton = (Button) findViewById(R.id.changeTextButton);
        crazyButton = (Button) findViewById(R.id.crazyButton);
        changeTextView = (TextView) findViewById(R.id.changeText);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeLabelText();
            }
        });
        crazyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCrazyLand();
            }
        });
    }

    private void goToCrazyLand() {
        Random random = new Random();
        try {
            crazyStuff.doACrazyThing(random.nextInt(10));
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    public void changeLabelText() {
        changeTextView.setText("I got changed!");

    }
}
