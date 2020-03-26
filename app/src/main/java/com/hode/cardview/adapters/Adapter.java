package com.hode.cardview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hode.cardview.R;
import com.hode.cardview.models.Postagem;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Postagem> listaPostagens;

    //Construtores
    public Adapter(List<Postagem> listaPostagens) {
        this.listaPostagens = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_card_list, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = this.listaPostagens.get(position);

        holder.textNome.setText(postagem.getNome());
        holder.imageThumbnail.setImageResource(postagem.getThumbnail());
        holder.textPostagem.setText(postagem.getPostagem());

    }

    @Override
    public int getItemCount() {
        return this.listaPostagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textNome;
        private TextView textPostagem;
        private ImageView imageThumbnail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imageThumbnail = itemView.findViewById(R.id.imageThumbnail);
        }
    }

}
