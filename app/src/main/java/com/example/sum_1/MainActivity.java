package com.example.sum_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1,b2;
    TextView textView;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.edit_text_1);
        e2=findViewById(R.id.editText_2);
        b1=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        b2=findViewById(R.id.button2);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    a = Integer.parseInt(e1.getText().toString());
                    b = Integer.parseInt(e2.getText().toString());
                    Log.d("A", String.valueOf(a));
                    Log.d("B", String.valueOf(b));
                    String c = String.valueOf(a + b);
                    textView.setText(c);
                    Toast.makeText(MainActivity.this, "Sum of two number " + c, Toast.LENGTH_LONG).show();


                }
            });

        }
}
//this is your project on diffrent version this project put on git hub call me