package com.example.luvin.drawercero.Coleccion;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.luvin.drawercero.R;

import java.util.ArrayList;


import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class InformacionFragment extends Fragment {
    private List<DatoConsultarColeccionPrueba> datoConsultarColeccionPruebas;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;

    public InformacionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_informacion, container, false);
        datoConsultarColeccionPruebas = this.getAllData();
        mRecyclerView =  view.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new InformacionAdapter(datoConsultarColeccionPruebas, R.layout.list_item_informacion,
                new InformacionAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(DatoConsultarColeccionPrueba datoConsultarColeccionPrueba, int position) {


                    }
                });
        mRecyclerView.setHasFixedSize(true);
        // Añade un efecto por defecto, si le pasamos null lo desactivamos por completo
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        // Enlazamos el layout manager y adaptador directamente al recycler view
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        return view;
    }

    private List<DatoConsultarColeccionPrueba> getAllData(){
        return new ArrayList<DatoConsultarColeccionPrueba>() {{
            add(new DatoConsultarColeccionPrueba("Colección Cangrejos","Nueva Coleccion Cangrejo",  R.drawable.cangrejo1, "Los crustáceos constituyen un enorme y diverso grupo del reino animal, con grandes utilidades ecológicas, alimenticias y económicas; lo que ha permitido en muchas partes del mundo despertar un interés en el campo de la investigación. Uno de los subgrupos más importantes de Crustáceos Decápodos, lo constituyen los cangrejos tanto marinos como de agua dulce, los cuales se distribuyen desde mar adentro, costas ,playas, baja marea, esteros, zonas dulces, terrestres, ríos,  lagos, lagunas y  otros cuerpos de agua de menor volumen.\n" +
                    "\n "));
            add(new DatoConsultarColeccionPrueba("Colección Macrohongos", "Por qué es importante saberlo",R.drawable.cangrejo2, ""));
            add(new DatoConsultarColeccionPrueba("Colección MacroAlgas", "¿Que son las MacroAlgas?",R.drawable.macroalga1, ""));
            add(new DatoConsultarColeccionPrueba("Colección Moluscos", "¿Que son los Moluscos?'",R.drawable.moluscos1, ""));


        }};
    }
}