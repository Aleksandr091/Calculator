package ru.chistov.Calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn_one;
    Button btn_two;
    Button btn_three;
    Button btn_four;
    Button btn_five;
    Button btn_six;
    Button btn_seven;
    Button btn_eight;
    Button btn_nine;
    Button btn_zero;
    Button btn_sum;
    Button btn_ded;
    Button btn_inc;
    Button btn_div;
    Button btn_point;
    Button btn_res;
    Button btn_percent;
    Button btn_backspace;
    Button btn_clean;

    TextView textViewIn;
    Double firstNum=0.0;
    String action;
    Double secondNum=0.0;
    Double res=0.0;
    boolean isPoint= true;



    private void initView(){
        btn_one=findViewById(R.id.button_one);
        btn_two=findViewById(R.id.button_two);
        btn_three=findViewById(R.id.button_three);
        btn_four=findViewById(R.id.button_four);
        btn_five=findViewById(R.id.button_five);
        btn_six=findViewById(R.id.button_six);
        btn_seven=findViewById(R.id.button_seven);
        btn_eight=findViewById(R.id.button_eight);
        btn_nine=findViewById(R.id.button_nine);
        btn_zero=findViewById(R.id.button_zero);
        btn_sum=findViewById(R.id.button_sum);
        btn_ded=findViewById(R.id.button_ded);
        btn_inc=findViewById(R.id.button_inc);
        btn_div=findViewById(R.id.button_div);
        btn_point=findViewById(R.id.button_point);
        btn_res=findViewById(R.id.button_res);
        btn_percent=findViewById(R.id.button_percent);
        btn_backspace=findViewById(R.id.button_backspace);
        btn_clean=findViewById(R.id.button_clean);

        textViewIn=findViewById(R.id.textViewIn);

    }
    private void setListeners(){
        btn_zero.setOnClickListener(this);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_clean.setOnClickListener(this);
        btn_backspace.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        btn_ded.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_inc.setOnClickListener(this);
        btn_res.setOnClickListener(this);

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("textViewIn",textViewIn.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textViewIn.setText(savedInstanceState.getString("textViewIn"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListeners();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.button_zero):
                textViewIn.append(btn_zero.getText().toString());
                break;
            case(R.id.button_one):
                textViewIn.append(btn_one.getText().toString());
                break;
            case(R.id.button_two):
                textViewIn.append(btn_two.getText().toString());
                break;
            case(R.id.button_three):
                textViewIn.append(btn_three.getText().toString());
                break;
            case(R.id.button_four):
                textViewIn.append(btn_four.getText().toString());
                break;
            case(R.id.button_five):
                textViewIn.append(btn_five.getText().toString());
                break;
            case(R.id.button_six):
                textViewIn.append(btn_six.getText().toString());
                break;
            case(R.id.button_seven):
                textViewIn.append(btn_seven.getText().toString());
                break;
            case(R.id.button_eight):
                textViewIn.append(btn_eight.getText().toString());
                break;
            case(R.id.button_nine):
                textViewIn.append(btn_nine.getText().toString());
                break;
            case(R.id.button_point):
                if(isPoint==true){
                textViewIn.append(btn_point.getText().toString());
                isPoint=false;}
                else{}
                break;
            case(R.id.button_clean):
                textViewIn.setText(null);
                isPoint=true;
                break;
            case(R.id.button_backspace):
                if(!(textViewIn.length()==0)){
                textViewIn.setText(textViewIn.getText().subSequence(0,textViewIn.length()-1));
                } else {
                }
                break;
            case(R.id.button_sum):
                firstNum=Double.valueOf(textViewIn.getText().toString());
                textViewIn.setText(null);
                action="+";
                isPoint=true;
                break;
            case(R.id.button_ded):
                firstNum=Double.valueOf(textViewIn.getText().toString());
                textViewIn.setText(null);
                action="-";
                isPoint=true;
                break;
            case(R.id.button_inc):
                firstNum=Double.valueOf(textViewIn.getText().toString());
                textViewIn.setText(null);
                action="*";
                isPoint=true;
                break;
            case(R.id.button_div):
                firstNum=Double.valueOf(textViewIn.getText().toString());
                textViewIn.setText(null);
                action="/";
                isPoint=true;
                break;
            case(R.id.button_res):
                secondNum=Double.valueOf(textViewIn.getText().toString());
                result();
                isPoint=true;
                break;
            default:{

            }

        }

    }
    public void result(){
        switch (action){
            case ("+"):
                res=firstNum + secondNum;
                textViewIn.setText(String.format("%s",res));
                break;
            case ("-"):
                res=firstNum - secondNum;
                textViewIn.setText(String.format("%s",res));
                break;
            case ("*"):
                res=firstNum * secondNum;
                textViewIn.setText(String.format("%s",res));
                break;
            case ("/"):
                res=firstNum / secondNum;
                textViewIn.setText(String.format("%s",res));
                break;
        }
    }
}