package com.giuliolodi.remembr;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import java.util.Random;

public class Game extends ActionBarActivity {

    int millis;

    public int[] answer = new int[9];
    public int[] guess = new int[9];
    public boolean onGoing = false;

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
                if (!onGoing){
                    millis = 500;
                    for (int i = 0; i < 9; i++) {
                        answer[i] = 0;
                        guess[i] = 0;
                    }
                    startGame();
                    checkAnswer();
                }
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
                if (!onGoing){
                    millis = 250;
                    for (int i = 0; i < 9; i++){
                        answer[i] = 0;
                        guess[i] = 0;
                    }
                    startGame();
                    checkAnswer();
                }
            }
        });
	}

    public void checkAnswer(){
        final GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                gridView1.setAdapter(adapter);
                if (answer[0] == i){
                    adapter.mThumbIds[i] = draw[0];
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 9; i++)
                                adapter.mThumbIds[i] = 0;
                            adapter.notifyDataSetChanged();
                        }
                    }, 1000);
                }
                if (answer[1] == i){
                    adapter.mThumbIds[i] = draw[1];
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 9; i++)
                                adapter.mThumbIds[i] = 0;
                            adapter.notifyDataSetChanged();
                        }
                    }, 1000);
                }
                if (answer[2] == i){
                    adapter.mThumbIds[i] = draw[2];
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 9; i++)
                                adapter.mThumbIds[i] = 0;
                            adapter.notifyDataSetChanged();
                        }
                    }, 1000);
                }
                if (answer[3] == i){
                    adapter.mThumbIds[i] = draw[3];
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 9; i++)
                                adapter.mThumbIds[i] = 0;
                            adapter.notifyDataSetChanged();
                        }
                    }, 1000);
                }
                if (answer[4] == i){
                    adapter.mThumbIds[i] = draw[4];
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 9; i++)
                                adapter.mThumbIds[i] = 0;
                            adapter.notifyDataSetChanged();
                        }
                    }, 1000);
                }
            }
        });
    }

    public void startGame(){
        onGoing = true;
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[0];
        adapter.notifyDataSetChanged();
        answer[0] = randNum;
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
        answer[1] = randNum;
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
        answer[2] = randNum;
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
        answer[3] = randNum;
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
        answer[4] = randNum;
        if (millis == 500){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0; i < 9; i++){
                        adapter.mThumbIds[i] = 0;
                    }
                    adapter.notifyDataSetChanged();
                }
            }, millis);
            onGoing = false;
        }
        if (millis != 500){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startGame6();
                }
            }, millis);
        }
    }

    public void startGame6(){
        GridView gridView1 = (GridView) findViewById(R.id.gridView1);
        final ImageAdapter adapter = new ImageAdapter(this);
        gridView1.setAdapter(adapter);
        Random rand = new Random();
        int randNum = rand.nextInt(9);
        adapter.mThumbIds[randNum] = draw[5];
        adapter.notifyDataSetChanged();
        answer[5] = randNum;
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
        answer[6] = randNum;
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
        answer[7] = randNum;
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
        answer[8] = randNum;
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 9; i++){
                    adapter.mThumbIds[i] = 0;
                }
                adapter.notifyDataSetChanged();
            }
        }, millis);
        onGoing = false;
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
