 package com.example.holabooks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

 public class PdfViewActivity extends AppCompatActivity {
    PDFView pdfView;
    TextView setName;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);

        getSupportActionBar().hide();
        pdfView = findViewById(R.id.pdfView);
        setName = findViewById(R.id.set);

        int pos = getIntent().getIntExtra("position",0);


        if (pos==0){

            pdfView.fromAsset("set 1.pdf").load();
            setName.setText("SET - 1");
        } else if (pos==1) {

            pdfView.fromAsset("set 2.pdf").load();
            setName.setText("SET - 2");
        } else if (pos==2) {

            pdfView.fromAsset("set 3.pdf").load();
            setName.setText("SET - 3");
        }else if (pos==3) {

            pdfView.fromAsset("set 4.pdf").load();
            setName.setText("SET - 4");
        }else if (pos==4) {

            pdfView.fromAsset("set 5.pdf").load();
            setName.setText("SET - 5");
        }else if (pos==5) {

            pdfView.fromAsset("set 6.pdf").load();
            setName.setText("SET - 6");
        }else if (pos==6) {

            pdfView.fromAsset("set 7.pdf").load();
            setName.setText("SET - 7");
        }else if (pos==7) {

            pdfView.fromAsset("set 8.pdf").load();
            setName.setText("SET - 8");
        }else if (pos==8) {

            pdfView.fromAsset("set 9.pdf").load();
            setName.setText("SET - 9");
        }else if (pos==9) {

            pdfView.fromAsset("set 10.pdf").load();
            setName.setText("SET - 10");
        }
        else if (pos==3){

            Toast.makeText(this, "set - 11", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 11");
        }
        else if (pos==4){

            Toast.makeText(this, "set - 12", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 12");
        }else if (pos==5){

            Toast.makeText(this, "set - 13", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 13");
        }

        else if (pos==6){
            Toast.makeText(this, "set - 14", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 14");
        }else if (pos==7){
            Toast.makeText(this, "set - 15", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 15");
        }else if (pos==8){
            Toast.makeText(this, "set - 16", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 16");
        }else if (pos==9){
            Toast.makeText(this, "set - 17", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 17");
        }else if (pos==10){
            Toast.makeText(this, "set - 18", Toast.LENGTH_SHORT).show();
            setName.setText("SET - 18");
        }

    }
}