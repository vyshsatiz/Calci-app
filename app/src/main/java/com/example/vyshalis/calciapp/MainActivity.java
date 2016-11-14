package com.example.vyshalis.calciapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

//Additional imports
import android.view.View;     //Where ever you need to widgets
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String sign = "";
    public String total = "";
    public Double tempDouble, tempDouble2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons 0-9
        Button button0 = (Button) findViewById(R.id.button0);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);

        //Buttons Clear and Equals
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonE = (Button) findViewById(R.id.buttonE);

        //Buttons Add, Subtract, Divide, Multiply
        Button buttonA = (Button) findViewById(R.id.buttonA);
        Button buttonS = (Button) findViewById(R.id.buttonS);
        Button buttonM = (Button) findViewById(R.id.buttonM);
        Button buttonD = (Button) findViewById(R.id.buttonD);

        //Button 0 Event Handler
        button0.setOnClickListener(
                //Button 0 Interface
                new Button.OnClickListener() {
                    //Button 0 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("0");
                    }
                }
        );

        //Button 1 Event Handler
        button1.setOnClickListener(
                //Button 1 Interface
                new Button.OnClickListener() {
                    //Button 1 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("1");
                    }
                }
        );

        //Button 2 Event Handler
        button2.setOnClickListener(
                //Button 2 Interface
                new Button.OnClickListener() {
                    //Button 2 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("2");
                    }
                }
        );

        //Button 3 Event Handler
        button3.setOnClickListener(
                //Button 3 Interface
                new Button.OnClickListener() {
                    //Button 3 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("3");
                    }
                }
        );

        //Button 4 Event Handler
        button4.setOnClickListener(
                //Button 4 Interface
                new Button.OnClickListener() {
                    //Button 4 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("4");
                    }
                }
        );

        //Button 5 Event Handler
        button5.setOnClickListener(
                //Button 5 Interface
                new Button.OnClickListener() {
                    //Button 5 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("5");
                    }
                }
        );

        //Button 6 Event Handler
        button6.setOnClickListener(
                //Button 6 Interface
                new Button.OnClickListener() {
                    //Button 6 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("6");
                    }
                }
        );

        //Button 7 Event Handler
        button7.setOnClickListener(
                //Button 7 Interface
                new Button.OnClickListener() {
                    //Button 7 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("7");
                    }
                }
        );

        //Button 8 Event Handler
        button8.setOnClickListener(
                //Button 8 Interface
                new Button.OnClickListener() {
                    //Button 8 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("8");
                    }
                }
        );

        //Button 9 Event Handler
        button9.setOnClickListener(
                //Button 9 Interface
                new Button.OnClickListener() {
                    //Button 9 Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.append("9");
                    }
                }
        );

        //Button C Event Handler
        buttonC.setOnClickListener(
                //Button C Interface
                new Button.OnClickListener() {
                    //Button C Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        output.setText(" ");
                    }
                }
        );

        //Button A Event Handler
        buttonA.setOnClickListener(
                //Button A Interface
                new Button.OnClickListener() {
                    //Button A Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText(" ");
                        sign = "+";
                    }
                }
        );

        //Button S Event Handler
        buttonS.setOnClickListener(
                //Button S Interface
                new Button.OnClickListener() {
                    //Button S Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText(" ");
                        sign = "-";
                    }
                }
        );

        //Button M Event Handler
        buttonM.setOnClickListener(
                //Button M Interface
                new Button.OnClickListener() {
                    //Button M Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText(" ");
                        sign = "*";
                    }
                }
        );

        //Button D Event Handler
        buttonD.setOnClickListener(
                //Button D Interface
                new Button.OnClickListener() {
                    //Button D Callback Method
                    public void onClick(View v) {
                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble = Double.parseDouble(output.getText().toString());
                        output.setText(" ");
                        sign = "/";
                    }
                }
        );

        //Button Equals
        buttonE.setOnClickListener(
                //Button E Interface
                new Button.OnClickListener() {
                    public void onClick(View v) {

                        TextView output = (TextView) findViewById(R.id.editText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+")

                        {
                            output.setText(Double.toString(tempDouble + tempDouble2));
                        } else if (sign == "-")

                        {
                            output.setText(Double.toString(tempDouble - tempDouble2));
                        } else if (sign == "*")

                        {
                            output.setText(Double.toString(tempDouble * tempDouble2));
                        } else if (sign == "/")

                        {
                            if (tempDouble2 == 0) {
                                //Cannot divide by zero
                                output.setText("Cannot Divide By Zero");
                            } else {
                                output.setText(Double.toString(tempDouble / tempDouble2));
                            }
                        }
                        //Reset the Sign Variable
                        sign = "";

                    }
                }

        );
    }
}




