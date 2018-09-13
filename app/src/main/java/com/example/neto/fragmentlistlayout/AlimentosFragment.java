package com.example.neto.fragmentlistlayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AlimentosFragment extends ListFragment{

    private ArrayAdapter<Alimento> adapter;
    private onItemClick listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(!(context instanceof onItemClick)){
            throw new RuntimeException("Deve ser um OnItemClick");
        }

        listener = (onItemClick)context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.adapter = new ArrayAdapter<Alimento>(getActivity(),android.R.layout.simple_list_item_1);

        String[] nomes = getActivity().getResources().getStringArray(R.array.alimentos_nomes);

        String[] precos = getActivity().getResources().getStringArray(R.array.alimentos_precos);

        for(int i=0;i<nomes.length;i++){
            Alimento alimento = new Alimento(nomes[i], Double.parseDouble(precos[i]));

            adapter.add(alimento);

        }

        setListAdapter(this.adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Alimento alimento = adapter.getItem(position);

        if(listener != null){
            listener.onClick(alimento);

        }

    }

    public interface onItemClick{
        void onClick(Alimento alimento);
    }

}
