package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button b1,b2;
    String getName,getAdmnNumber,getMobile,getEmail,getUsnname,getPass,getCnfPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.Admnno);
        ed3=(EditText)findViewById(R.id.mobile);
        ed4=(EditText)findViewById(R.id.email);
        ed5=(EditText)findViewById(R.id.usnname);
        ed6=(EditText)findViewById(R.id.password);
        ed7=(EditText)findViewById(R.id.cnfpass);
        b1=(Button)findViewById(R.id.reg1);
        b2=(Button)findViewById(R.id.reg2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              getName=ed1.getText().toString();
              getAdmnNumber=ed2.getText().toString();
              getMobile=ed3.getText().toString();
              getEmail=ed4.getText().toString();
              getUsnname=ed5.getText().toString();
              getPass=ed6.getText().toString();
              getCnfPass=ed7.getText().toString();
                if(getPass.equals(getCnfPass)) {
                    Toast.makeText(getApplicationContext(), getName, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getAdmnNumber, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getMobile, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getEmail, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getUsnname, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getPass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), getCnfPass, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Password & Confirm password doesnot match",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(e);
            }
        });
    }
}
