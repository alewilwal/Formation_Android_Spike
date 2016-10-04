package com.alexw.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class BracketsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brackets);

        final EditText editTextBrackets = (EditText) findViewById(R.id.edit_text_brackets);
        final TextView textViewBrackets = (TextView) findViewById(R.id.text_brackets);


        editTextBrackets.addTextChangedListener(new TextWatcher() {
                                            @Override
                                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                            }

                                            @Override
                                            public void onTextChanged(CharSequence s, int start, int before, int count) {


                                                String strBrackets = editTextBrackets.getText().toString();
                                                int compteur = 0;
                                                String result = "";
                                                StringBuffer strBuff = new StringBuffer(strBrackets);
                                                for (int x = 0; x < strBuff.length(); x++){
                                                    if(strBuff.charAt(x) == '('){
                                                        compteur++;
                                                    } else if(strBuff.charAt(x) == ')'){
                                                        compteur--;
                                                    }
                                                    if(compteur == 0){
                                                        result = "OK";
                                                    } else{
                                                        result = "NO";
                                                    }
                                                }
                                                TextView textViewBrackets = (TextView) findViewById(R.id.text_brackets);
                                                textViewBrackets.setText(result);

                                            }

                                            @Override
                                            public void afterTextChanged(Editable s) {

                                            }
                                        });






    }
}
