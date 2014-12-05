package com.miapsoft.opq.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * ������Ϣ��xml������
 * 
 * @author guotianyu
 * 2014��11��24��
 */
public class Preference {
	public static String GetPreference(Context context,String Key)
	{
		SharedPreferences mPerferences = null;
		mPerferences = PreferenceManager.getDefaultSharedPreferences(context);
		
		return mPerferences.getString(Key, "");
	}
	
	public static void SetPreference(Context context,String Key,String Values)
	{
		SharedPreferences mPerferences = null;
		mPerferences = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor Editor = mPerferences.edit();
		Editor.putString(Key, Values);
		Editor.commit();
	}
	
	public static void RemovePreference(Context context,String Key)
	{
		SharedPreferences mPerferences = null;
		mPerferences = PreferenceManager.getDefaultSharedPreferences(context);
		SharedPreferences.Editor Editor = mPerferences.edit();
		Editor.remove(Key);
		Editor.commit();
	}

}
