package com.example.kkoikrzyzyk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView sign1 = findViewById(R.id.imageView1);
    ImageView sign2 = findViewById(R.id.imageView2);
    ImageView sign3 = findViewById(R.id.imageView3);
    ImageView sign4 = findViewById(R.id.imageView4);
    ImageView sign5 = findViewById(R.id.imageView5);
    ImageView sign6 = findViewById(R.id.imageView6);
    ImageView sign7 = findViewById(R.id.imageView7);
    ImageView sign8 = findViewById(R.id.imageView8);
    ImageView sign9 = findViewById(R.id.imageView9);
    Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startGame();
    }

    public Integer moveCounter() {
        return counter += 1;
    }

    public void showsign(View view) {
        ImageView sign = findViewById(view.getId());
        if (sign.getDrawable() == null & counter % 2 == 0) {
            sign.setImageResource(R.drawable.kolko);
            //if(moveCounter()>6){
                //kolkowinCheck();
                //   krzyzykwinCheck();
            //}
            moveCounter();
        } else if (sign.getDrawable() == null & counter % 2 == 1) {
            sign.setImageResource(R.drawable.krzyzyk);
            moveCounter();
        }
    }

    public void resetGame(View view) {
        sign1.setImageDrawable(null);
        sign2.setImageDrawable(null);
        sign3.setImageDrawable(null);
        sign4.setImageDrawable(null);
        sign5.setImageDrawable(null);
        sign6.setImageDrawable(null);
        sign7.setImageDrawable(null);
        sign8.setImageDrawable(null);
        sign9.setImageDrawable(null);
    }

    public void startGame() {
        sign1.setImageDrawable(null);
        sign2.setImageDrawable(null);
        sign3.setImageDrawable(null);
        sign4.setImageDrawable(null);
        sign5.setImageDrawable(null);
        sign6.setImageDrawable(null);
        sign7.setImageDrawable(null);
        sign8.setImageDrawable(null);
        sign9.setImageDrawable(null);
    }

    public boolean kolkowinCheck() {
        boolean kolko1 = sign1.getDrawable().equals(R.drawable.kolko);
        boolean kolko2 = sign2.getDrawable().equals(R.drawable.kolko);
        boolean kolko3 = sign3.getDrawable().equals(R.drawable.kolko);
        boolean kolko4 = sign4.getDrawable().equals(R.drawable.kolko);
        boolean kolko5 = sign5.getDrawable().equals(R.drawable.kolko);
        boolean kolko6 = sign6.getDrawable().equals(R.drawable.kolko);
        boolean kolko7 = sign7.getDrawable().equals(R.drawable.kolko);
        boolean kolko8 = sign8.getDrawable().equals(R.drawable.kolko);
        boolean kolko9 = sign9.getDrawable().equals(R.drawable.kolko);
        if (kolko1 & kolko2 & kolko3) {
            return true;
        } else if (kolko4 & kolko5 & kolko6) {
            return true;
        } else if (kolko7 & kolko8 & kolko9) {
            return true;
        } else if (kolko1 & kolko4 & kolko7) {
            return true;
        } else if (kolko2 & kolko5 & kolko8) {
            return true;
        } else if (kolko3 & kolko6 & kolko9) {
            return true;
        } else if (kolko1 & kolko5 & kolko9) {
            return true;
        } else if (kolko3 & kolko5 & kolko7) {
            return true;
        } else
            return false;
    }

    public boolean krzyzykwinCheck() {
        @SuppressLint("UseCompatLoadingForDrawables") Drawable favoriteBorder = getResources().getDrawable(R.drawable.krzyzyk);
        drawable.getConstantState().equals(favoriteBorder.getConstantState());
        boolean krzyzyk1 = sign1.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk2 = sign2.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk3 = sign3.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk4 = sign4.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk5 = sign5.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk6 = sign6.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk7 = sign7.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk8 = sign8.getDrawable().equals(R.drawable.krzyzyk);
        boolean krzyzyk9 = sign9.getDrawable().equals(R.drawable.krzyzyk);
        if (krzyzyk1 & krzyzyk2 & krzyzyk3) {
            return true;
        } else if (krzyzyk4 & krzyzyk5 & krzyzyk6) {
            return true;
        } else if (krzyzyk7 & krzyzyk8 & krzyzyk9) {
            return true;
        } else if (krzyzyk1 & krzyzyk4 & krzyzyk7) {
            return true;
        } else if (krzyzyk2 & krzyzyk5 & krzyzyk8) {
            return true;
        } else if (krzyzyk3 & krzyzyk6 & krzyzyk9) {
            return true;
        } else if (krzyzyk1 & krzyzyk5 & krzyzyk9) {
            return true;
        } else if (krzyzyk3 & krzyzyk5 & krzyzyk7) {
            return true;
        } else return false;
    }
}