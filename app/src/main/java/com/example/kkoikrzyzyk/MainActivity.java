package com.example.kkoikrzyzyk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Integer counter=0;
    boolean isSign1=true;
    boolean isSign2=true;
    boolean isSign3=true;
    boolean isSign4=true;
    boolean isSign5=true;
    boolean isSign6=true;
    boolean isSign7=true;
    boolean isSign8=true;
    boolean isSign9=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moveCounter(){
        counter += 1;
    }
    public void showsign10(View view) {
        ImageView sign = findViewById(R.id.imageView9);
        if (isSign9 & counter % 2 == 0) {
            sign.setImageResource(R.drawable.kolko);
            isSign9 = !isSign9;
            moveCounter();
        } else if (isSign9 & counter % 2 == 1) {
            sign.setImageResource(R.drawable.krzyzyk);
            isSign9 = !isSign9;
            moveCounter();
        }
    }
    public void showsign(View view){
        int IVID=view.getId();
        ImageView sign=findViewById(IVID);
        if(sign.getDrawable()==null & counter % 2 == 0) {
            sign.setImageResource(R.drawable.kolko);
            moveCounter();
        }
        else if (sign.getDrawable()==null&counter%2==1) {
            sign.setImageResource(R.drawable.krzyzyk);
            moveCounter();
        }
    }
}