package com.example.countryprofileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView IVcountry;
    TextView TVDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        IVcountry = findViewById(R.id.IVcountry);
        TVDetails = findViewById(R.id.TVDetails);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
         String countryname = bundle.getString("name");
         showDetails(countryname);
        }

    }
    void showDetails(String countryname)
    {
      if (countryname.equals("India"))
      {
          IVcountry.setImageResource(R.drawable.victoria);
          TVDetails.setText(R.string.India_text);
      }
        if (countryname.equals("Pakistan"))
        {
            IVcountry.setImageResource(R.drawable.munibamazari);
            TVDetails.setText(R.string.Pakistan_text);
        }
        if (countryname.equals("China"))
        {
            IVcountry.setImageResource(R.drawable.chinawall);
            TVDetails.setText(R.string.China_text);
        }
    }
    
}