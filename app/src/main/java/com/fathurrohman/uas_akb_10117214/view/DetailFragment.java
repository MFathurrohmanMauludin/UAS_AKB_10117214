package com.fathurrohman.uas_akb_10117214.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.fathurrohman.uas_akb_10117214.R;
import com.fathurrohman.uas_akb_10117214.model.Wisata;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class DetailFragment extends Fragment implements OnMapReadyCallback {
    TextView nama;
    TextView dekripsi;
    ImageView gambar;
    ImageView back;
    Wisata wisata;
    GoogleMap gMap;
    MapView mapView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detaillocation, container, false);
        nama = view.findViewById(R.id.title_location);
        dekripsi = view.findViewById(R.id.description_location);
        gambar = view.findViewById(R.id.image_location);
        back = view.findViewById(R.id.btn_back);

        // memanggil fragment dari fragment
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assert getFragmentManager() != null;
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragment_container, new HomeFragment(), null).addToBackStack(null).commit();
            }
        });


        //
        Bundle bundle = getArguments();

        if (bundle != null){
            wisata = (Wisata) bundle.getSerializable("bandung");

            assert wisata != null;
            nama.setText(wisata.getNama());
            gambar.setImageResource(wisata.getGambar());
            dekripsi.setText(wisata.getDeskripsi());

        }
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = view.findViewById(R.id.view_location);

        if (mapView != null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());

        gMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(wisata.getKoordinat1(), wisata.getKoordinat2())).title(wisata.getNama()).snippet(wisata.getJalan()));
        CameraPosition Bandung = CameraPosition.builder().target(new LatLng(wisata.getKoordinat1(), wisata.getKoordinat2())).zoom(16).bearing(0).tilt(45).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(Bandung));
    }
}
