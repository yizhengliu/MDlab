package com.example.lab;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = findViewById(R.id.WebView);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://www.cs.nott.ac.uk/~pszmdf/comp3018/index.html");
        webview.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String
                    contentDisposition, String mimetype, long contentLength) {

            }
        });
    }
}