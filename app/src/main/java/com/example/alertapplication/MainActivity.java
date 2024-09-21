package com.example.alertapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button alert;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alert=(Button) findViewById(R.id.alertbtnt);
        builder= new AlertDialog.Builder(this);

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setMessage("Do You want to Close this Application")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Toast.makeText(MainActivity.this, "You have selected Yes", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                                Toast.makeText(MainActivity.this, "You have Selected No button", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog alertDialog=builder.create();
                alertDialog.setTitle("Alert Dialog Demo");
                alertDialog.show();

            }
        });
    }
}