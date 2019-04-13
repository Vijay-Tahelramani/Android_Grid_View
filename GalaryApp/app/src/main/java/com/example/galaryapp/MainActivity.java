package com.example.galaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    Integer[] galary_pics = {R.drawable.thumb_1_0,R.drawable.thumb_1_1,R.drawable.thumb_1_2,R.drawable.thumb_1_3,R.drawable.thumb_1_4,
            R.drawable.thumb_1_5,R.drawable.thumb_1_6,R.drawable.thumb_1_7,R.drawable.thumb_1_8,R.drawable.thumb_1_9,
            R.drawable.thumb_2_0,R.drawable.thumb_2_1,R.drawable.thumb_2_2,R.drawable.thumb_2_3,R.drawable.thumb_2_4,
            R.drawable.thumb_2_5,R.drawable.thumb_2_6,R.drawable.thumb_2_7,R.drawable.thumb_2_8,R.drawable.thumb_2_9,
            R.drawable.thumb_3_0,R.drawable.thumb_3_1,R.drawable.thumb_3_2,R.drawable.thumb_3_3,R.drawable.thumb_3_4,
            R.drawable.thumb_3_5,R.drawable.thumb_3_6,R.drawable.thumb_3_7,R.drawable.thumb_3_8,R.drawable.thumb_3_9,
            R.drawable.thumb_4_0,R.drawable.thumb_4_1,R.drawable.thumb_4_2,R.drawable.thumb_4_3,R.drawable.thumb_4_4,
            R.drawable.thumb_4_5,R.drawable.thumb_4_6,R.drawable.thumb_4_7,R.drawable.thumb_4_8,R.drawable.thumb_4_9,
            R.drawable.thumb_5_0,R.drawable.thumb_5_1,R.drawable.thumb_5_2,R.drawable.thumb_5_3,R.drawable.thumb_5_4,
            R.drawable.thumb_5_5,R.drawable.thumb_5_6,R.drawable.thumb_5_7,R.drawable.thumb_5_8,R.drawable.thumb_5_9,
            R.drawable.thumb_6_0,R.drawable.thumb_6_1,R.drawable.thumb_6_2,R.drawable.thumb_6_3,R.drawable.thumb_6_4,
            R.drawable.thumb_6_5,R.drawable.thumb_6_6,R.drawable.thumb_6_7,R.drawable.thumb_6_8,R.drawable.thumb_6_9,
            R.drawable.thumb_7_0,R.drawable.thumb_7_1,R.drawable.thumb_7_2,R.drawable.thumb_7_3,R.drawable.thumb_7_4};







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        CustomListAdapter galary = new CustomListAdapter(this,galary_pics);
        gridView.setAdapter(galary);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent s = new Intent(MainActivity.this,Main2Activity.class);
                s.putExtra("image",galary_pics[position]);
                startActivity(s);
            }
        });
    }
}
