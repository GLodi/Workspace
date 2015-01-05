package com.giuliolodi.prime;

import java.util.ArrayList;

import com.giuliolodi.prime.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends ActionBarActivity {
	
	ArrayList<String> dividers = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.button1);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final EditText editText1 = (EditText) findViewById(R.id.editText1);
		final ListView listView1 = (ListView) findViewById (R.id.listView1);
        button1.setOnClickListener(new View.OnClickListener() {
        	public void onClick (View v){
        		dividers.clear();
        		String num = editText1.getText().toString();
        		int number = Integer.parseInt(num);
        		int resto;
        		boolean primo = true;
        		for (int cont = 2; cont < number; cont++){
        			resto = number % cont;
        			if (resto == 0){
        				primo = false;
        				textView4.setVisibility(View.VISIBLE);
        				String contStr = Integer.toString(cont);
        				dividers.add(contStr);
        			}
        		}
        		if (primo == false){
        			textView3.setVisibility(View.VISIBLE);
        			if (textView2.getVisibility() == View.VISIBLE)
        				textView2.setVisibility(View.INVISIBLE);
        		}
        		else{
        			textView2.setVisibility(View.VISIBLE);
        			if (textView3.getVisibility() == View.VISIBLE)
        				textView3.setVisibility(View.INVISIBLE);
        			if (textView4.getVisibility() == View.VISIBLE)
        				textView4.setVisibility(View.INVISIBLE);
        		}
        		populateListView();
        	}
        });
    }
    
    private void populateListView() {
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.dividers_list, dividers);
		ListView listView1 = (ListView) findViewById (R.id.listView1);
		listView1.setAdapter(adapter);
	}
}
