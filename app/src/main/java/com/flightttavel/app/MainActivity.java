package com.flighttttavel.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showSplash();

        new Handler().postDelayed(() -> showMainScreen(), 2000);
    }

    private void showSplash() {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("✈️ FlightTtavel");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(20, 70, 140));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your flight travel app is ready!");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }

    private void showMainScreen() {
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(40, 40, 40, 40);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("✈️ FlightTtavel");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(20, 70, 140));
        title.setGravity(Gravity.CENTER);

        TextView message = new TextView(this);
        message.setText("Welcome to FlightTtavel!");
        message.setTextSize(22);
        message.setTextColor(Color.DKGRAY);
        message.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(message);

        setContentView(layout);
    }
}
