package com.example.catherinaxu.mrpotatohead;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;


public class MainActivity extends ActionBarActivity {
    public void chooseVisible(ImageView body_part, RadioButton button) {
        if (button.isSelected()) {
            body_part.setVisibility(View.VISIBLE);
        } else {
            body_part.setVisibility(View.INVISIBLE);
        }
    }
    public void selectRadioButton(RadioButton button) {
        if (button.isSelected()) {
            button.setChecked (false);
            button.setSelected (false);
            button.setClickable(true);
        } else {
            button.setChecked(true);
            button.setSelected (true);
            button.setClickable(true);
        }
    }

    public void selectHat(View view) {
        RadioButton hat_button = (RadioButton) findViewById(R.id.hat_yes);
        selectRadioButton(hat_button);
        ImageView hat = (ImageView) findViewById(R.id.hat);
        chooseVisible(hat, hat_button);
    }

    public void selectEyebrows(View view) {
        RadioButton eyebrows_button = (RadioButton) findViewById(R.id.eyebrows_yes);
        selectRadioButton(eyebrows_button);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        chooseVisible(eyebrows, eyebrows_button);
    }

    public void selectNose(View view) {
        RadioButton nose_button = (RadioButton) findViewById(R.id.nose_yes);
        selectRadioButton(nose_button);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        chooseVisible(nose, nose_button);
    }

    public void selectMustache(View view) {
        RadioButton mustache_button = (RadioButton) findViewById(R.id.mustache_yes);
        selectRadioButton(mustache_button);
        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        chooseVisible(mustache, mustache_button);
    }

    public void selectArms(View view) {
        RadioButton arms_button = (RadioButton) findViewById(R.id.arms_yes);
        selectRadioButton(arms_button);
        ImageView arms = (ImageView) findViewById(R.id.arms);
        chooseVisible(arms, arms_button);
    }

    public void selectEyes(View view) {
        RadioButton eyes_button = (RadioButton) findViewById(R.id.eyes_yes);
        selectRadioButton(eyes_button);
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        chooseVisible(eyes, eyes_button);
    }

    public void selectGlasses(View view) {
        RadioButton glasses_button = (RadioButton) findViewById(R.id.glasses_yes);
        selectRadioButton(glasses_button);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        chooseVisible(glasses, glasses_button);
    }

    public void selectMouth(View view) {
        RadioButton mouth_button = (RadioButton) findViewById(R.id.mouth_yes);
        selectRadioButton(mouth_button);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        chooseVisible(mouth, mouth_button);
    }

    public void selectEars(View view) {
        RadioButton ears_button = (RadioButton) findViewById(R.id.ears_yes);
        selectRadioButton(ears_button);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        chooseVisible(ears, ears_button);
    }

    public void selectShoes(View view) {
        RadioButton shoes_button = (RadioButton) findViewById(R.id.shoes_yes);
        selectRadioButton(shoes_button);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        chooseVisible(shoes, shoes_button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
