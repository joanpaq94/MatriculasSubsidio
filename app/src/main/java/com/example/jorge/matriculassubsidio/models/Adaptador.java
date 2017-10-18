package com.example.jorge.matriculassubsidio.models;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.jorge.matriculassubsidio.R;

import java.util.List;

/**
 * Created by jorge on 13/10/17.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView matricula, subsidio, grado0,grado1,grado2,grado3,grado4,grado5,grado6,grado7;
        private CardView card;


        public ViewHolder(View itemView) {
            super(itemView);

            matricula = (TextView) itemView.findViewById(R.id.textView2);
            subsidio = (TextView) itemView.findViewById(R.id.textView3);
            grado0=(TextView) itemView.findViewById(R.id.grado00);
            grado1=(TextView) itemView.findViewById(R.id.grado01);
            grado2=(TextView) itemView.findViewById(R.id.grado02);
            grado3=(TextView) itemView.findViewById(R.id.grado03);
            grado4=(TextView) itemView.findViewById(R.id.grado04);
            grado5=(TextView) itemView.findViewById(R.id.grado05);
            grado6=(TextView) itemView.findViewById(R.id.grado06);
            grado7=(TextView) itemView.findViewById(R.id.grado07);

            card=(CardView)itemView.findViewById(R.id.card);

        }
    }

    public List<Matricula> lista;

    public Adaptador(List<Matricula> lista) {
        this.lista = lista;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_hol, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.matricula.setText(lista.get(position).getMunicipio());
        holder.subsidio.setText(lista.get(position).getTotalMatriculaSubsidiada());
        holder.grado0.setText(lista.get(position).getGrado0());
        holder.grado1.setText(lista.get(position).getGrado1());
        holder.grado2.setText(lista.get(position).getGrado2());
        holder.grado3.setText(lista.get(position).getGrado3());
        holder.grado4.setText(lista.get(position).getGrado4());
        holder.grado5.setText(lista.get(position).getGrado5());
        holder.grado6.setText(lista.get(position).getGrado6());
        holder.grado7.setText(lista.get(position).getGrado7());

        YoYo.with(Techniques.ZoomIn).playOn(holder.card);

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
