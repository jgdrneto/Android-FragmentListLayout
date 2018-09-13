package com.example.neto.fragmentlistlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AlimentosFragment.onItemClick {

    private TextFragment textFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textFragment = (TextFragment)getSupportFragmentManager().findFragmentById(R.id.frag_text);
    }

    @Override
    public void onClick(Alimento alimento){
        textFragment.setText(String.format("O preço %s é %s", alimento.getNome(),alimento.getPreco()));
    }
}
