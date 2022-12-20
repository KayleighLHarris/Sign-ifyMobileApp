package com.example.sign_ifymobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGenConvoActivity(View view1){
        Intent intent1 = new Intent(this, GenConvoActivity.class);
        startActivity(intent1);
    }

    public void openAlphabetActivity(View view2){
        Intent intent2 = new Intent(this, AlphabetActivity.class);
        startActivity(intent2);
    }

    public void openDirectActivity(View view3){
        Intent intent3 = new Intent(this, DirectActivity.class);
        startActivity(intent3);
    }

    public void openEmotionsActivity(View view4){
        Intent intent4 = new Intent(this, EmotionsActivity.class);
        startActivity(intent4);
    }

    public void openNumbersActivity(View view5){
        Intent intent5 = new Intent(this, NumbersActivity.class);
        startActivity(intent5);
    }

    public void openQuestionsActivity(View view6){
        Intent intent6 = new Intent(this, QuestionsActivity.class);
        startActivity(intent6);
    }
}