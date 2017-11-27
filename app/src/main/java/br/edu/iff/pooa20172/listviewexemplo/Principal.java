package br.edu.iff.pooa20172.listviewexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.equipes,android.R.layout.simple_list_item_1);

        lista.setAdapter(adapter);
    }
}
