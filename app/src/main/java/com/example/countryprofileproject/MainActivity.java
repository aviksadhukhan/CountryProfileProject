package com.example.countryprofileproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button BTindia,BTpakistan,BTchina;
    Intent intent;
    AlertDialog.Builder alertdialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTindia = findViewById(R.id.BTindia);
        BTpakistan = findViewById(R.id.BTpakistan);
        BTchina = findViewById(R.id.BTchina);

        BTindia.setOnClickListener(this);
        BTpakistan.setOnClickListener(this);
        BTchina.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.BTindia)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        if (v.getId()==R.id.BTpakistan)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }
        if (v.getId()==R.id.BTchina)
        {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name","China");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {

        alertdialogBuilder = new AlertDialog.Builder(MainActivity.this);
        //For Setting Icon...
        alertdialogBuilder.setIcon(R.drawable.alert);
        //For Setting Title...
        alertdialogBuilder.setTitle("Alert Title");
        //For Setting Message...
        alertdialogBuilder.setMessage("Do You want to exit");

        alertdialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();

            }
        });
        alertdialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(MainActivity.this, "You have clicked on no button", Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog alertDialog = alertdialogBuilder.create();
        alertDialog.show();
    }
}