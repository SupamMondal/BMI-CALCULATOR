package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
        EditText editgender;
        EditText editage;
        EditText editweight,editheightft,editheightin;
        Button btncalculate;
        TextView  bmivalue,result;
        LinearLayout llmain;

        editgender=findViewById(R.id.genderedit);
        editage=findViewById(R.id.edtage);
        editweight=findViewById(R.id.editweight);
        editheightft=findViewById(R.id.editheightFt);
        editheightin=findViewById(R.id.editheightIn);
        btncalculate=findViewById(R.id.editbutton);
        bmivalue=findViewById(R.id.editbmivalue);
        result=findViewById(R.id.edittextview);
        llmain=findViewById(R.id.llmain);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gen=editgender.getText().toString();
                String str1="male";
                String str2="female";
                int age=Integer.parseInt(editage.getText().toString());
                int wt=Integer.parseInt(editweight.getText().toString());
                int ft=Integer.parseInt(editheightft.getText().toString());
                int in=Integer.parseInt(editheightin.getText().toString());
                int totalin=ft*12+in;
                double totalcm=totalin*2.53;
                double totalmt=totalcm/100;
                double bmi=wt/(totalmt*totalmt);

                bmivalue.setText("BMI value is:"+bmi);

                if(gen.equalsIgnoreCase(str1)){
                    if(age>=18 && age<=34 && bmi>=23 && bmi<=25.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=35 && age<=44 && bmi>=23 && bmi<=26.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=45 && age<=54 && bmi>=24 && bmi<=27.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=55 && age<=64 && bmi>=23 && bmi<=28.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=65 && age<=74 && bmi>=25 && bmi<=28.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=75 && age<=99 && bmi>=25 && bmi<=32.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else{
                        result.setText("Your BMI IS NOT NORMAL");
                    }
                }


               else if(gen.equalsIgnoreCase(str2)){
                    if(age>=18 && age<=34 && bmi>=15.5 && bmi<=24.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=35 && age<=44 && bmi>=19 && bmi<=23.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=45 && age<=49 && bmi>=20 && bmi<=25.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=50 && age<=54 && bmi>=22 && bmi<=26.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=55 && age<=64 && bmi>=23 && bmi<=27.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=65 && age<=74 && bmi>=24 && bmi<=28.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else if(age>=75 && age<=99 && bmi>=24 && bmi<=29.9){
                        result.setText("Your BMI IS NORMAL");
                    }
                    else{
                        result.setText("Your BMI IS NOT NORMAL");
                    }
                }


            }
        });
    }
}