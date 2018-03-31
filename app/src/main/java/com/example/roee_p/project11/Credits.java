package com.example.roee_p.project11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

    }

    public boolean onCreateOptionsMenu(Menu menu){


        menu.add("מסך פתיחה");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){

            Intent y = new Intent(this, Main.class);
            startActivity(y);

        return true;
    }

}
