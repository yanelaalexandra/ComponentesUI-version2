package com.pachacama04.componentesui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;



public class AndroidButtonActivity extends AppCompatActivity {
    private static final String TAG = AndroidButtonActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_button);


    }


    public void callButon1(View view, Context contex){

        Log.d("TestButton", "Entro al botón 1");

        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();


    }


}
