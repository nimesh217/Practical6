package com.kbs.practical6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText etfname,etlname,etemail,etdob;
    Button btnregister,btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfname=(EditText)findViewById(R.id.etfname);
        etlname=(EditText)findViewById(R.id.etlname);
        etemail=(EditText)findViewById(R.id.etuseremail);
        etdob=(EditText)findViewById(R.id.etuserdob);
        btnregister=(Button)findViewById(R.id.btnregister);
        btnclear=(Button)findViewById(R.id.btnclear);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etfname.setText("");
                etlname.setText("");
                etemail.setText("");
                etdob.setText("");

            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fnm,lnm,email,dob;
                fnm=etfname.getText().toString();
                lnm=etlname.getText().toString();
                email=etemail.getText().toString();
                dob=etdob.getText().toString();
                Intent myintent=new Intent(MainActivity.this,SecondActivity.class);
                myintent.putExtra("ufname",fnm);
                myintent.putExtra("ulname",lnm);
                myintent.putExtra("uemail",email);
                myintent.putExtra("udob",dob);
                startActivity(myintent);
            }
        });
    }
}
