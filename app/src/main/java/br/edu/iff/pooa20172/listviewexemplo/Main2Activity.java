package br.edu.iff.pooa20172.listviewexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String parametro = (String) intent.getSerializableExtra("nome");

        TextView nome = (TextView) findViewById(R.id.tvNomeEscola);
        nome.setText(parametro);
    }
}
