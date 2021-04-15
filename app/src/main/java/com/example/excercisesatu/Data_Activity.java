package com.example.excercisesatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.excercisesatu.R;

public class Data_Activity extends AppCompatActivity {
    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdata);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah");
                tvnomor.setText("08131294004");
                break;
            case "Ilham":
                tvnama.setText("Ilham");
                tvnomor.setText("08122312455");
                break;
            case "Eris":
                tvnama.setText("Eris");
                tvnomor.setText("08364222234");
                break;
            case "Fikri":
                tvnama.setText("Fikri");
                tvnomor.setText("08135235212");
                break;
            case "Maul":
                tvnama.setText("Maul");
                tvnomor.setText("08123423536");
                break;
            case "Intan":
                tvnama.setText("Intan");
                tvnomor.setText("08153523531");
                break;
            case "Vina":
                tvnama.setText("Vina");
                tvnomor.setText("08121212451");
                break;
            case "Gita":
                tvnama.setText("Gita");
                tvnomor.setText("08191241242");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi");
                tvnomor.setText("08112412425");
                break;
            case "Vian":
                tvnama.setText("Vian");
                tvnomor.setText("08121455112");
                break;


        }

    }
}