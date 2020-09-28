package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;
    EditText editText1, editText2, editText3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.bil1);
        editText2 = findViewById(R.id.bil2);
        editText3 = findViewById(R.id.operator);
        button = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView4);
    }
    public void hasil(View view) {
        double bil1 = Double.parseDouble(editText1.getText().toString());
        double bil2 = Double.parseDouble(editText2.getText().toString());
        String operator = editText3.getText().toString();
        double hasil;

        if (operator.equals("+")) {
            hasil = bil1 + bil2;
            textView3.setText("Hasil operasi adalah " + hasil);
        } else if (operator.equals("-")) {
            hasil = bil1 - bil2;
            textView3.setText("Hasil operasi adalah " + hasil);
        } else if (operator.equals("/")) {
            hasil = bil1 / bil2;
            textView3.setText("Hasil operasi adalah " + hasil);
        } else if (operator.equals("*")) {
            hasil = bil1 * bil2;
            textView3.setText("Hasil operasi adalah " + hasil);
        } else {
            textView3.setText("Operasi Aritmatika Salah");
        }
    }
    }