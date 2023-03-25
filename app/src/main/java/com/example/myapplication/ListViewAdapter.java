package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.Instant;
import java.util.ArrayList;

//public class ListViewAdapter  extends ArrayAdapter<JSONObject> {
//
//    int listLayout;
//    ArrayList< JSONObject> usersList;
//    Context context;
//
//    public ListViewAdapter(Context context, int listLayout , int field, ArrayList< JSONObject> usersList) {
//        super(context, listLayout, field, usersList);
//        this.context = context;
//        this.listLayout=listLayout;
//        this.usersList = usersList;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View listViewItem = inflater.inflate(listLayout, null, false);
//        TextView name = listViewItem.findViewById(R.id.name);
//        TextView cost = listViewItem.findViewById(R.id.cost);
//        ImageView imageView = listViewItem.findViewById(R.id.imageView);
//
//        try{
//            name.setText(usersList.get(position).getString("name"));
//            cost.setText(usersList.get(position).getString("cost"));
//
////            Picasso.with(context)
////                    .load(url)
////                    .placeholder(R.drawable.user_placeholder)
////                    .error(R.drawable.user_placeholder_error)
////                    .into(imageView); функция для получения фото с интернета
//
//        }catch (JSONException je){
//            je.printStackTrace();
//        }
//        return listViewItem;
//    }
//
//}
