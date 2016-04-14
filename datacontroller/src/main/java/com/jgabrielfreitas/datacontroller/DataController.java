package com.jgabrielfreitas.datacontroller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.Set;

/**
 * Created by JGabrielFreitas on 13/04/16.
 */
public class DataController {

    private SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    public DataController(Context context) {
        sharedPref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        editor = sharedPref.edit();
    }

    public void saveData(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void saveData(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public void saveData(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void saveData(String key, Set<String> value) {
        editor.putStringSet(key, value);
        editor.commit();
    }

    public String readStringData(String key) {
        String defaultValue = null;
        return sharedPref.getString(key, defaultValue);
    }

    public int readIntData(String key) {
        int defaultValue = 0;
        return sharedPref.getInt(key, defaultValue);
    }

    public Set<String> readSetOfTypeStringData(String key) {
        Set<String> defaultValue = null;
        return sharedPref.getStringSet(key, defaultValue);
    }

    public boolean readBooleanData(String key) {
        boolean defaultValue = false;
        return sharedPref.getBoolean(key, defaultValue);
    }

    public void dropAllDatas(){
        editor.clear();
        editor.commit();
    }

}
