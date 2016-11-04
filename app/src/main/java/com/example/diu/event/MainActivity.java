package com.example.diu.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonOne,buttonTwo;
    TextView nameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button One Click",Toast.LENGTH_SHORT).show();
                nameText.setText("Atik");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Why you click me >:( ",Toast.LENGTH_SHORT).show();
                nameText.setText("Rezwan");
            }
        });
    }

    private void initialize() {
        buttonOne=(Button)findViewById(R.id.button_one);
        buttonTwo=(Button)findViewById(R.id.button_two);
        nameText=(TextView) findViewById(R.id.textView);
    }
}
