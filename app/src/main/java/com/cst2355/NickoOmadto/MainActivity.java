package com.cst2355.NickoOmadto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button buttonClick;
    private Switch switchClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear);

        buttonClick = findViewById(R.id.button_click_here);
        switchClick = (Switch) findViewById(R.id.switch1);


        buttonClick.setOnClickListener( new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Toast.makeText(getApplicationContext(), R.string.toast_message, Toast.LENGTH_LONG).show();

            }
        });

        switchClick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b ) {
                Snackbar sb;
                if(b){
                    sb = Snackbar.make(compoundButton, R.string.switchturnon, Snackbar.LENGTH_SHORT)
                            .setAction("redo", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    switchClick.toggle();}
                            });
                }
                else {
                    sb = Snackbar.make(compoundButton, R.string.switchturnoff, Snackbar.LENGTH_SHORT);
                }
                sb.show();
            }
        });
    }
}