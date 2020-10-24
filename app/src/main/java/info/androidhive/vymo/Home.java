package info.androidhive.vymo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        WebView browser=findViewById(R.id.webview);
        browser.loadUrl("https://github.com/Satyabratajena/VymoAssignment/pulls");
    }
}
