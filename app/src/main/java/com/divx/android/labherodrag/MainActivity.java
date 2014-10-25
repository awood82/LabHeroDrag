package com.divx.android.labherodrag;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends Activity {

    private static final String KEY = "image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up data for drawables in ListView
        int[] images = new int[] {
                R.drawable.other1,
                R.drawable.other2,
                R.drawable.other3,
                R.drawable.other1,
                R.drawable.other2,
                R.drawable.other3 };
        List<HashMap<String, String>> listDetails = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < images.length; i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put(KEY, String.valueOf(images[i]));
            listDetails.add(map);
        }

        // Set up the ListView
        ListView listView = (ListView) findViewById(R.id.listOfImages);
        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                listDetails,
                R.layout.listview_contents,
                new String[] { KEY },
                new int[] { R.id.listImageView });
        listView.setAdapter(simpleAdapter);

    }
}
