/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

package com.fathurrohman.uas_akb_10117214.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.fathurrohman.uas_akb_10117214.R;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class ListInfo3Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  =  inflater.inflate(R.layout.fragment_list_info_3, container, false);
        ImageView menu;
        TextView copy, versi;

        menu = view.findViewById(R.id.logo_aplikasi);
        copy = view.findViewById(R.id.copyright);
        versi = view.findViewById(R.id.versi);

        menu.setImageResource(R.drawable.logo_wisata_bandung);
        copy.setText("@CopyRight 2020");
        versi.setText("Versi Aplikasi Saat ini adalah 1.0");
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}
