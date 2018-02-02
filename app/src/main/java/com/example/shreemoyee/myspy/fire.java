package com.example.shreemoyee.myspy;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class fire extends AppCompatActivity {

    private ImageView image;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        image = (ImageView) findViewById(R.id.imageView1);

        String str1=getIntent().getStringExtra("room");
        String str2=getIntent().getStringExtra("number");

        Toast.makeText(fire.this,
                "You are currently in : " +
                        "\nRoom : "+ str1 +
                        "\nNumber : "+str2,
                Toast.LENGTH_LONG).show();
        button = (Button) findViewById(R.id.exit);
        //image.setImageResource(R.drawable.groundfloor);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }
}
