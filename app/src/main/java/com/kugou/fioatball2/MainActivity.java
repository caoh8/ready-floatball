package com.kugou.fioatball2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import com.kugou.fioatball2.service.StartFloatBallService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startService(View view) {
        Intent intent = new Intent(this, StartFloatBallService.class);
        startService(intent);
        finish();
    }

    public void openRight(View view) {
        startActivity(new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName())));
    }
}
