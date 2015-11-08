package com.example.jsonparsing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {

	Button btParse;
	ListView listColor;
	ArrayList<String> listColorData = new ArrayList<String>();
	ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btParse = (Button) findViewById(R.id.button1);

		listColor = (ListView) findViewById(R.id.listView1);

		adapter = new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_list_item_1, listColorData);

		listColor.setAdapter(adapter);

		btParse.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String fileURL = Environment.getExternalStorageDirectory()
						.getPath() + "/json.txt";

				JSONTask task = new JSONTask();

				task.execute(fileURL);
			}
		});

	}

	class JSONTask extends AsyncTask<String, Void, String> {

		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub

			String jsonData = "";

			try {
				FileReader reader = new FileReader(params[0]);

				BufferedReader br = new BufferedReader(reader);

				while (true) {
					String s = br.readLine();

					if (s == null)
						break;
						jsonData = jsonData + s;

				}

				// br.close();

			}

			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return jsonData;
		}

		@Override
		protected void onPostExecute(String result) {

			super.onPostExecute(result);

			try {
				JSONObject mainJSONObj = new JSONObject(result);

				// get color array

				JSONArray jsonColorArray = mainJSONObj
						.getJSONArray("colorsArray");

				// read all value objects from array

				for (int i = 0; i < jsonColorArray.length(); i++)
				{
					JSONObject jsonColorObj = jsonColorArray.getJSONObject(i);

					String colorName = jsonColorObj.getString("colorName");

					String hexValue = jsonColorObj.getString("hexValue");

					String colorData = "name:" + colorName+":" + "hexValue:"
							+ hexValue;

					listColorData.add(colorData);

					adapter.notifyDataSetChanged();

				}

			} catch (JSONException e) {
				// TODO Auto-generated catch block

				Log.e("Exc", e.getMessage());
			}

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
