package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SiswaAdapter extends ArrayAdapter<Siswa> {

    public SiswaAdapter(Context context, ArrayList<Siswa> siswa) {
        super(context, 0, siswa);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Siswa siswa = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_list, parent, false);
        }
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);
        TextView lblNama = (TextView) convertView.findViewById(R.id.lblNama);
        TextView lblKelas = (TextView) convertView.findViewById(R.id.lblKelas);

        imgFoto.setImageResource(siswa.fotoID);
        lblNama.setText(siswa.nama);
        lblKelas.setText(siswa.kelas);

        return convertView;
    }
}
