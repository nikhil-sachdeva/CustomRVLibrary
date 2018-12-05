package com.example.customrecyclerviewlibrary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Holder>{
    ArrayList<Drawable> images;
    String[] res=null;
    Context context;
    LayoutInflater inflater;
    public RVAdapter(Context context,String[] res){
        this.context=context;
        this.res=res;
        this.inflater=LayoutInflater.from(context);
    }
    public RVAdapter(Context context, String[] res, ArrayList<Drawable> images){
        this.images=images;
        this.context=context;
        this.res=res;
        this.inflater=LayoutInflater.from(context);
    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=inflater.inflate(R.layout.list_layout,viewGroup,false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.main_text.setText(res[i]);
        if(images!=null) {
            holder.img.setImageDrawable(images.get(i));
        }
    }


    @Override
    public int getItemCount() {
        return res.length;
    }
    class Holder extends RecyclerView.ViewHolder{
        TextView main_text;
        ImageView img;
        public Holder(@NonNull View itemView) {
            super(itemView);
            main_text=itemView.findViewById(R.id.main_text);
            img=itemView.findViewById(R.id.img);

        }
    }
}
