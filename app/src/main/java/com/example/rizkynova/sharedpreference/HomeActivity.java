package com.example.rizkynova.sharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rizkynova.R;
import com.example.rizkynova.sharedpreferences.utils.Preferences;

/*
Tanggal : 1 Mei 2020 01:48
Jam     : 01:48 WIB
Nama    : Rizky Novayandi
Kelas   : IF4
NIM     : 10117140
Email   : rizkynovayandiofficial@gmail.com

 */


public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
