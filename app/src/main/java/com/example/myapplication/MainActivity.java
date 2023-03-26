package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    private static final String JSON_URL = "quwerty1.github.io/assets/models.json";// UTF-8
    ListAdapter adapter;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
//        loadJSONFromURL(JSON_URL);
        ArrayList<mebel> mebels = new ArrayList<>();

        mebels.add(new mebel("Тумба Хельмер","99 999 руб","helmer")); //добавление новыйх обьектов что бы всё коректно работало перейдите в класс ListAdapter
        mebels.add(new mebel("мебель два","1xxx","klippan"));// Если вы реальзуете json то это функция вам не понадобиться
        mebels.add(new mebel("мебель два","1xxx","odvar"));
        adapter = new ListAdapter(this, mebels);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Activity_2.name1= position;
//                Activity_2.name2 = id;
                Intent intent = new Intent(MainActivity.this, Activity_2.class);
                startActivity(intent);

            }
        });




    }

    private void loadJSONFromURL(String jsonUrl) {
    }

}