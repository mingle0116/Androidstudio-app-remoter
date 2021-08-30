package com.example.a726version;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class IntroDetailActivity extends AppCompatActivity {

    public static final String ExTRA_intro_ID="introId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_detail);

        int introId=(Integer) getIntent().getExtras().get(ExTRA_intro_ID);
        String introName=Introdata.introdata[introId].getName();
        TextView textView=(TextView)findViewById(R.id.introproduts_text);
        textView.setText(introName);

        int introImage=Introdata.introdata[introId].getImageResourceId();
        ImageView imageView=(ImageView)findViewById(R.id.introproduts_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,introImage));
        imageView.setContentDescription(introName);

     String intro_notes=Introdata.introdata[introId].getIntrotext();
        TextView textView1=(TextView)findViewById(R.id.introproduts_infor);
        textView1.setText(intro_notes);

    }
}