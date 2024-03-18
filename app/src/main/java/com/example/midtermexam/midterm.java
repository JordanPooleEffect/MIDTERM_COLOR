package com.example.midtermexam;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class midterm extends AppCompatActivity {

    Button btn, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnExit;
    private boolean isClick = false;

    private boolean hasWon() {
        if(btn.getTextColors() == btn2.getTextColors()) {
            return true;
        } else {
            return false;
        }
    }

    private int colors[] = {Color.RED, Color.BLUE, Color.GREEN};
    private int color1[] = {Color.RED, Color.BLUE,Color.GREEN};
    private int color2[] = {Color.BLUE, Color.GREEN, Color.RED};
    private int color3[] = {Color.GREEN, Color.RED, Color.BLUE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.midterm_wow);

        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btnExit = (Button) findViewById(R.id.btnReturn);

        int randomInd = new Random().nextInt(colors.length);
        int randomColor = colors[randomInd];
        int color = color1[randomInd];
        int colors1 = color2[randomInd];
        int colors2 = color3[randomInd];

        btn.setBackgroundColor(color);
        btn2.setBackgroundColor(randomColor);
        btn3.setBackgroundColor(colors1);
        btn4.setBackgroundColor(colors1);
        btn5.setBackgroundColor(randomColor);
        btn6.setBackgroundColor(colors2);
        btn7.setBackgroundColor(randomColor);
        btn8.setBackgroundColor(randomColor);
        btn9.setBackgroundColor(colors2);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                //int colors3 = color1[randomInd];
                int color1 = color2[randomInd];
                int color2 = color3[randomInd];
                if(isClick) {
                    btn.setBackgroundColor(color1);
                    btn2.setBackgroundColor(randomColor);
                    btn3.setBackgroundColor(color1);
                    btn4.setBackgroundColor(color1);
                    btn5.setBackgroundColor(randomColor);
                    btn6.setBackgroundColor(color2);
                    btn7.setBackgroundColor(randomColor);
                    btn8.setBackgroundColor(randomColor);
                    btn9.setBackgroundColor(color2);
                }
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                   // btn.setBackgroundColor(colors2);
                    btn2.setBackgroundColor(randomColor);
                    btn4.setBackgroundColor(randomColor);
                }
                if(btn.getBackground() == btn9.getBackground()) {
                    Toast toast = Toast.makeText(midterm.this, "You Won!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn.setBackgroundColor(randomColor);
                    btn3.setBackgroundColor(randomColor);
                    btn5.setBackgroundColor(randomColor);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn2.setBackgroundColor(randomColor);
                    btn6.setBackgroundColor(randomColor);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn.setBackgroundColor(randomColor);
                    btn5.setBackgroundColor(randomColor);
                    btn7.setBackgroundColor(randomColor);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn2.setBackgroundColor(randomColor);
                    btn4.setBackgroundColor(randomColor);
                    btn6.setBackgroundColor(randomColor);
                    btn9.setBackgroundColor(randomColor);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn3.setBackgroundColor(randomColor);
                    btn5.setBackgroundColor(randomColor);
                    btn8.setBackgroundColor(randomColor);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn4.setBackgroundColor(randomColor);
                    btn9.setBackgroundColor(randomColor);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn5.setBackgroundColor(randomColor);
                    btn7.setBackgroundColor(randomColor);
                    btn8.setBackgroundColor(randomColor);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isClick = true;
                int randomInd = new Random().nextInt(colors.length);
                int randomColor = colors[randomInd];
                if(isClick) {
                    btn6.setBackgroundColor(randomColor);
                    btn9.setBackgroundColor(randomColor);
                }
            }
        });
    }


}