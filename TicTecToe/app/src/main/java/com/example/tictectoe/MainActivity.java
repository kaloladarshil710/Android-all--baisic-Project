package com.example.tictectoe;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnOpponent;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    boolean isPlayingWithFriend = false;
    boolean isPlayer1Turn = true; // Player 1's turn to start with
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnOpponent = findViewById(R.id.btnOpponent);
    }

    public void selectOpponent(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Choose Opponent");
        final String[] options = {"Play with Friend", "Play with Computer"};
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    isPlayingWithFriend = true;
                    Toast.makeText(MainActivity.this, "Playing with a Friend", Toast.LENGTH_SHORT).show();
                } else {
                    isPlayingWithFriend = false;
                    Toast.makeText(MainActivity.this, "Playing with Computer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.show();
    }

    public void Check(View view) {
        Button btnCurrent = (Button) view;

        if (btnCurrent.getText().toString().isEmpty()) {
            if (isPlayer1Turn) {
                btnCurrent.setText("X"); // Player 1 always plays with 'X'
            } else {
                btnCurrent.setText("O"); // Player 2 always plays with 'O'
            }
            count++;
            checkGameState();
            isPlayer1Turn = !isPlayer1Turn; // Switch turns
        }
    }

    private void checkGameState() {
        // Get current text on all buttons
        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        b9 = btn9.getText().toString();

        // Check for winner
        if (b1.equals(b2) && b2.equals(b3) && !b1.isEmpty()) {
            showWinnerToast(b1);
        } else if (b4.equals(b5) && b5.equals(b6) && !b4.isEmpty()) {
            showWinnerToast(b4);
        } else if (b7.equals(b8) && b8.equals(b9) && !b7.isEmpty()) {
            showWinnerToast(b7);
        } else if (b1.equals(b4) && b4.equals(b7) && !b1.isEmpty()) {
            showWinnerToast(b1);
        } else if (b2.equals(b5) && b5.equals(b8) && !b2.isEmpty()) {
            showWinnerToast(b2);
        } else if (b3.equals(b6) && b6.equals(b9) && !b3.isEmpty()) {
            showWinnerToast(b3);
        } else if (b1.equals(b5) && b5.equals(b9) && !b1.isEmpty()) {
            showWinnerToast(b1);
        } else if (b3.equals(b5) && b5.equals(b7) && !b3.isEmpty()) {
            showWinnerToast(b3);
        } else if (count == 9) {
            Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show();
            restartAfterDelay();
        }
    }

    private void showWinnerToast(String winner) {
        Toast.makeText(this, "Winner is: " + winner, Toast.LENGTH_SHORT).show();
        disableAllButtons(); // Disable all buttons after a winner is declared
        restartAfterDelay(); // Restart the game after a delay
    }

    private void disableAllButtons() {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    private void restartAfterDelay() {
        // Delay restart by 5 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count = 0;
                isPlayer1Turn = true; // Player 1 starts again
                enableAllButtons(); // Enable all buttons again
            }
        }, 5000); // 5000 milliseconds = 5 seconds
    }

    private void enableAllButtons() {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }
}
