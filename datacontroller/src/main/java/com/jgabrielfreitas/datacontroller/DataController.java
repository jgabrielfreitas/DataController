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

    /** Write methods */

    public void writeData(String key, String value) {
        editor.putString(key, value);
        commit();
    }

    public void writeData(String key, int value) {
        editor.putInt(key, value);
        commit();
    }

    public void writeData(String key, boolean value) {
        editor.putBoolean(key, value);
        commit();
    }

    public void writeData(String key, Set<String> value) {
        editor.putStringSet(key, value);
        commit();
    }

    public void writeData(String key, long value) {
        editor.putLong(key, value);
        commit();
    }

    public void writeData(String key, float value) {
        editor.putFloat(key, value);
        commit();
    }

    /** Supports of type double values */
    public void writeData(String key, double value) {
        editor.putLong(key, Double.doubleToRawLongBits(value));
        commit();
    }

    /** Read methods */

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

    public long readLong(String key) {
        long defaultValue = 0;
        return sharedPref.getLong(key, defaultValue);
    }

    public float readFloat(String key) {
        float defaultValue = 0;
        return sharedPref.getFloat(key, defaultValue);
    }

    public double readDouble(String key) {
        long defaultValue = 0;
        return Double.longBitsToDouble(sharedPref.getLong(key, Double.doubleToLongBits(defaultValue)));
    }

    public void remove(String key) {
        editor.remove(key);
        commit();
    }

    /** Others methods */

    public void dropAllDatas(){
        editor.clear();
        commit();
    }

    private void commit() {
        editor.commit();
    }

}
