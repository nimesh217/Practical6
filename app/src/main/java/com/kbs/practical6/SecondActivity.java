package com.kbs.practical6;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    TextView tvfirst,tvsecond,tvthird,tvfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvfirst=(TextView) findViewById(R.id.first);
        tvsecond=(TextView)findViewById(R.id.second);
        tvthird=(TextView)findViewById(R.id.third);
        tvfourth=(TextView)findViewById(R.id.fourth);

        Bundle bundle=getIntent().getExtras();
        tvfirst.setText(bundle.getString("ufname"));
        tvsecond.setText(bundle.getString("ulname"));
        tvthird.setText(bundle.getString("uemail"));
        tvfourth.setText(bundle.getString("udob"));

    }
}
