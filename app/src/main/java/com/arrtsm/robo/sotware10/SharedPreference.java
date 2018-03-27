package com.arrtsm.robo.sotware10;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreference {

	public static final String PREFS_NAME = "AOP_PREFS";
	public static final String PREFS_KEY = "AOP_PREFS_String";
	public static final String PREFS_KEY1 = "Shape";
	public static final String PREFS_KEY2 = "Cost";
	public static final String PREFS_KEY3="Edge";
	public static final String PREFS_KEY4="Sink";
	public SharedPreference() {
		super();
	}

	public void save(Context context, String text) {
		SharedPreferences settings;
		Editor editor;
		
		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
		editor = settings.edit(); //2

		editor.putString(PREFS_KEY, text); //3

		editor.commit(); //4
	}

	public String getValue(Context context) {
		SharedPreferences settings;
		String text;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text = settings.getString(PREFS_KEY, null);
		return text;
	}
	
	public void clearSharedPreference(Context context) {
		SharedPreferences settings;
		Editor editor;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		editor = settings.edit();

		editor.clear();
		editor.commit();
	}

	public void removeValue(Context context) {
		SharedPreferences settings;
		Editor editor;

		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		editor = settings.edit();

		editor.remove(PREFS_KEY);
		editor.commit();
	}


	public void save_shape(Context context, String text1) {
		SharedPreferences settings;
		Editor editor;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
		editor = settings.edit(); //2


		editor.putString(PREFS_KEY1, text1); //3

		editor.commit(); //4
	}

	public String getValue_shape(Context context) {
		SharedPreferences settings;
		String text1;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text1 = settings.getString(PREFS_KEY1, null);
		return text1;
	}
	public void save_cost(Context context, String text2) {
		SharedPreferences settings;
		Editor editor;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
		editor = settings.edit(); //2


		editor.putString(PREFS_KEY2, text2); //3

		editor.commit(); //4
	}

	public String getValue_cost(Context context) {
		SharedPreferences settings;
		String text1;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text1 = settings.getString(PREFS_KEY2, null);
		return text1;
	}

	public void save_edge(Context context, String text2) {
		SharedPreferences settings;
		Editor editor;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
		editor = settings.edit(); //2


		editor.putString(PREFS_KEY3, text2); //3

		editor.commit(); //4
	}

	public String getValue_edge(Context context) {
		SharedPreferences settings;
		String text1;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text1 = settings.getString(PREFS_KEY3, null);
		return text1;
	}
	public void save_sink(Context context, String text2) {
		SharedPreferences settings;
		Editor editor;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
		editor = settings.edit(); //2


		editor.putString(PREFS_KEY4, text2); //3

		editor.commit(); //4
	}

	public String getValue_sink(Context context) {
		SharedPreferences settings;
		String text1;

		//settings = PreferenceManager.getDefaultSharedPreferences(context);
		settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
		text1 = settings.getString(PREFS_KEY4, null);
		return text1;
	}



}
