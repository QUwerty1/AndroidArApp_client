package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context ctx; ArrayList<mebel> mebels;
    public ListAdapter(Context ctx, ArrayList<mebel> mebels){
        this.ctx =ctx;
        this.mebels = mebels;
    }
    @Override
    public int getCount() { return mebels.size(); }

    @Override
    public Object getItem(int position) {
        return mebels.get(position) ;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        Date begin = new Date();
        mebel m = mebels.get(position);
        convertView = LayoutInflater.from(ctx).inflate(R.layout.activity_blok,parent,false);
        TextView cost1 =convertView.findViewById(R.id.cost);
        TextView name1 =convertView.findViewById(R.id.name);
        ImageView imag1 = convertView.findViewById(R.id.imageView);
        cost1.setText(m.cost);
        name1.setText(m.name);
        switch (m.image){
            case ("helmer"): imag1.setImageResource(R.drawable.helmer);break;
            case ("klippan"): imag1.setImageResource(R.drawable.klippan);break;
            case ("odvar"): imag1.setImageResource(R.drawable.odvar);break;//если будите добовлять новй объект обязательно добавте суда фото этого объекта

        }
        return convertView;





    }
}
