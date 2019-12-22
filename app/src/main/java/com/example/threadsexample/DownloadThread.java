package com.example.threadsexample;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;

public class DownloadThread extends Thread {

    @Override
    public void run() {
        downloadSong();
    }

    private void downloadSong(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.e("Nigga","Completed");



    }
}
