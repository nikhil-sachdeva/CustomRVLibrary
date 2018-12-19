package com.example.nikhil.rvlibrary;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Holder> {
    View view=null;
    ArrayList<Drawable> images= new ArrayList<>();
    String[] res=null;
    String[] res2=null;
    Context context;
    Holder holder;
    LayoutInflater inflater;
    public RVAdapter(Context context,String[] res){
        images=null;
        this.context=context;
        this.res=res;
        res2=null;
        this.inflater=LayoutInflater.from(context);
    }
    public RVAdapter(Context context, String[] res, ArrayList<Drawable> images){
        this.images=images;
        this.context=context;
        res2=null;
        this.res=res;
        this.inflater=LayoutInflater.from(context);
    }
    public RVAdapter(Context context, String[] res,String[] res2, ArrayList<Drawable> images){
        this.images=images;
        this.context=context;
        this.res=res;
        this.res2=res2;
        this.inflater=LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if(images==null){
            view = inflater.inflate(R.layout.list_layout_1,viewGroup,false);
        }
        else  if(res2==null) {
            view = inflater.inflate(R.layout.list_layout_2, viewGroup, false);
        }
        else if(res2!=null){
            view = inflater.inflate(R.layout.list_layout_3, viewGroup, false);
        }
        holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.main_text.setText(res[i]);
        String letter=res[i].charAt(0)+"";
        if(images!=null) {
            holder.img.setImageDrawable(images.get(i));
        }
        if(res2!=null) {
            holder.sub_text.setText(res2[i]);
        }

        if(images==null){
            ColorGenerator generator = ColorGenerator.MATERIAL;
            TextDrawable drawable = TextDrawable.builder().buildRound(letter, generator.getRandomColor());
            holder.letter.setImageDrawable(drawable);
        }

    }


    @Override
    public int getItemCount() {
        return res.length;
    }
    class Holder extends RecyclerView.ViewHolder{
        TextView main_text,sub_text;
        ImageView img,letter;
        public Holder(@NonNull View itemView) {
            super(itemView);
            main_text=itemView.findViewById(R.id.main_text);
            sub_text=itemView.findViewById(R.id.sub_text);
            img=itemView.findViewById(R.id.img);
            letter=itemView.findViewById(R.id.letter);

        }
    }


}
