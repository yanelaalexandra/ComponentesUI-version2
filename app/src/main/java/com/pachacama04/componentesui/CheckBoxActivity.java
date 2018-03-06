package com.pachacama04.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_check_box);

         checkBox = (CheckBox) findViewById(R.id.checkBox);
        // Setting check to specific checkbox
        checkBox.setChecked(true);

        if(checkBox.isChecked())
            Toast.makeText(this, "First checkbox is checked!", Toast.LENGTH_LONG).show();

    }


    public void androidCheckBoxClicked(View view) {
        // action for checkbox click
        switch (view.getId()) {
            case R.id.checkBox:
                CheckBox checkBox = (CheckBox) view;
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " selected!", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                Toast.makeText(this,  "Second item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox3:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox4:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox5:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox6:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox7:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox8:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox9:
                Toast.makeText(this,  "Other item select¡", Toast.LENGTH_LONG).show();
                break;
        }
    }

}
