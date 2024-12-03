package com.example.tugas_bp3_m3_handy_nanda;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void openWebsite1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://appmaster.io/id/blog/cara-mendesain-aplikasi"));
        startActivity(intent);
    }

    public void openWebsite2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dewaweb.com/blog/cara-membuat-aplikasi-web/"));
        startActivity(intent);
    }
}
