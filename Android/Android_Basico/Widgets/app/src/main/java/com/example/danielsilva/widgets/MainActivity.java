package com.example.danielsilva.widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;
    Button btnProcessar;
    EditText txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnProcessar = (Button) findViewById (R.id.btnPorcessar);
        txtNome = (EditText) findViewById (R.id.txtNome);
    }

    public void clickBtnProcessar(View v){
        txtResultado.setText("Seja bem vindo "+txtNome.getText());
    }
}
