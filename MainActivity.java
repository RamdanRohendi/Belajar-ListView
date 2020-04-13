package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Siswa> arraySiswa = new ArrayList<>();
        SiswaAdapter adapter = new SiswaAdapter(this, arraySiswa);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Siswa siswa;

        for (int a=0; a < 500; a++){
            siswa = new Siswa(R.drawable.pesawat, "Ramand", "XI RPL 3");
            adapter.add(siswa);

            siswa = new Siswa(R.drawable.ramdan, "Ramdan Rohendi", "XI RPL 3");
            adapter.add(siswa);
        }

    }
}
