package com.example.alertapplication;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuDemoActivity extends AppCompatActivity {
    ListView contactname;
    String name[]={ "Aaisha", "Saniya", "Faraz", "Karan", "Fayyaz", "Leah", "Qazi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_demo);

        contactname=(ListView) findViewById(R.id.contactname);

        ArrayAdapter arrayAdapter =new ArrayAdapter(getApplicationContext(),
                android.support.constraint.R.layout.support_simple_spinner_dropdown_item,name);
            contactname.setAdapter(arrayAdapter);
            registerForContextMenu(contactname);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("Select from the option");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.voicecall){
            Toast.makeText(this, "VOICE CALL", Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.videocall){
            Toast.makeText(this, "VIDEOCALL", Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.sms){
            Toast.makeText(this, "SMS", Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.mms){
            Toast.makeText(this, "MMS", Toast.LENGTH_LONG).show();
        }
        return super.onContextItemSelected(item);
    }
}