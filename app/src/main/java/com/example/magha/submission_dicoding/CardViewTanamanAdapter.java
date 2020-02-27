package com.example.magha.submission_dicoding;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import static android.support.v4.content.ContextCompat.startActivity;

public class CardViewTanamanAdapter extends RecyclerView.Adapter<CardViewTanamanAdapter.CardViewViewHolder> {
    private ArrayList<Tanaman> listTanaman;

    public CardViewTanamanAdapter(ArrayList<Tanaman> list) {

        this.listTanaman = list;

    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        Tanaman tanaman = listTanaman.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tanaman.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(tanaman.getName());
        holder.tvDetail.setText(tanaman.getDetail());
        holder.tanaman = tanaman;
    }

    @Override
    public int getItemCount() {

        return listTanaman.size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardView cvItem;
        private String KEY_NAME = "nama";
        private String KEY_DETAIL = "detail";
        private String KEY_GAMBAR = "gambar";
        Tanaman tanaman;

        CardViewViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            cvItem = itemView.findViewById(R.id.cv_main);
            cvItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String nama = tvName.getText().toString();
                    String detail = tvDetail.getText().toString();
                    Intent intent = new Intent(v.getContext(),DetailActivity.class);
                    intent.putExtra(KEY_NAME, nama);
                    intent.putExtra(KEY_DETAIL, detail);
                    intent.putExtra(KEY_GAMBAR, tanaman.getPhoto());
                    v.getContext().startActivity(intent);
                    Toast.makeText(itemView.getContext(), "Kamu memilih " + listTanaman.get(getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
