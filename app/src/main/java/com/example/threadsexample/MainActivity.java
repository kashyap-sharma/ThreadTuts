package com.example.threadsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView textView;
    private ProgressBar progressBar;
    private Button running;
    private Button clear;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        running=findViewById(R.id.button);
        clear=findViewById(R.id.button2);
        progressBar=findViewById(R.id.progressBar2);
        running.setOnClickListener(this);
        clear.setOnClickListener(this);
        handler=new Handler(getMainLooper()){
            @Override
            public void handleMessage(Message msg){
                Log.e("Nigga", msg.getData().getString("data") );

            }
        };


    }

    public void runCode(){

        DownloadThread downloadThread =new DownloadThread();
        downloadThread.setName("Download Thread");
        downloadThread.start();



       // Thread thread = new Thread(runnable);
        //thread.run(); // it wont create a new thread

      //  thread.start();

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
