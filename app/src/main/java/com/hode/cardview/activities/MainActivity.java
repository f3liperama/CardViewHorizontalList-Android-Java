package com.hode.cardview.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.hode.cardview.R;
import com.hode.cardview.adapters.Adapter;
import com.hode.cardview.models.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Postagem> listaPostagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        this.criarPostagens();

        Adapter adapter = new Adapter(this.listaPostagens);
        recyclerView.setAdapter(adapter);
    }

    private void criarPostagens() {
        this.listaPostagens.add(new Postagem("Felipe", "#TBT", R.drawable.imagem1));
        this.listaPostagens.add(new Postagem("Matheus", "#TBT", R.drawable.imagem2));
        this.listaPostagens.add(new Postagem("Barros", "#TBT", R.drawable.imagem3));
        this.listaPostagens.add(new Postagem("Alves", "#TBT", R.drawable.imagem4));
    }
}
