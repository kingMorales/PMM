package com.example.alemen.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.MnuOpc1:
                return true;
            case R.id.MnuOpc2:
                return true;
            case R.id.SubMnuOpc1:
                return true;
            case R.id. SubMnuOpc2:
                return true;
            case R.id. SubMnuOpc3:
                return true;
            case R.id.MnuOpc3:
                Intent miIntent1 = new Intent(MainActivity.this, info.class);
                startActivity(miIntent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }}
}