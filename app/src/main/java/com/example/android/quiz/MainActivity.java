package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Checking first answer (Wellington)
    public void RadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.buttonB:
                if (checked)
                    incrementPoints();
        }
    }

    //Checking second answer, RadioGroup (Mt Cook)
    public void RadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.buttonD2:
                if (checked)
                    incrementPoints();
                break;
        }
    }

    //Checking fifth RadioGroup (4mln)
    public void RadioButtonClicked5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.buttonB5:
                if (checked)
                    incrementPoints();
                break;
        }
    }

    //Checking sixth RadioGroup (Maori)
    public void RadioButtonClicked6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.buttonD6:
                if (checked)
                    incrementPoints();
                break;
        }
    }

    //Checking seventh RadioGroup (Southen Cross)
    public void RadioButtonClicked7(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.buttonA7:
                if (checked)
                    incrementPoints();
                break;
        }
    }

    //Checking eighth RadioGroup (Kiwi)
    public void RadioButtonClicked8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.buttonC8:
                if (checked)
                    incrementPoints();
                break;
        }
    }

    //Checking eighth RadioGroup (Rugby)
    public void RadioButtonClicked9(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.buttonA9:
                if (checked)
                    incrementPoints();
                break;
        }
    }


    //Checking first CheckBox
    public void CheckBoxClicked(View view) {
        // Is the button now checked?
        CheckBox checkBoxA = findViewById(R.id.checkbox_a);
        boolean hasCheckedA = checkBoxA.isChecked();
        CheckBox checkBoxB = findViewById(R.id.checkbox_b);
        boolean hasCheckedB = checkBoxB.isChecked();
        CheckBox checkBoxC = findViewById(R.id.checkbox_c);
        boolean hasCheckedC = checkBoxC.isChecked();
        CheckBox checkBoxD = findViewById(R.id.checkbox_d);
        boolean hasCheckedD = checkBoxD.isChecked();

        if (hasCheckedB) {
            incrementPoints();
        }
        if (hasCheckedD) {
            incrementPoints();
        }
        if (hasCheckedA) {
            decrementPoints();
        }
        if (hasCheckedC) {
            decrementPoints();
        }
    }
//Checking first EditText
    public void checkEditText() {

        EditText editTextAnswer = findViewById(R.id.editText_answer);

        String passedAnswer = editTextAnswer.getText().toString().trim();


        String correctAnswer = "two";

        if (passedAnswer.equals(correctAnswer)) {
            incrementPoints();
        }


    }

    int totalPoints = 0;


    //This method decrement points
    public int decrementPoints() {
        totalPoints = totalPoints - 10;
        return totalPoints;
    }
    //This method increment points
    public int incrementPoints() {
        totalPoints = totalPoints + 10;
        return totalPoints;
    }

    // This method is used when button pressed
    public void submit(View view) {

        EditText name = (EditText) findViewById(R.id.name);
        String nameOfuser = name.getText().toString();

        // This is a toast message
        Toast.makeText(this, "Thank you " + nameOfuser + "\nYour points: " + totalPoints + "/100", Toast.LENGTH_LONG).show();
        checkEditText();


    }

}
