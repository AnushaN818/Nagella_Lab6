package me.pgb.a2021_04_26_room.Fragments;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import me.pgb.a2021_04_26_room.R;

public class FindStockActivity extends AppCompatActivity {
    private TextView stockName;
    private TextView stockPrice;
    private Button Menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_stock);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        stockName = findViewById(R.id.stockFound);
        stockPrice = findViewById(R.id.foundStockPrice);
        Menu = findViewById(R.id.foundMenu);

        String stockNameAct = getIntent().getStringExtra("stock");
        Double stockPriceAct = getIntent().getDoubleExtra("price",0.0);
        stockName.setText(stockNameAct);
        stockPrice.setText(stockPriceAct.toString());
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FindStockActivity.this, MainActivity.class);
                startActivity(intent);
                FindStockActivity.this.finish();
            }
        });





    }
}