package com.example.bsaraci.blitzone;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Search extends AppCompatActivity
{
    Toolbar searchToolbar ;
    TextView toolbarTitle;
    Typeface titleFont;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_main);
        searchToolbar = (Toolbar) findViewById(R.id.toolbar_of_search);
        toolbarTitle = (TextView)findViewById(R.id.search_toolbar_title);
        titleFont= Typeface.createFromAsset(getAssets(), "fonts/AnkePrint.ttf");
        toolbarTitle.setTypeface(titleFont);

    }

    public void blitzoneFromSearchButtonCallback (View view)
    {
        finish();
    }
}
