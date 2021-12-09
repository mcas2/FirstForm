package com.mcas2.firstform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public TextView mostrar;
    public EditText nom;
    public EditText ap;
    public CheckBox c1;
    public CheckBox c2;
    public CheckBox c3;
    public CheckBox c4;
    public CheckBox c5;
    public CheckBox c6;
    public CheckBox c7;
    public CheckBox c8;
    public CheckBox c9;
    public CheckBox c10;
    public RadioGroup rg;
    public Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mostrarTexto = (TextView) findViewById(R.id.mostrarTexto);
        EditText nom = (EditText) findViewById(R.id.enombre);
        EditText ap = (EditText) findViewById(R.id.eapellidos);
        CheckBox c1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox c4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox c5 = (CheckBox) findViewById(R.id.checkBox5);
        CheckBox c6 = (CheckBox) findViewById(R.id.checkBox6);
        CheckBox c7 = (CheckBox) findViewById(R.id.checkBox7);
        CheckBox c8 = (CheckBox) findViewById(R.id.checkBox8);
        CheckBox c9 = (CheckBox) findViewById(R.id.checkBox9);
        CheckBox c10 = (CheckBox) findViewById(R.id.checkBox10);
        RadioGroup rg = (RadioGroup) findViewById(R.id.estado);

        ArrayList<String> aficiones = new ArrayList<>();
        if (c1.isChecked()){
            aficiones.add(c1.getText().toString());
        } else if (c2.isChecked()){
            aficiones.add(c2.getText().toString());
        } else if (c3.isChecked()){
             aficiones.add(c3.getText().toString());
        } else if (c4.isChecked()){
             aficiones.add(c4.getText().toString());
        } else if (c5.isChecked()){
             aficiones.add(c5.getText().toString());
        } else if (c6.isChecked()){
             aficiones.add(c6.getText().toString());
        } else if (c7.isChecked()){
             aficiones.add(c7.getText().toString());
        } else if (c8.isChecked()){
             aficiones.add(c8.getText().toString());
        } else if (c9.isChecked()){
             aficiones.add(c9.getText().toString());
        } else if (c10.isChecked()){
             aficiones.add(c10.getText().toString());
        }

        @SuppressLint("ResourceType") String estadoCivil = getString(rg.getCheckedRadioButtonId());


        Button b = (Button) findViewById(R.id.mostrar);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTexto.setText(
                        String.format("Usted es %s %s y está %s%s", nom.getText(), ap.getText(), estadoCivil, aficiones.toString())
                );
            }
        });


    }
}