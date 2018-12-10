package com.example.lindawang.poker;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    poker poker = new poker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        poker.shuffle();
        RecyclerView recyclerView = findViewById( R.id.recycler );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.setAdapter( new PokerAdapter() );
    }


    class  PokerAdapter extends RecyclerView.Adapter<PokerAdapter.PokerHolder>{


        @NonNull
        @Override
        public PokerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return new PokerHolder( getLayoutInflater().inflate() );
        }

        @Override
        public void onBindViewHolder(@NonNull PokerHolder pokerHolder, int i) {
            pokerHolder.pokerText.setText(poker.cards.length);

        }

        @Override
        public int getItemCount() {
            return poker.cards.length;
        }

        class
        PokerHolder extends RecyclerView.ViewHolder{
            TextView pokerText;


            public PokerHolder(@NonNull View itemView) {
                super( itemView );
                pokerText = itemView.findViewById( R.id.tv_poker )
            }
        }

    }
}
