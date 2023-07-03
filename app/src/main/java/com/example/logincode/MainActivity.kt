package com.example.logincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import java.util.Scanner


class MainActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main);

            TextView Username = (TextView) findViewById(R.id.username)
            TextView Password = (TextView) findViewById(R.id.Password)
            MaterialButton loginbtn = (MaterialButton) fIndViewby(R.id.Loginbtn);

            //Admin and Admin

            loginbtn.setOnClickListener(new View.OnClickListener() {
                @Override
            public void  onClick(View v)
           if(username.getText().toString().equal("Admin")) && Password.getText().toString.equals("Admin") }
            )
            //correct password
            Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show;

        }else
            //incorrect password
    Toast.makeText(MainActivity.this, "LOGIN UNSUCCESSFUL",Toast.LENGTH_SHORT).show;


}


