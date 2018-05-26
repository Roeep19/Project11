package com.example.roee_p.project11;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class Main extends AppCompatActivity {
    Switch sw1;
    AlertDialog.Builder adb;
    boolean b=false;
    EditText et;
    StringBuffer buffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sw1=(Switch)findViewById(R.id.switch1);
        adb= new AlertDialog.Builder(this);
        et=(EditText)findViewById(R.id.editText);

        write();
        InputStream is=null;
        try{
            is=openFileInput("input.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        InputStreamReader tmp=new InputStreamReader(is);
        BufferedReader reader=new BufferedReader(tmp);
        String st="";
        buffer=new StringBuffer();
        try{
            while ((st=reader.readLine())!=null){
                buffer.append(st);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            is.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void write(){
        String in=et.getText().toString();
        FileOutputStream fos=null;
        try {
            fos=openFileOutput("input.txt", Context.MODE_PRIVATE);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        try {
            bw.write(in);
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            bw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        }

    public void cont(View view) {
        if (sw1.isChecked()){
            adb.setTitle(" בחר מה לעשות "+buffer);
            adb.setIcon(R.drawable.p1);
            adb.setMessage("בחרת באופציית זהויות הטריגו אשר כוללת את הזהויות היסודיות, סכום והפרש זוויות וזהויות זווית כפולה.");
            adb.setPositiveButton("המשך", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    a();
                }
            });
            adb.setNegativeButton("חזור", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    c();
                }
            });

            AlertDialog a= adb.create();
            a.show();
        }
        else {
            adb.setTitle( " בחר מה לעשות " + buffer);
            adb.setIcon(R.drawable.p1);
            adb.setMessage("בחרת באופציית טריגו במישור ומשוואות אשר כוללת את הגדרות הטריגו, משפטי הסינוס והקוסינוס ופתרונות למשוואות מיוחדות. ");
            adb.setPositiveButton("המשך", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    a1();
                }
            });
            adb.setNegativeButton("חזור", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    c();
                }
            });

            AlertDialog ad= adb.create();
            ad.show();


        }}

        public void c(){
            sw1.setChecked(b);
        }

        public void a(){
            Intent g=new Intent(this, Zehoyot.class);
            startActivity(g);
        }

        public void a1(){
            Intent t=new Intent(this, Trigo1.class);
            startActivity(t);
        }

    public boolean onCreateOptionsMenu(Menu menu){

        menu.add("זכויות");

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
            Intent r = new Intent(this, Credits.class);
            startActivity(r);
        return true;
    }


    public void read(View view) {
        write();
        InputStream is=null;
        try{
            is=openFileInput("input.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        InputStreamReader tmp=new InputStreamReader(is);
        BufferedReader reader=new BufferedReader(tmp);
        String st="";
        buffer=new StringBuffer();
        try{
            while ((st=reader.readLine())!=null){
                buffer.append(st);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            is.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
