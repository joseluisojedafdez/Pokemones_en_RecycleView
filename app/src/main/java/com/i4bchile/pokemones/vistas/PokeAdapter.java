package com.i4bchile.pokemones.vistas;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.i4bchile.pokemones.R;
import com.i4bchile.pokemones.modelo.Pokemon;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PokeAdapter extends RecyclerView.Adapter<PokeAdapter.PokeViewHolder> {

    private List<Pokemon> pokemonList;


    public PokeAdapter(List<Pokemon> pokelist) {
        pokemonList = pokelist;

    }

    @NonNull
    @Override
    public PokeAdapter.PokeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_list_pokemon, parent, false);
        return new PokeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokeAdapter.PokeViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.bind(pokemon);

    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }


    public class PokeViewHolder extends RecyclerView.ViewHolder {

        private TextView pokename;
        private TextView pokeId;
        private ImageView pokeImage;
        private TextView pokeLabel;
        private Picasso picasso;

        public PokeViewHolder(@NonNull View itemView) {
            super(itemView);
            pokename = itemView.findViewById(R.id.tv_PokeName);
            pokeId = itemView.findViewById(R.id.tx_pokeID);
            pokeImage = itemView.findViewById(R.id.img_pokeImage);
            pokeLabel = itemView.findViewById(R.id.tv_pokelabels);
        }

        public String getlabels(List<String> listalabels) {
                String texto="";
            for (int i = 0; i < listalabels.size(); i++) {

                texto = texto + listalabels.get(i);
                if (i<listalabels.size()-1) {
                    texto=texto+" and ";
                }

            }
            return texto;
        }

        public void bind(Pokemon pokemon) {
            pokename.setText(pokemon.getName());
            pokeId.setText(pokemon.getId());
            String texto = getlabels(pokemon.getLabels());
            picasso.get().load(pokemon.getImageSrc()).
                    resize(50, 50).into(pokeImage);
            pokeLabel.setText(texto);

        }
    }
}
