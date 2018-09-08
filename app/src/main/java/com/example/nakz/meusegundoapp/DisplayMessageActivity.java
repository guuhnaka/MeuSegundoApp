package com.example.nakz.meusegundoapp;

import android.app.Activity;
import android.os.Bundle;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message =
                intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        ViewGroup layout = (ViewGroup)
                findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
    }

}
