package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int[] im = {R.mipmap.a, R.mipmap.b, R.mipmap.c,
            R.mipmap.d, R.mipmap.e, R.mipmap.f,
            R.mipmap.g, R.mipmap.h, R.mipmap.i, R.mipmap.j};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.bt1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nb = (EditText)findViewById(R.id.ed1);
                ImageView img = (ImageView)findViewById(R.id.im1);
                int number = Integer.parseInt(nb.getText().toString());

                if (number == 1){
                    img.setImageResource(im[0]);
                }
                else if (number == 2){
                    img.setImageResource(im[1]);
                }
                else if (number == 3){
                    img.setImageResource(im[2]);
                }
                else if (number == 4){
                    img.setImageResource(im[3]);
                }
                else if (number == 5){
                    img.setImageResource(im[4]);
                }
                else if (number == 6){
                    img.setImageResource(im[5]);
                }
                else if (number == 7){
                    img.setImageResource(im[6]);
                }
                else if (number == 8){
                    img.setImageResource(im[7]);
                }
                else if (number == 9){
                    img.setImageResource(im[8]);
                }
                else if (number == 10){
                    img.setImageResource(im[9]);
                }
            }
        });
    }
}