package com.example.lenovo.buttons;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button ktn = (Button)findViewById(R.id.ktn);
        Button citizen = (Button)findViewById(R.id.citizen);
        Button kbc = (Button)findViewById(R.id.kbc);
        Button ntv = (Button)findViewById(R.id.ntv);

        //Set the interface for the buttons

        ktn.setOnClickListener(this);
        citizen.setOnClickListener(this);
        kbc.setOnClickListener(this);
        ntv.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ktn:
                Intent intentktn = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.standardmedia.co.ke/ktnhome/live"));
                startActivity(intentktn);
                break;
            case R.id.citizen:
                Intent intentcitizen = new Intent(Intent.ACTION_VIEW,Uri.parse("http://citizentv.co.ke/live/"));
                startActivity(intentcitizen);
                break;
            case R.id.kbc:
                Intent intentkbc = new Intent(Intent.ACTION_VIEW,Uri.parse("http://kbctv.co.ke/index.php/live/"));
                startActivity(intentkbc);
                break;
            case R.id.ntv:
                Intent intentntv = new Intent(Intent.ACTION_VIEW,Uri.parse("http://ntv.nation.co.ke/live/"));
                startActivity(intentntv);
                break;

        }
    }
}
