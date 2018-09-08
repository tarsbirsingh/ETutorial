package com.example.tarsbir.ecomtutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void mAbout(View view){
        Intent about = new Intent (this,About.class);
        startActivity(about);
}
    public void mTutorial(View view){
        Intent Tutorial = new Intent(this,TutorialActivity.class);
        startActivity(Tutorial);
    }
    public void askQuestion(View view){
        Intent i = new Intent(MainActivity.this,AskQuestion.class);
        startActivity(i);
    }
}
