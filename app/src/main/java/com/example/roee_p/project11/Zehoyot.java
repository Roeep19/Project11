package com.example.roee_p.project11;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Zehoyot extends AppCompatActivity {
    String[] Z1={"tan(x)=sin(x)/cos(x)","sin^2(x)+cos^2(x)=1","1+tan^2(x)=1/cos^2(x)","sin(180-x)=sin(x)","cos(180-x)=-cos(x)","sin(90-x)=cos(x)","cos(90-x)=sin(x)","sin(-x)=-sin(x)","cos(-x)=cos(x)","tan(-x)=-tan(x)","sin(x)=sin(x+360k)","cos(x)=cos(x+360k)","tan(x)=tan(x+180k)"};
    String[] Z2={"sin(x+y)=sin(x)*cos(y)+sin(y)*cos(x)","cos(x+y)=cos(x)*cos(y)-sin(x)*sin(y)","sin(x-y)=sin(x)*cos(y)-sin(y)*cos(x)","cos(x-y)=cos(x)*cos(y)+sin(x)*sin(y)"};
    String[] Z3={"sin(2x)=2*sin(x)*cos(x)","cos(2x)=cos^2(x)-sin^2(x)","cos(2x)=2*cos^2(x)-1","cos(2x)=1-2*sin^2(x)"};
    String[] Z4={"sin(x)+sin(y)=2*sin[(x+y)/2]*cos[(x-y)/2]","cos(x)+cos(y)=2*cos[(x+y)/2]*cos[(x-y)/2]","sin(x)-sin(y)=2*sin[(x-y)/2]*cos[(x+y)/2]","cos(x)-cos(y)=-2*sin[(x+y)/2]*sin[(x-y)/2]"};
    String[] Z5={"sin(x)*cos(y)=0.5*[sin(x+y)+sin(x-y)]","sin(x)*sin(y)=0.5*[cos(x-y)-cos(x+y)]","cos(x)*cos(y)=0.5*[cos(x-y)+cos(x+y)]","cos(x)*sin(y)=0.5*[sin(x+y)-sin(x-y)]"};
    Spinner sp1,sp2,sp3,sp4,sp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zehoyot);

        sp1=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adp1= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Z1);
        sp1.setAdapter(adp1);

        sp2=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> adp2= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Z2);
        sp2.setAdapter(adp2);

        sp3=(Spinner)findViewById(R.id.spinner3);
        ArrayAdapter<String> adp3= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Z3);
        sp3.setAdapter(adp3);

        sp4=(Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<String> adp4= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Z4);
        sp4.setAdapter(adp4);

        sp5=(Spinner)findViewById(R.id.spinner5);
        ArrayAdapter<String> adp5= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, Z5);
        sp5.setAdapter(adp5);



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
