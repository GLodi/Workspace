package com.giuliolodi.remembr;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first_menu);
        final TextView textView1 = (TextView) findViewById (R.id.textView1);
        final ImageView imageView2 = (ImageView) findViewById (R.id.imageView2);
        final TextView textView2 = (TextView) findViewById (R.id.textView2);
        Typeface type = Typeface.createFromAsset(getAssets(),"fonts/minimal.otf"); 
        textView1.setTypeface(type);
        textView2.setTypeface(type);
        imageView2.setOnTouchListener(new OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    imageView2.setVisibility(View.INVISIBLE);
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                	imageView2.setVisibility(View.VISIBLE);
                	Intent intent = new Intent (getBaseContext(), Game.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in,R.anim.push_left_in);
                }
                return false;
            }
        });
    }

}
