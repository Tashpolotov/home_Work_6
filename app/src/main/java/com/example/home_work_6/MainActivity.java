package com.example.home_work_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
    }

    private void find(){
        EditText name = findViewById(R.id.usarname);
        EditText password = findViewById(R.id.password);
        EditText email = findViewById(R.id.email);

        Button btn = findViewById(R.id.sing);
        CheckBox chek = findViewById(R.id.boxx);
        Button x = findViewById(R.id.X);
        Button Show = findViewById(R.id.Show);

        btn.setOnClickListener(view -> {

            if (name.getText().toString().equals("Clown") && password.getText().toString().equals("password")){
                btn.setText("Вы вошли");
                name.setVisibility(View.INVISIBLE);
                password.setVisibility(View.INVISIBLE);
                email.setVisibility(View.INVISIBLE);
                x.setVisibility(View.INVISIBLE);
                }

            else {
                btn.setText("Вы ввели не правильный логин или пароль bbbbbbbbbbbbbbbbbbbbbbbbbbb");

            }

        });
        x.setOnClickListener(view -> {
            name.getText().clear();
            password.getText().clear();
            email.getText().clear();
        });

    }
}