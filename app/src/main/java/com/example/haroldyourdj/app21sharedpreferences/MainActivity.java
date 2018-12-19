package com.example.haroldyourdj.app21sharedpreferences;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    private EditText mName, mPassword;
    private Button btnLogin;
    private Checkable mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mName = findViewById(R.id.etName);
        mPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        mCheckBox = findViewById(R.id.checkbox);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        // mPreferences = getSharedPreferences("BaddName",MODE_PRIVATE);

        // On stock les infos
        mEditor = mPreferences.edit();

        mEditor.putString("key","mitch");
        mEditor.commit();

        String name = mPreferences.getString("key","default");
        Log.d(TAG,"onCreate : " + name);
    }
}
