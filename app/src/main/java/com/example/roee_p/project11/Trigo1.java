package com.example.roee_p.project11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Trigo1 extends AppCompatActivity {
    int impo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigo1);
    }

    public void oc2(View view) {
        impo=2;
        Intent y=new Intent(this, Trigo2.class);
        y.putExtra("n",impo);
        startActivity(y);
    }

    public void oc1(View view) {
        impo=1;
        Intent G=new Intent(this, Trigo2.class);
        G.putExtra("n",impo);
        startActivity(G);
    }

    public void oc3(View view) {
        impo=3;
        Intent c=new Intent(this, Trigo2.class);
        c.putExtra("n",impo);
        startActivity(c);
    }

    public void oc4(View view) {
        impo=4;
        Intent a=new Intent(this, Trigo2.class);
        a.putExtra("n",impo);
        startActivity(a);
    }

    public void oc5(View view) {
        impo=5;
        Intent d=new Intent(this, Trigo2.class);
        d.putExtra("n",impo);
        startActivity(d);
    }





    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("זכויות");
        menu.add("מסך פתיחה");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String st=item.getTitle().toString();
        if (st.equals("זכויות")) {
            Intent r = new Intent(this, Credits.class);
            startActivity(r);
        }else {
            Intent y = new Intent(this, Main.class);
            startActivity(y);
        }
        return true;
    }
}
