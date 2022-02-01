package ru.chistov.Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
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
    TextView textViewOut;


    private void initView(){
        btn1=findViewById(R.id.button_1);
        btn2=findViewById(R.id.button_2);
        btn3=findViewById(R.id.button_3);
        btn4=findViewById(R.id.button_4);
        btn5=findViewById(R.id.button_5);
        btn6=findViewById(R.id.button_6);
        btn7=findViewById(R.id.button_7);
        btn8=findViewById(R.id.button_8);
        btn9=findViewById(R.id.button_9);
        btn0=findViewById(R.id.button_0);
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
        textViewOut=findViewById(R.id.textViewOut);

    }
    private void setListeners(){
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_clean.setOnClickListener(this);
        btn_backspace.setOnClickListener(this);

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
            case(R.id.button_0):
                textViewIn.append(btn0.getText().toString());
                break;
            case(R.id.button_1):
                textViewIn.append(btn1.getText().toString());
                break;
            case(R.id.button_2):
                textViewIn.append(btn2.getText().toString());
                break;
            case(R.id.button_3):
                textViewIn.append(btn3.getText().toString());
                break;
            case(R.id.button_4):
                textViewIn.append(btn4.getText().toString());
                break;
            case(R.id.button_5):
                textViewIn.append(btn5.getText().toString());
                break;
            case(R.id.button_6):
                textViewIn.append(btn6.getText().toString());
                break;
            case(R.id.button_7):
                textViewIn.append(btn7.getText().toString());
                break;
            case(R.id.button_8):
                textViewIn.append(btn8.getText().toString());
                break;
            case(R.id.button_9):
                textViewIn.append(btn9.getText().toString());
                break;
            case(R.id.button_point):
                textViewIn.append(btn_point.getText().toString());
                break;
            case(R.id.button_clean):
                textViewIn.setText(null);
                break;
            case(R.id.button_backspace):
                textViewIn.setText(textViewIn.getText().subSequence(0,textViewIn.length()-1));
                break;
            default:{

            }

        }

    }

}