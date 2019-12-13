package com.example.eric.mycal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Binaryconversion extends AppCompatActivity {
    List<String> list;
    ArrayAdapter<String> arrayAdapter;
    Spinner currentSpinner;
    Spinner targetSpinner;
    TextView input;
    TextView output;
    //用于存储信息
    String inputmessage_unit;
    String targetmessage_unit;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button clear;
    Button button;
    Button Dot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binaryconversion);
        currentSpinner = (Spinner) findViewById(R.id.spinner);
        targetSpinner = (Spinner) findViewById(R.id.spinner2);
        input = (TextView) findViewById(R.id.input_unit);
        output = (TextView) findViewById(R.id.result_unit);
        button0 = (Button)findViewById(R.id.btn_0) ;
        button1 = (Button)findViewById(R.id.btn_1) ;
        button2 = (Button)findViewById(R.id.btn_2) ;
        button3 = (Button)findViewById(R.id.btn_3) ;
        button4 = (Button)findViewById(R.id.btn_4) ;
        button5 = (Button)findViewById(R.id.btn_5) ;
        button6 = (Button)findViewById(R.id.btn_6) ;
        button7 = (Button)findViewById(R.id.btn_7) ;
        button8 = (Button)findViewById(R.id.btn_8) ;
        button9 = (Button)findViewById(R.id.btn_9) ;
        clear = (Button)findViewById(R.id.btn_clc) ;
        button = (Button)findViewById(R.id.button_unit) ;

        Dot = (Button)findViewById((R.id.btn_dot)) ;
        initDatas();
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        currentSpinner.setAdapter(arrayAdapter);
        targetSpinner.setAdapter(arrayAdapter);

        //当前下拉框绑定选择事件
        currentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //获取当前进制
                inputmessage_unit = list.get(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        targetSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //获取目标进制
                targetmessage_unit = list.get(i);
                Toast.makeText(Binaryconversion.this,"您要转化的长度是:"+list.get(i),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button0.getText().toString());
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button2.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button3.getText().toString());
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button4.getText().toString());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button5.getText().toString());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button6.getText().toString());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button7.getText().toString());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button8.getText().toString());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+button9.getText().toString());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
            }
        });

        Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString()+Dot.getText().toString());
            }
        }
        );
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //清空output
                output.setText("");

                        String result = UnitConversion.conversion( input.getText().toString(),inputmessage_unit, targetmessage_unit);
                        output.setText(result);

                    }



        });


    }
        private void initDatas(){
        list= new ArrayList<String>();
//        list.add("毫米");
        list.add("厘米");
        list.add("分米");
        list.add("米");
        list.add("千米");
//        list.add("英寸");
//        list.add("英尺");
//        list.add("码");
//        list.add("英里");
//        list.add("海里");

    }
}
