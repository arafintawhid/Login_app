package com.example.arafintawhid.login_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void userReg(View view)
    {
        startActivity(new Intent(this,Register.class));
    }

    public void userLogin(View view)
    {

    }

}
