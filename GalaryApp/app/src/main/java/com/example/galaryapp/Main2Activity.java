package com.example.galaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;
    private float scaleFactor = 1.0f;
    private float minZoom = 1.0f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView = (ImageView)findViewById(R.id.imageView2);
        imageView.setImageResource(getIntent().getExtras().getInt("image"));

        /*------ For Simple Zoom In Feature we are using scaleGestureDetector------*/
        scaleGestureDetector = new ScaleGestureDetector(this,new ScaleListener());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        /*------------On touching image we call scale gesture detector and enabling the event--------*/
        scaleGestureDetector.onTouchEvent(event);
        return true;
    }


    /*----------Below Code is for Pinch to zoom function----------*/
    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{

        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scaleFactor = scaleFactor * detector.getScaleFactor();
            scaleFactor = Math.max(minZoom,Math.min(scaleFactor,3.0f));
            imageView.setScaleX(scaleFactor);
            imageView.setScaleY(scaleFactor);
            return true;
        }

    }
}
