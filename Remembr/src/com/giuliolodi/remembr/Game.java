package com.giuliolodi.remembr;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.Random;

public class Game extends ActionBarActivity {

    int millis = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_game);
		GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
		gridView1.setAdapter(adapter);
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                millis = 500;
                startGame();
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setInit();
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                millis = 250;
                startGame();
            }
        });
	}

    public void startGame(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[0];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame2();
            }
        }, millis);
    }

    public void startGame2(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[1];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame3();
            }
        }, millis);
    }

    public void startGame3(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[2];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame4();
            }
        }, millis);
    }

    public void startGame4(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[3];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame5();
            }
        }, millis);
    }

    public void startGame5(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[4];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame6();
            }
        }, millis);
    }

    public void startGame6(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[5];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame7();
            }
        }, millis);
    }

    public void startGame7(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[6];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame8();
            }
        }, millis);
    }

    public void startGame8(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[7];
        adapter.notifyDataSetChanged();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startGame9();
            }
        }, millis);
    }

    public void startGame9(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[8];
        adapter.notifyDataSetChanged();
    }

    public static final Integer[] draw = {
            R.drawable.n1,
            R.drawable.n2,
            R.drawable.n3,
            R.drawable.n4,
            R.drawable.n5,
            R.drawable.n6,
            R.drawable.n7,
            R.drawable.n8,
            R.drawable.n9,
    };

    public void setInit(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        adapter.mThumbIds[0] = draw[0];
        adapter.mThumbIds[1] = draw[1];
        adapter.mThumbIds[2] = draw[2];
        adapter.mThumbIds[3] = draw[3];
        adapter.mThumbIds[4] = draw[4];
        adapter.mThumbIds[5] = draw[5];
        adapter.mThumbIds[6] = draw[6];
        adapter.mThumbIds[7] = draw[7];
        adapter.mThumbIds[8] = draw[8];
    }

    static void shuffleArray(Integer[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
	
	@Override
	public void onBackPressed() {
	    super.onBackPressed();
	    overridePendingTransition(R.anim.push_right_in, R.anim.push_right_in);
	}

}
