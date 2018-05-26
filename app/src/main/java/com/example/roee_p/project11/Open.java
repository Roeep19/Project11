package com.example.roee_p.project11;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Open extends AppCompatActivity {
    EditText et1;
    boolean bb=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        et1=(EditText)findViewById(R.id.editText2);
    }

    public void write(){
        String in=et1.getText().toString();
        FileOutputStream fos=null;
        try {
            fos=openFileOutput("input.txt", Context.MODE_PRIVATE);
        }catch (FileNotFoundException e){
            bb=false;
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
}
