package com.example.android.app21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtSportName=(TextView) findViewById(R.id.txtSportName);
        TextView txtScores=(TextView) findViewById(R.id.txtScores);
        TextView txtScoresAverage=(TextView)findViewById(R.id.txtScoresAverage);
        TextView txtHighestScore=(TextView) findViewById(R.id.txtHighestScore);
        TextView txtLowestScore=(TextView) findViewById(R.id.txtLowestScore);

        int[] scoresArray={87,84,95,12,27,9,5,63,72,81,90,18,45};
        Sport mySport=new Sport("Boxing",scoresArray);
        txtSportName.setText(mySport.getSportName());
        mySport.letsOutputTheScores(txtScores);
        txtScoresAverage.setText(mySport.getTheAverageValue() + "");
        txtHighestScore.setText(mySport.getTheMaximumValue() + "");
        txtLowestScore.setText(mySport.getTheMinimumValue() + "");
    }
}
