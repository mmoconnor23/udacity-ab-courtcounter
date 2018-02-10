package us.melissamattingly.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 for Team A.
     */
    public void addThree(View view) {
        displayForTeamA(scoreTeamA += 3);
    }

    /**
     * Adds 2 for Team A.
     */
    public void addTwo(View view) {
        displayForTeamA(scoreTeamA += 2);
    }

    /**
     * Adds 1 for Team A.
     */
    public void addOne(View view) {
        displayForTeamA(scoreTeamA += 1);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 for Team B.
     */
    public void addThreeB(View view) {
        displayForTeamB(scoreTeamB += 3);
    }

    /**
     * Adds 2 for Team B.
     */
    public void addTwoB(View view) {
        displayForTeamB(scoreTeamB += 2);
    }

    /**
     * Adds 1 for Team B.
     */
    public void addOneB(View view) {
        displayForTeamB(scoreTeamB += 1);
    }

    /**
     * Reset both scores.
     */
    public void reset(View view) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }
}
