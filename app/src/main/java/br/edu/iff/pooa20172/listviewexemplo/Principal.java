package br.edu.iff.pooa20172.listviewexemplo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lista = (ListView) findViewById(R.id.lvEquipes);

        final ArrayList<Escola> escolas = adicionarEscolas();

        ArrayAdapter adapter = new EscolaAdapter(this, escolas);
        lista.setAdapter(adapter);

        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Escola: "+escolas.get(i).getNome(),
                        Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Principal.this, Main2Activity.class);
                intent.putExtra("nome", escolas.get(i).getNome());
                startActivity(intent);
            }
        });
    }

    private ArrayList<Escola> adicionarEscolas() {
        ArrayList<Escola> escolas = new ArrayList<Escola>();
        Escola e = new Escola("Colégio Estadual Atheneu Sergipense",
                "Rua Pacatuba S/N", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Escola Estadual General Siqueira",
                "Rua Sergipe S/N", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Escola Tobias Barreto",
                "Av. Otoniel Dórea", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Colegio Estadual Prof G Rollemberg Leite",
                "R. Franklin de Campos Sobral, 1675", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Escola Estadual General Siqueira",
                "Rua Sergipe S/N", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Escola Tobias Barreto",
                "Av. Otoniel Dórea", R.drawable.escola1);
        escolas.add(e);
        e = new Escola("Colegio Estadual Prof G Rollemberg Leite",
                "R. Franklin de Campos Sobral, 1675", R.drawable.escola1);
        escolas.add(e);
        return escolas;
    }
}
