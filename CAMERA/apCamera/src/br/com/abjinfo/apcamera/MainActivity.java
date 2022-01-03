package br.com.abjinfo.apcamera;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().hide();
		setContentView(R.layout.activity_main);
		

		WebView webView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		String html = "<html><head><style>.heading{color:red;}</style></head></html>";
		webView.loadData(html, "text/html", "utf-8");
		webView.loadUrl("http://191.209.88.193:8081");
		
	}
}
