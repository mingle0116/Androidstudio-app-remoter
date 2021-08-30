package com.example.a726version;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Baby_search extends AppCompatActivity {

    private RadioGroup Q1;
    //       private RadioGroup Q2;
//       private RadioGroup Q3;
//       private RadioGroup Q4;
//       private RadioGroup Q5;
    private Button confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_search);
        getSupportActionBar().setTitle("智能娃娃的调查问卷");
        initView();

    }

    private void initView() {

        Q1 = (RadioGroup) findViewById(R.id.q1_1Rg);
        confirm = (Button) findViewById(R.id.btn1_handin);
        confirm.setOnClickListener(new View.OnClickListener() {
            int Ans = Q1.getCheckedRadioButtonId();

            public void onClick(View v) {
                if (Ans == R.id.q1_1A)
                    Toast.makeText(Baby_search.this, "Adjdjddjd", Toast.LENGTH_SHORT).show();
                if (Ans == R.id.q1_1B) {

                    Toast.makeText(Baby_search.this, "Bddddd", Toast.LENGTH_SHORT).show();
                }
                if (Ans == R.id.q1_1C) {
                    Toast.makeText(Baby_search.this, "Cssgsgsgsg", Toast.LENGTH_SHORT).show();
                }
                if (Ans == R.id.q1_1D) {
                    Toast.makeText(Baby_search.this, "Dsgssgs", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}