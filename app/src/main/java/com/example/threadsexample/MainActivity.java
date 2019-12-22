package com.example.threadsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    private ProgressBar progressBar;
    private Button running;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        running=findViewById(R.id.button);
        clear=findViewById(R.id.button2);
        progressBar=findViewById(R.id.progressBar);

    }

    public void runCode(){
        textView.append("\n Running Code");
    }

    public void clearCode(){
        textView.setText("");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                runCode();
                break;
            case R.id.button2:
                clearCode();
                break;

        }
    }
}
