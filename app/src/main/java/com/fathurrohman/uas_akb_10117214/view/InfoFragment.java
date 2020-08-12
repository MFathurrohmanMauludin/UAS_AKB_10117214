package com.fathurrohman.uas_akb_10117214.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.fathurrohman.uas_akb_10117214.R;
import com.fathurrohman.uas_akb_10117214.presenter.AdapterViewPager;
import com.google.android.material.tabs.TabLayout;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class InfoFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_info, container, false);
        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager = view.findViewById(R.id.view_pager);

        AdapterViewPager adapterViewPager = new AdapterViewPager(getFragmentManager());
        adapterViewPager.addFragment(new ListInfo1Fragment(), "Lokasi Wisata");
        adapterViewPager.addFragment(new ListInfo2Fragment(), "Profile Wisata");
        adapterViewPager.addFragment(new ListInfo3Fragment(), "Tentang Aplikasi");

        viewPager.setAdapter(adapterViewPager);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}
