package com.alexw.spike;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BracketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brackets);

        final EditText editTextBrackets = (EditText) findViewById(R.id.edit_text_brackets);

        final FloatingActionButton myFabView = (FloatingActionButton) findViewById(R.id.myFAB);
        myFabView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View myView) {

            }
        });

        editTextBrackets.addTextChangedListener(new TextWatcher() {
                                            @Override
                                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                            }

                                            @Override
                                            public void onTextChanged(CharSequence s, int start, int before, int count) {


                                                String strBrackets = editTextBrackets.getText().toString();
                                                int compteur = 0;
                                                StringBuffer strBuff = new StringBuffer(strBrackets);
                                                for (int x = 0; x < strBuff.length(); x++){
                                                    if(strBuff.charAt(x) == '('){
                                                        compteur++;
                                                    } else if(strBuff.charAt(x) == ')'){
                                                        compteur--;
                                                    }
                                                    if(compteur == 0){
                                                        myFabView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
                                                    } else{
                                                        myFabView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF5252")));
                                                    }
                                                }


                                            }

                                            @Override
                                            public void afterTextChanged(Editable s) {

                                            }
                                        });






    }
}
