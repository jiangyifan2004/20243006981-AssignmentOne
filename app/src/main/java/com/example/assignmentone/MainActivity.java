package com.example.assignmentone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facilitiesClicked(View view) {
        Toast.makeText(this, R.string.facilities_clicked, Toast.LENGTH_SHORT).show();
    }

    public void eventsClicked(View view) {
        Toast.makeText(this, R.string.events_clicked, Toast.LENGTH_SHORT).show();
    }

    public void clubsClicked(View view) {
        Toast.makeText(this, R.string.clubs_clicked, Toast.LENGTH_SHORT).show();
    }

    public void supportClicked(View view) {
        Toast.makeText(this, R.string.support_clicked, Toast.LENGTH_SHORT).show();
    }
}
