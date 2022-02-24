package com.samazebra.fromstarttoend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity
{
    WebView bib;

    boolean back;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        back = false;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                goBack();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed ()
    {
        if (back)
        {
            goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }

    public void goBack()
    {
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(getResources().getString(R.string.app_name));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);

        back = false;
    }

    public void openBib(View v)
    {
        open ();

        setContentView(R.layout.bibliography);

        bib = (WebView) findViewById(R.id.bib);
        bib.setWebViewClient (new WebViewClient());
        bib.getSettings().setBuiltInZoomControls(true);
        bib.loadUrl("https://docs.google.com/document/d/1w-Y8HbPlHJpqZw8dOVQdlVKssL8iv9o7ukS8-zuIoBY/edit?usp=sharing");
    }
    
    public void open ()
    {
        getSupportActionBar().setTitle("Back");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        back = true;
    }

    public void open1(View v)
    {
        open ();
        setContentView(R.layout.event1);
    }

    public void open2(View v)
    {
        open ();
        setContentView(R.layout.event2);
    }

    public void open3(View v)
    {
        open ();
        setContentView(R.layout.event3);
    }

    public void open4(View v)
{
    open ();
    
        setContentView(R.layout.event4);
    }

    public void open5(View v)
{
    open ();
    
        setContentView(R.layout.event5);
    }

    public void open6(View v)
{
    open ();
    
        setContentView(R.layout.event6);
    }

    public void open7(View v)
{
    open ();
    
        setContentView(R.layout.event7);
    }

    public void open8(View v)
{
    open ();
    
        setContentView(R.layout.event8);
    }

    public void open9(View v)
{
    open ();
    
        setContentView(R.layout.event9);
    }

    public void open10(View v)
{
    open ();
    
        setContentView(R.layout.event10);
    }

    public void open11(View v)
{
    open ();
    
        setContentView(R.layout.event11);
    }

    public void open12(View v)
{
    open ();
    
        setContentView(R.layout.event12);
    }

    public void open13(View v)
{
    open ();
    
        setContentView(R.layout.event13);
    }

    public void open14(View v)
{
    open ();
    
        setContentView(R.layout.event14);
    }

    public void open15(View v)
{
    open ();
    
        setContentView(R.layout.event15);
    }

    public void open16(View v)
{
    open ();
    
        setContentView(R.layout.event16);
    }

    public void open17(View v)
{
    open ();
    
        setContentView(R.layout.event17);
    }

    public void open18(View v)
{
    open ();
    
        setContentView(R.layout.event18);
    }

    public void open19(View v)
{
    open ();
    
        setContentView(R.layout.event19);
    }

    public void open20(View v)
{
    open ();
    
        setContentView(R.layout.event20);
    }

    public void open21(View v)
{
    open ();
    
        setContentView(R.layout.event21);
    }

    public void open22(View v)
{
    open ();
    
        setContentView(R.layout.event22);
    }

    public void open23(View v)
{
    open ();
    
        setContentView(R.layout.event23);
    }

    public void open24(View v)
{
    open ();
    
        setContentView(R.layout.event24);
    }

    public void open25(View v)
{
    open ();
    
        setContentView(R.layout.event25);
    }

    public void open26(View v)
{
    open ();
    
        setContentView(R.layout.event26);
    }

    public void open27(View v)
{
    open ();
    
        setContentView(R.layout.event27);
    }

    public void open28(View v)
{
    open ();
    
        setContentView(R.layout.event28);
    }

    public void open29(View v)
{
    open ();
    
        setContentView(R.layout.event29);
    }

    public void open30(View v)
{
    open ();
    
        setContentView(R.layout.event30);
    }

    public void open31(View v)
{
    open ();
    
        setContentView(R.layout.event31);
    }

    public void open32(View v)
{
    open ();
    
        setContentView(R.layout.event32);
    }

    public void open33(View v)
{
    open ();
    
        setContentView(R.layout.event33);
    }

    public void open34(View v)
{
    open ();
    
        setContentView(R.layout.event34);
    }

    public void open35(View v)
{
    open ();
    
        setContentView(R.layout.event35);
    }

    public void open36(View v)
{
    open ();
    
        setContentView(R.layout.event36);
    }

    public void open37(View v)
{
    open ();
    
        setContentView(R.layout.event37);
    }

    public void open38(View v)
{
    open ();
    
        setContentView(R.layout.event38);
    }

    public void open39(View v)
{
    open ();
    
        setContentView(R.layout.event39);
    }

    public void open40(View v)
{
    open ();
    
        setContentView(R.layout.event40);
    }

    public void open41(View v)
{
    open ();
    
        setContentView(R.layout.event41);
    }
}