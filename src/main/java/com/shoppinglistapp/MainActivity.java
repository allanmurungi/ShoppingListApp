package com.shoppinglistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {
//declare and initialize variables e.g the user.s email
    String tag="m@m.com",url="";
    private WebView wv1;
    Bundle bundle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//load webview where interface foradding a shopping list is hosted
        wv1=(WebView)findViewById(R.id.webviewW);
        wv1.setWebViewClient(new MyBrowser());
        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
//generate URL and send data to URL
        String postData = null;
        try {
            postData = "tag=" + URLEncoder.encode(tag, "UTF-8") + "&start=" + URLEncoder.encode("", "UTF-8")+ "&phone=" + URLEncoder.encode(tag, "UTF-8");
            url=Globally.DOMAIN_U+"cloudstores/register/wishlistSL.php";
            wv1.postUrl(url,postData.getBytes());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}