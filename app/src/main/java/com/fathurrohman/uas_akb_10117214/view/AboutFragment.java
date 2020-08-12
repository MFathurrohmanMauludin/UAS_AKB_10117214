package com.fathurrohman.uas_akb_10117214.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.fathurrohman.uas_akb_10117214.R;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class AboutFragment extends Fragment {
    TextView nim, nama, kelas;
    ImageView foto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        nama = view.findViewById(R.id.tv_nama);
        nim = view.findViewById(R.id.tv_nim);
        kelas = view.findViewById(R.id.tv_kelas);
        foto = view.findViewById(R.id.foto);

        nim.setText("NIM : 10117214");
        nama.setText("Nama : M Fathurrohman Mauludin");
        kelas.setText("Kelas : IF-7");
        foto.setImageResource(R.drawable.me);

        return view;
    }
}
