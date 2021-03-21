package com.example.aplikasiandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnSignin;

    EditText edmail, edpassword;

    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignin=findViewById(R.id.btnSignin);

        edmail=findViewById(R.id.edEmail);

        edpassword=findViewById((R.id.edPassword);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edmail.getText().toString();

                password = edpassword.getText().toString();

                String email = "admin@mail.com";

                String pass = "123";

                if(nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib di isi!",
                            Toast.LENGTH_LONG);
                    t.show();
                }   else {

                        if (nama.equals(email) && password.equals(pass)){
                            Toast t = Toast.makeText(getApplicationContext()),
                                    "login sukses",
                                    Toast.LENGTH_LONG);
                            t.show();

                            Bundle b = new Bundle();

                            b.putString("a", nama.trim());

                            b.putString("b", password.trim());

                            Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                            getIntent().putExtra(b);

                            startActivity(i);
                            }   else {
                            Toast t = Toast.makeText(getApplicationContext()),
                                    "Login Gagal", Toast.LENGTH_LONG);

                            t.show();
                        }
                }




            }
        });
    }
}