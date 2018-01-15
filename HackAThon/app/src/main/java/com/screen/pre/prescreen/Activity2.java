package com.screen.pre.prescreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    double length = (double) Driver.list.size();
    double index = (double) (Driver.list.indexOf(UserForm.person) + 1);
    double place = index / length;
    String text = "You are in the top " + (place * 100) + "%";

    ImageButton androidImageButton;
    private TextView percentile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        TextView textView = (TextView) findViewById(R.id.Percentile);
        textView.setText(text);

        ImageButton button = (ImageButton) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });



    }

    public void goBack() {
        Intent back = new Intent(this, UserForm.class);
        startActivity(back);
    }
}
