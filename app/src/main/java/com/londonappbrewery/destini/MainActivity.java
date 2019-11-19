package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button topButtonRed;
    private Button BottomButtonBlue;
    private TextView storyText;
    private boolean isAT3 = false;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topButtonRed = findViewById(R.id.buttonTop);
        BottomButtonBlue = findViewById(R.id.buttonBottom);
        storyText = findViewById(R.id.storyTextView);

        topButtonRed.setText(R.string.T1_Ans1);
        BottomButtonBlue.setText(R.string.T1_Ans2);
        storyText.setText(R.string.T1_Story);



        topButtonRed.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
             if (mStoryIndex==1){
                 storyText.setText(R.string.T3_Story);
                 topButtonRed.setText(R.string.T3_Ans1);
                 BottomButtonBlue.setText(R.string.T3_Ans2);
                 isAT3 = true;
                 mStoryIndex++;
             }

             else if (mStoryIndex == 2 && isAT3 == true){
                 storyText.setText(R.string.T6_End);
             }

             else if (mStoryIndex == 2 && isAT3 == false){
                 storyText.setText(R.string.T3_Story);
                 topButtonRed.setText(R.string.T3_Ans1);
                 BottomButtonBlue.setText(R.string.T3_Ans2);
                 isAT3 = true;
                 mStoryIndex++;
             }
             else {storyText.setText(R.string.T6_End);}
           }
       });




        BottomButtonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex==1){
                    mStoryIndex++;
                    storyText.setText(R.string.T2_Story);
                    topButtonRed.setText(R.string.T2_Ans1);
                    BottomButtonBlue.setText(R.string.T2_Ans2);
                }

                else if (mStoryIndex==2&& isAT3==false){
                  storyText.setText(R.string.T4_End);
                }

                else {
                    storyText.setText(R.string.T5_End);
                }

            }


        });

    }
}
