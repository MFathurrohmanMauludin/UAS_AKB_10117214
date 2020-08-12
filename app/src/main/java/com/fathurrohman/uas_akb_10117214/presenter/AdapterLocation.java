package com.fathurrohman.uas_akb_10117214.presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import com.fathurrohman.uas_akb_10117214.R;
import com.fathurrohman.uas_akb_10117214.model.Wisata;

import java.util.ArrayList;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class AdapterLocation extends RecyclerView.Adapter<AdapterLocation.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    ArrayList<Wisata> model;

    private View.OnClickListener listener;

    public AdapterLocation(Context context, ArrayList<Wisata> model){
        this.inflater = LayoutInflater.from(context);
        this.model = model;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.location, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String nama = model.get(position).getNama();
        int image = model.get(position).getGambar();
        holder.nama.setText(nama);
        holder.gambar.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {
        if (listener!= null){
            listener.onClick(view);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nama;
        ImageView gambar;

        public ViewHolder(View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.title_wisata);
            gambar = itemView.findViewById(R.id.image_wisata);
        }
    }
}
