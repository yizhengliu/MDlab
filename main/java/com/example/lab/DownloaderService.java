package com.example.lab;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class DownloaderService extends IntentService {
    public DownloaderService(){
        super("DownloaderService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
