
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

public class ListInfo2Fragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  =  inflater.inflate(R.layout.fragment_list_info_2, container, false);
        ImageView menu;
        TextView deskripsi;

        menu = view.findViewById(R.id.menu_wisata);
        deskripsi = view.findViewById(R.id.deskripsi_menu);

        menu.setImageResource(R.drawable.profile_wisata);
        deskripsi.setText(R.string.menu_profile);
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}
