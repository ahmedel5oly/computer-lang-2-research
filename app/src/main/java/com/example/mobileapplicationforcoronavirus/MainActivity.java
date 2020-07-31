package com.example.mobileapplicationforcoronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private CheckBox symptom1;
    private CheckBox symptom2;
    private CheckBox symptom3;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.status);
         symptom1=findViewById(R.id.checkBox);
         symptom2=findViewById(R.id.checkBox2);
         symptom3=findViewById(R.id.checkBox3);

         button=findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 //StringBuilder stringBuilder = new StringBuilder();
                 if (symptom1.isChecked()) {

                     TextView textView = findViewById(R.id.status);
                     textView.setText("you have to visit your doctor to decide your status. hope you are fine");

                 }
                 if (symptom2.isChecked()) {

                     TextView textView = findViewById(R.id.status);
                     textView.setText("you have to go to the nearest hospital to have care. hope you are fine");

                 }
                 if (symptom3.isChecked()) {

                     TextView textView = findViewById(R.id.status);
                     textView.setText("you have to call the hot line 105 to tell you what to do. hope you are fine ");


                 }

                 // stringBuilder.append(symptom2.getText().toString() + symptom2.isChecked());
                 // stringBuilder.append(symptom3.getText().toString() + symptom3.isChecked());
                 // stringBuilder.append(symptom4.getText().toString() + symptom4.isChecked());
                 // stringBuilder.append(symptom5.getText().toString() + symptom5.isChecked());
                 // stringBuilder.append(symptom6.getText().toString() + symptom6.isChecked());


             }

         });
    }
}
