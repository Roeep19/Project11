package com.example.roee_p.project11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Trigo2 extends AppCompatActivity {
     int x;
     TextView tv1,tv2;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigo2);

        Intent gi=getIntent();
        int imp=gi.getIntExtra("n",x);

        tv1=(TextView)findViewById(R.id.textView8);
        tv2=(TextView)findViewById(R.id.textView13);
        iv=(ImageView)findViewById(R.id.imageView);

        if (imp==1){
            tv1.setText("הגדרות\n" +
                       "sin/cos/tan");
            tv2.setText("במשולש ישר זווית:\n" +
                    "סינוס הזווית שווה לניצב מולה חלקי היתר\n" +
                    "קוסינוס הזווית שווה לניצב לידה חלקי היתר\n" +
                    "טנגנס הזווית שווה לניצב מולה חלקי הניצב לידה\n" +
                    "\nsin(c)=AB/AC" +
                    "\ncos(c)=BC/AC" +
                    "\ntan(c)=AB/BC");
            iv.setImageResource(R.drawable.triangle);
        }else {if (imp==2){
            tv1.setText("משפט הסינוסים");
            tv2.setText(" הגדרה:\n" +
                    "צלע במשולש לחלק בסינוס הזווית שמולה שווה לצלע אחרת במשולש לחלק בסינוס הזווית שמולה. וזה גם שווה לפעמיים רדיוס המעגל החוסם את המשולש.\n" +
                    "\n" +
                    "AC/sin(b)=AB/sin(c)=BC/sin(a)=2R");
            iv.setImageResource(R.drawable.triangle2);
        }else {if (imp==3){
            tv1.setText("שטח משולש");
            tv2.setText("חישוב שטח משולש בדרכים טריגונומטריות: " +
                    "\n" +
                    "\n" +
                    "סינוס הזווית הכלואה בין שתי הצלעות כפול חצי כפול שתי הצלעות\n " +
                    "S= 0.5*AC*BC*sin(c)" +
                    "\n" +
                    "\n" +
                    "סינוס שתי הזוויות הצמודות לצלע כפול הצלע בריבוע חלקי סינוס הזווית שמול הצלע כפול 2\n " +
                    "S=AB^2*sin(B)sin(A)/2*sin(C)");
            iv.setImageResource(R.drawable.triangle2);
        }else {if (imp==4){
            tv1.setText("משפט הקוסינוסים");
            tv2.setText("הגדרה:\n" +
                    "\nהצלע שמול הזווית בריבוע שווה לצלע ליד הזווית בריבוע ועוד צלע ליד הזווית בריבוע פחות 2 כפול הצלעות שליד כפול קוסינוס הזווית" +
                    "\n" +
                    "\n" +
                    "AB^2=AC^2+BC^2-2*AC*BC*cos(c)");
            iv.setImageResource(R.drawable.triangle2);
        }else{
            tv1.setText("משוואות ופתרונות מיוחדים");
            tv2.setText("sin(x)=a:" +
                    "\n" +
                    "x1=a+360k,x2=180-a+360k" +
                    "\n" +
                    "cos(x)=a" +
                    "\n" +
                    "x1=a+360k,x2=-a+360k" +
                    "\n" +
                    "tan(x)=a" +
                    "\n" +
                    "x=a+180k" +
                    "\n" +
                    "פתרונות מיוחדים:" +
                    "\n" +
                    "\n" +
                    "sin(x)=0,x=180k          |cos(x)=0,x=90+180k                   " +
                    "\n" +
                    "sin(x)=1,x=90+360k   |cos(x)=1,x=360k" +
                    "\n" +
                    "sin(x)=-1,x=-90+360k|cos(x)=-1,x=180+360k"
                   );

        }
        }}
        }
    }













    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("זכויות");
        menu.add("מסך פתיחה");
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("זכויות")) {
            Intent r = new Intent(this, Credits.class);
            startActivity(r);
        } else {
            Intent y = new Intent(this, Main.class);
            startActivity(y);
        }
        return true;

    }

    public void back(View view) {
        finish();
    }
}