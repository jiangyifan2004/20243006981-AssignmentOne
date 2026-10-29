package com.example.assignmentone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    // Both activities use the same key for the selected array position.
    public static final String EXTRA_TOPIC = "com.example.assignmentone.TOPIC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facilitiesClicked(View view) {
        Toast.makeText(this, R.string.facilities_clicked, Toast.LENGTH_SHORT).show();
        openDetail(0);
    }

    public void eventsClicked(View view) {
        Toast.makeText(this, R.string.events_clicked, Toast.LENGTH_SHORT).show();
        openDetail(1);
    }

    public void clubsClicked(View view) {
        Toast.makeText(this, R.string.clubs_clicked, Toast.LENGTH_SHORT).show();
        openDetail(2);
    }

    public void supportClicked(View view) {
        Toast.makeText(this, R.string.support_clicked, Toast.LENGTH_SHORT).show();
        openDetail(3);
    }

    // The number matches this topic's position in all three resource arrays.
    private void openDetail(int topic) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(EXTRA_TOPIC, topic);
        startActivity(intent);
    }
}
