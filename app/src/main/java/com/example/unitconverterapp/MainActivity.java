package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Succesful", Toast.LENGTH_LONG).show();
                String s = editText.getText().toString();
                int cm = Integer.parseInt(s);
                double feet = cm / 30.48;
                textview.setText(String.format("%.2f", feet));
//                editText.setText(kg + " kg");
            }
        });
    }
//     Alternate method to by using on click attribute:
//       public void calculate(View view){
//            String s = editText.getText().toString();
//            int cm = Integer.parseInt(s);
//            double feet = cm / 30.48;
//            textview.setText(String.format("%.2f", feet));
        }
