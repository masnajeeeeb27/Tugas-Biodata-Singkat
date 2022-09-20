package com.almas27.tes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/7%C2%B018'58.3%22S+109%C2%B021'43.7%22E/@-7.3221575,109.3718588,14z/data=!4m6!3m5!1s0x2e6ff79bb5b222d5:0xfe5c69a353a558e7!7e2!8m2!3d-7.3161894!4d109.3621266"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:almas.renaultclio@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0813266885581"));
        startActivity(intent);
    }
}