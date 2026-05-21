package com.amanuel.axumtour;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // አንድሮይድ ስቱዲዮ ሳይኖር ቀጥታ በኮድ WebView መፍጠር
        webView = new WebView(this);
        
        // የጃቫስክሪፕት ፍቃድ መስጠት
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // ሊንኮች እዚያው አፑ ውስጥ እንዲከፈቱ ማድረግ
        webView.setWebViewClient(new WebViewClient());

        // ያንተን የ GitHub ቱሪስት ጋይድ ገጽ መጫን
        webView.loadUrl("https://amanuel-axum.github.io/axum-tour-guide/");

        // ስክሪኑ ላይ አፑን ማሳየት
        setContentView(webView);
    }

    // በስልኩ የኋላ ቁልፍ ስንጫን አፑ እንዳይዘጋ ወደ ኋላ ገጽ እንዲመልሰን ማድረግ
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
