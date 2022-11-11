package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.calculator.databinding.ActivityCalculatorDashboardBinding;

public class calculatorDashboard extends AppCompatActivity {
ActivityCalculatorDashboardBinding binding;
int num1,num2,result;
String c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCalculatorDashboardBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
    }

    public void clearnumber(View view){
        String oldtex = binding.inputnumber.getText().toString();
        if(oldtex.length() != 0){
        String newtext = oldtex.substring(0,oldtex.length()-1);
        binding.inputnumber.setText(newtext);
        binding.showresult.setText(newtext);
        }
    }

    public void btnclear(View view){
        binding.inputnumber.setText("");
        binding.showresult.setText("");
    }


    public void btn7(View view){
        updateText("7");
    }


    public void btn8(View view){
        updateText("8");
    }


    public void btn9(View view){
        updateText("9");
    }

    public void btn4(View view){
        updateText("4");
    }

    public void btn5(View view){
        updateText("5");
    }

    public void btn6(View view){
        updateText("6");
    }

    public void btn1(View view){
        updateText("1");
    }

    public void btn2(View view){
        updateText("2");
    }
    public void btn3(View view){
        updateText("3");
    }

    public void btn0(View view){
        updateText("0");
    }
    public void btndot(View view){
        updateText(".");
    }

    public void btnmult(View view){
        num2 = Integer.parseInt(binding.inputnumber.getText().toString());
        updateText("*");
        binding.inputnumber.setText("");
        c = "*";
    }

    public void btnsub(View view){
        num2 = Integer.parseInt(binding.inputnumber.getText().toString());
        binding.inputnumber.setText("");
        updateText("-");
        c = "-";
    }

    public void btnplus(View view){
        num2 = Integer.parseInt(binding.inputnumber.getText().toString());
        binding.inputnumber.setText("");
        updateText("+");
        c = "+";
    }

    public void btndiv(View view){
        num2 = Integer.parseInt(binding.inputnumber.getText().toString());
        binding.inputnumber.setText("");
        updateText("/");
        c = "/";
    }

    public void btnequal(View view){
        num1 = Integer.parseInt(binding.inputnumber.getText().toString());
            if(c == "+"){
               result = num2 + num1;
            }

            if(c == "-"){
                result = num2 - num1;
            }

            if(c == "*"){
                result = num2 * num1;
            }

            if(c == "/"){
                result = num2 / num1;
            }

            binding.showresult.setText(String.valueOf(result));
    }

    private void updateText(String s) {
        String oldstr = binding.inputnumber.getText().toString();
        binding.inputnumber.setText(String.format("%s%s",oldstr,s));
        binding.showresult.setText(String.format("%s%s",oldstr,s));
    }
}