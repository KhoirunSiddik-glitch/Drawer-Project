package com.example.drawer_project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drawer_project.R;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.layout_login_relatip);

        login = (Button) findViewById(R.id.btn_login);
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().toUpperCase().equals("TEST1"))
                { login_sukses();

                } else
                {
                    Toast.makeText(getApplicationContext(),"Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("USERNAME", user_login );
        startActivity(i);
    }
}
