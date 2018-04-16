package br.com.treinaweb.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNovaTela = (Button) findViewById(R.id.button);
        btnNovaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tela2.class);
                startActivity(intent);
            }
        });

        Log.i("ESTADO_ACTIVITY", "Tela 1::onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ESTADO_ACTIVITY", "Tela 1::onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ESTADO_ACTIVITY", "Tela 1::onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ESTADO_ACTIVITY", "Tela 1::onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ESTADO_ACTIVITY", "Tela 1::onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ESTADO_ACTIVITY", "Tela 1::onDestroy");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("ESTADO_ACTIVITY", "Tela 1::onRestart");
    }
}
