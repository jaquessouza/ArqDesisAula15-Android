package com.usjt.caixaeletronico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.if );

    }

    //acess to account
    public void acessAccount(View view){

        Intent intent = new Intent(this, Account.class);

        startActivity(intent);
    }
}