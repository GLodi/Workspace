package com.giuliolodi.remembr;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Random;

public class Game extends ActionBarActivity {

    public ArrayList<Integer> items = new ArrayList<Integer>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_game);
		GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
		gridView1.setAdapter(adapter);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int n = 0; n < 9; n++){
                    Random ran = new Random();
                    int randomNum = ran.nextInt(9);
                    adapter.mThumbIds[n] = ImageAdapter.mThumbIdsCon[randomNum];
                    adapter.notifyDataSetChanged();
                }
            }
        });
	}
	
	@Override
	public void onBackPressed() {
	    super.onBackPressed();
	    overridePendingTransition(R.anim.push_right_in, R.anim.push_right_in);
	}

}
