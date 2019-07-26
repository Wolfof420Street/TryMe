package com.wolf.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View windowView;
    private Button tryMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[] {Color.RED, Color.CYAN, Color.DKGRAY, Color.LTGRAY, Color.MAGENTA, Color.BLUE, Color.GREEN, Color.YELLOW, Color.GRAY, Color.WHITE};

        windowView = findViewById(R.id.windowViewId);


        tryMeButton = (Button) findViewById(R.id.tryMeButton);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int colorArrayLength = colors.length;

                Random random = new Random();
                int randomNum = random.nextInt(colorArrayLength);

                windowView.setBackgroundColor(colors[randomNum]);

            }
        });



    }
}
