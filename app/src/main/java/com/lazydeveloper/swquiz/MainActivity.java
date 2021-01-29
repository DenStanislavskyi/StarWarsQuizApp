package com.lazydeveloper.swquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity<mEdit> extends AppCompatActivity {
    int nOfCorAnswers = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void submit(View view) {
        EditText answer = (EditText) findViewById(R.id.plain_text_input);
        Button submit_button = (Button) findViewById(R.id.submit_button);
        RadioButton quiz_2_radio_button1 = (RadioButton) findViewById(R.id.quiz_2_radio_button1);
        String strInput = answer.getText().toString();
        String s1 = "red";
        if (strInput.equalsIgnoreCase(s1))
            nOfCorAnswers += 1;

        if (quiz_2_radio_button1.isChecked()){
            nOfCorAnswers += 1;
        }
        CheckBox quiz_1_checkbox1 = (CheckBox) findViewById(R.id.quiz_1_checkbox1);
        CheckBox quiz_3_checkbox1 = (CheckBox) findViewById(R.id.quiz_3_checkbox1);
        CheckBox quiz_1_checkbox3 = (CheckBox) findViewById(R.id.quiz_1_checkbox3);
        CheckBox quiz_3_checkbox3 = (CheckBox) findViewById(R.id.quiz_3_checkbox3);
        CheckBox quiz_1_checkbox2 = (CheckBox) findViewById(R.id.quiz_1_checkbox2);
        CheckBox quiz_3_checkbox2 = (CheckBox) findViewById(R.id.quiz_3_checkbox2);
        CheckBox quiz_1_checkbox4 = (CheckBox) findViewById(R.id.quiz_1_checkbox4);
        CheckBox quiz_3_checkbox4 = (CheckBox) findViewById(R.id.quiz_3_checkbox4);

        if (quiz_1_checkbox1.isChecked() &  quiz_1_checkbox3.isChecked()){
            if (quiz_1_checkbox2.isChecked() | quiz_1_checkbox4.isChecked()){
            }
            else {
            nOfCorAnswers += 1;
                }
            }
        if (quiz_3_checkbox1.isChecked() &  quiz_3_checkbox3.isChecked()){
            if (quiz_3_checkbox2.isChecked() | quiz_3_checkbox4.isChecked()){
            }
            else {
                nOfCorAnswers += 1;
            }
        }




        Context context = getApplicationContext();
        CharSequence text = "Number of correct answers was " + nOfCorAnswers + " out of 4!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        submit_button.setClickable(false);
    }
    public void reset(View view) {
        finish();
        startActivity(getIntent());
    }


}