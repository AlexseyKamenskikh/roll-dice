package ru.red.roll_dice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice1ImageView;
    private ImageView dice2ImageView;
    private Button rollButton;
    private TextView resultTextView;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice1ImageView = findViewById(R.id.dice1ImageView);
        dice2ImageView = findViewById(R.id.dice2ImageView);
        rollButton = findViewById(R.id.rollButton);
        resultTextView = findViewById(R.id.resultTextView);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int dice1Value = random.nextInt(6) + 1;
        int dice2Value = random.nextInt(6) + 1;

        setDiceImage(dice1ImageView, dice1Value);
        setDiceImage(dice2ImageView, dice2Value);

        int sum = dice1Value + dice2Value;
        resultTextView.setText("Выпало: " + dice1Value + " и " + dice2Value +
                " (Сумма: " + sum + ")");
    }

    private void setDiceImage(ImageView diceImageView, int value) {
        switch (value) {
            case 1:
                diceImageView.setImageResource(R.drawable.dice_1_1920);
                break;
            case 2:
                diceImageView.setImageResource(R.drawable.dice_2_1920);
                break;
            case 3:
                diceImageView.setImageResource(R.drawable.dice_3_1920);
                break;
            case 4:
                diceImageView.setImageResource(R.drawable.dice_4_1920);
                break;
            case 5:
                diceImageView.setImageResource(R.drawable.dice_5_1920);
                break;
            case 6:
                diceImageView.setImageResource(R.drawable.dice_6_1920);
                break;
        }
    }
}