package com.example.prog3;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    EditText emailText,passwordtext;
    String rEmail, rPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailText=findViewById(R.id.editTextEmail);
        passwordtext=findViewById(R.id.editTextPassword);
        rEmail=getIntent().getStringExtra("email");
        rPassword=getIntent().getStringExtra("password");
    }
    public void login(View view)
    {
        String email=emailText.getText().toString();
        String password=passwordtext.getText().toString();
        if(rEmail.equals(email) && rPassword.equals(password))
        {
            Intent intent=new Intent(this, LoginSuccessful.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Invalid Credentials",Toast.LENGTH_LONG).show();
        }
    }
}