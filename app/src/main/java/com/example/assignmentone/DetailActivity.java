package com.example.assignmentone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // The index is 0 for Facilities, 1 for Events, 2 for Clubs, or 3 for Support.
        int topic = getIntent().getIntExtra(MainActivity.EXTRA_TOPIC, 0);

        String[] titles = getResources().getStringArray(R.array.string_array_titles);
        String[] contents = getResources().getStringArray(R.array.string_array_content);
        String[] images = getResources().getStringArray(R.array.string_array_images);
        String[] categories = getResources().getStringArray(R.array.category_names);

        TextView category = findViewById(R.id.detail_category);
        TextView title = findViewById(R.id.detail_title);
        TextView content = findViewById(R.id.detail_content);
        ImageView image = findViewById(R.id.detail_image);

        // All arrays use the same order, so no conditions are needed.
        category.setText(categories[topic]);
        title.setText(titles[topic]);
        content.setText(contents[topic]);

        // Convert the image name from arrays.xml into its drawable resource ID.
        int imageId = getResources().getIdentifier(images[topic], "drawable", getPackageName());
        image.setImageResource(imageId);
        image.setContentDescription(categories[topic]);
    }
}
