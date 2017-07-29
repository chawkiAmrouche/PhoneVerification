package com.chawki.phoneverification;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Typeface.BOLD;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Typeface bold = Typeface.createFromAsset(getAssets(), "fonts/Klavika-Bold.otf");

        TextView can_verify = (TextView) findViewById(R.id.can_verify);
        can_verify.setTypeface(bold);

        final Typeface regular = Typeface.createFromAsset(getAssets(), "fonts/Klavika-Regular.otf");
        TextView msg = (TextView) findViewById(R.id.msg);
        msg.setTypeface(regular);

        final Typeface mediem = Typeface.createFromAsset(getAssets(), "fonts/Klavika-Medium.otf");
        TextView no_msg = (TextView) findViewById(R.id.no_msg);
        no_msg.setTypeface(mediem, BOLD);
        TextView code_country = (TextView) findViewById(R.id.code_country);
        code_country.setTypeface(mediem);
        TextView number = (TextView) findViewById(R.id.number);
        number.setTypeface(mediem);
        number.setLetterSpacing(0.5F);
        Button angry_btn = (Button) findViewById(R.id.angry_btn);
        angry_btn.setTypeface(mediem);
    }
}
