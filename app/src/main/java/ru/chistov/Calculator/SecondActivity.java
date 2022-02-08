package ru.chistov.Calculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String Pref = "key_Pref";
    private static final String Pref_key_theme = "key_Pref_theme";
    public static String KEY_INTENT = "KEY_INTENT";


    protected void setAppTheme(int codeStyle){
        SharedPreferences sharedPref=getSharedPreferences(Pref,MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putInt(Pref_key_theme,codeStyle);
        editor.apply();
    }
    protected int getAppTheme(){
        SharedPreferences sharedPref=getSharedPreferences(Pref,MODE_PRIVATE);
        return sharedPref.getInt(Pref_key_theme,R.style.Theme_MyApplication);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme());
        setContentView(R.layout.activity_second);

        setListeners();

    }
    private void setListeners(){
        ((RadioButton) findViewById(R.id.radioBtnThemeDefault)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.radioBtnThemeRed)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.radioBtnThemeGreen)).setOnClickListener(this);
        findViewById(R.id.button_Theme).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.radioBtnThemeDefault):
                setAppTheme(R.style.Theme_MyApplication);
                break;
            case (R.id.radioBtnThemeRed):
                setAppTheme(R.style.Theme_myThemeRed);
                break;
            case (R.id.radioBtnThemeGreen):
                setAppTheme(R.style.Theme_myThemeGreen);
                break;
            case (R.id.button_Theme):
                Intent intent = new Intent();
                intent.putExtra(KEY_INTENT,getAppTheme());
                SecondActivity.this.setResult(RESULT_OK,intent);
                finish();
                break;
        }
        recreate();

    }

}
