package com.guy.common;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;

public class Activity_PanelBase extends AppCompatActivity {

    protected DataManagerBase dataManagerBase;

    private AppCompatImageView panel_IMG_question;
    private MaterialButton[] panel_BTN_answers;
    private AppCompatImageView[] panel_IMG_hearts;
    private Toast gameToast;
    private GameManager gameManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        findViews();
        gameToast = Toast.makeText(this, "", Toast.LENGTH_SHORT); // Initialize the Toast
        gameManager = new GameManager(dataManagerBase);
        next();
        setupButtonListeners();
    }

    private void next() {
        String image = gameManager.getCurrentImage();
        Glide.with(this).load(image).into(panel_IMG_question);

        String[] answers = gameManager.getAnswers();
        for (int i = 0; i < 4; i++) {
            panel_BTN_answers[i].setText(answers[i]);
        }
    }
    private void setupButtonListeners() {
        for (MaterialButton button : panel_BTN_answers) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("QuizApp", "Button pressed: " + ((MaterialButton) v).getText().toString());
                    handleAnswer(((MaterialButton) v).getText().toString());
                }
            });
        }
    }
    private void findViews() {
        panel_IMG_question = findViewById(R.id.panel_IMG_question);
        panel_BTN_answers = new MaterialButton[]{
                findViewById(R.id.panel_BTN_answer0),
                findViewById(R.id.panel_BTN_answer1),
                findViewById(R.id.panel_BTN_answer2),
                findViewById(R.id.panel_BTN_answer3),
        };
        panel_IMG_hearts = new AppCompatImageView[]{
                findViewById(R.id.panel_IMG_hearts0),
                findViewById(R.id.panel_IMG_hearts1),
                findViewById(R.id.panel_IMG_hearts2),
                findViewById(R.id.panel_IMG_hearts3),
        };
    }
    private void handleAnswer(String selectedAnswer) {



        if (!gameManager.checkAnswer(selectedAnswer)) {
             // Cancel any previous toast
            gameToast.setText("Wrong!");

            gameManager.decrementHeart();

            updateHeartsDisplay();
            if(!gameManager.isGameOver()) {
                gameManager.advanceToNextQuestion();
                next();
            }
            if (gameManager.isGameOver()) {
                showGameOverDialog();
                gameToast.setText("Game Over!");
            }
        } else {
            gameToast.setText("Correct!");
            gameManager.advanceToNextQuestion();
            next(); // Load next question
        }
        gameToast.show(); // Show the updated Toast message
    }
    private void showGameOverDialog() {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("Game Over")
//                .setMessage("Game Over! Want to try again?")
//                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        restartGame();  // Restart the game
//                    }
//                })
//                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();  // Close this activity
//                    }
//                });
//
//        AlertDialog dialog = builder.create();
//        dialog.show();
        Intent gameOverIntent = new Intent(this, GameOver.class);
        startActivity(gameOverIntent);

    }
    private void restartGame() {
        gameManager = new GameManager(dataManagerBase); // Reset the game manager
        next(); // Start with the first question
        restHearts(); // Reset heart display
    }
    private void updateHeartsDisplay() {
        // Update hearts display based on the number of remaining hearts
        for (int i = 0; i < panel_IMG_hearts.length; i++) {
            panel_IMG_hearts[i].setVisibility(i < gameManager.getHearts() ? View.VISIBLE : View.GONE);
        }
    }
    private void restHearts() {
        // Update hearts display based on the number of remaining hearts
        for (AppCompatImageView panelImgHeart : panel_IMG_hearts) {
            panelImgHeart.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        restartGame();
    }
}