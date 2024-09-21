package com.example.alertapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_demo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater inflater=getMenuInflater();
        //inflater.inflate(R.menu.option_menu,menu);
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.search)
        {
            Toast.makeText(this, "Search Item is Selected", Toast.LENGTH_LONG).show();
        }
        else if (item.getItemId()==R.id.upload){
            Toast.makeText(this, "Upload Item is Selected", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.copy)
        {
            Toast.makeText(this, "Copy Item Selected", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.print)
        {
            Toast.makeText(this, "Print Item Selected", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.share)
        {
            Toast.makeText(this, "Share Item Selected", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.bookmark)
        {
            Toast.makeText(this, "Book Mark Item Selected", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}