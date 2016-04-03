package com.example.arafintawhid.login_app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends Activity {

    EditText ET_NAME, ET_USERNAME, ET_USEREMAIL, ET_USERPASS;
    String name, user_name, user_email, user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ET_NAME = (EditText)findViewById(R.id.editText_name);
        ET_USERNAME = (EditText)findViewById(R.id.editText_new_user_name);
        ET_USEREMAIL = (EditText)findViewById(R.id.editText_user_email);
        ET_USERPASS = (EditText)findViewById(R.id.editText_user_pass);
    }

    public void userReg(View view)
    {
        name = ET_NAME.getText().toString();
        user_name = ET_USERNAME.getText().toString();
        user_email = ET_USEREMAIL.getText().toString();
        user_pass = ET_USERPASS.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,user_email,user_pass);
        finish();
    }

}
