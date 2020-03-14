package com.example.hms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button mLogin;
    private EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        mLogin = findViewById(R.id.button_login);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Executing Retrofit queries
                String username_ = username.getText().toString();
                String password_ = password.getText().toString();
                if (TextUtils.isEmpty(username_)){
                    username.setError("Enter Username");
                }else if (TextUtils.isEmpty(password_)){
                    password.setError("Enter Password");
                }
                else{
                    Toast.makeText(LoginActivity.this, "Login", Toast.LENGTH_SHORT).show();
                    // Execute retrofit queries
                }
            }
        });


    }
}
