package com.example.anshukumar.externalintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String ExtraMsg=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tx1=(EditText)findViewById(R.id.editText);
        final Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        Button bn=(Button)findViewById(R.id.button);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg=tx1.getText().toString();
                intent.putExtra(ExtraMsg,msg);
                startActivity(intent);
            }
        });
    }
}
