package com.example.shreemoyee.myspy;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class fire extends AppCompatActivity {

    public   ImageView image;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //image = (ImageView) findViewById(R.id.imageView1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        image =  findViewById(R.id.imageView1);
        //button = findViewById(R.id.exit);

        String str1=getIntent().getStringExtra("room");
        String str2=getIntent().getStringExtra("number");

/**        int i[]={R.drawable.groundfloorcon,R.drawable.groundfloorhod,R.drawable.groundfloorlab1,
                R.drawable.groundfloorlab2,R.drawable.groundflooroff,
                R.drawable.groundfloorstair,R.drawable.groundfloorstair2,R.drawable.groundfloorwash};**/
        String s=str1+str2;
        if(s.equals("Lab01")) {

            //image.setBackground(getResources().getDrawable(i[2]));
            //Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageDrawable(getResources().getDrawable(R.drawable.groundfloorlab1,getApplicationContext().getTheme()));
        }
        if(s.equals("Stair-well01")){
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorstair);
        }

        if(s.equals("Stair-well02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorstair2);
        }
        if(s.equals("Washrooms01"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorwash);
        }
        if(s.equals("Lab02"))
        {
            Toast.makeText(fire.this,s+ "Hua toh",Toast.LENGTH_SHORT);
            image.setImageResource(R.drawable.groundfloorlab2);
        }

        Toast.makeText(fire.this,
                "You are currently in : " +
                        "\nRoom : "+ str1 +
                        "\nNumber : "+str2+
                "s: "+s,
                Toast.LENGTH_LONG).show();

        //image.setImageResource(R.drawable.groundfloor);

    }
}
