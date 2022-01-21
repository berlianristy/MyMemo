package com.example.mymemo;//package com.example.fragment_mymemo.screen;
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.example.fragment_mymemo.R;
//
//import java.util.ArrayList;
//
//public class checkBoxList  {
//    Button button;
//
//    public static class Kegiatan {
//
//        private static boolean selected;
//        String id = null;
//        String name = null;
//
//        public Kegiatan(String id, String name, boolean selected) {
//            super();
//            this.id = id;
//            this.name = name;
//            this.selected = selected;
//        }
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public static boolean setSelected() {
//            return selected = selected;
//        }
//
//        public void setSelected(boolean selected) {
//            this.selected = selected;
////        }
//
////    }
//
////    MyCustomAdapter dataAdapter = null;
//
////    @Override
////    public void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_tugas_saya);
////        Button myButton = (Button) findViewById(R.id.addBtn);
//////        myButton.setOnClickListener(new OnClickListener() {
//////            @Override
//////            public void onClick(View view) {
//////               Intent tugasSaya = new Intent(tugasSaya.this, Android26Activity.class);
//////               startActivity(tugasSaya);
////
//////                StringBuffer responseText = new StringBuffer();
//////                responseText.append(" ");
//////
//////                ArrayList<Kegiatan> kegiatanList = dataAdapter.kegiatanList;
//////                for (int i = 0; i < kegiatanList.size(); i++){
//////                    Kegiatan kegiatan = kegiatanList.get(i);
//////                    if (Kegiatan.setSelected()){
//////                        responseText.append("\n" + kegiatan.getName());
//////                    }
//////                }
//////            }
//////        });
////        displayListView();
////    }
////
////    public void navigate(View view){
////        Intent intent= new Intent(tugasSaya.this, Android26Activity.class);
////        startActivity(intent);
////    }
////
////    private void displayListView() {
////
////        ArrayList<Kegiatan> kegiatanList = new ArrayList<Kegiatan>();
////        Kegiatan kegiatan = new Kegiatan("1", "Memasak", true);
////        kegiatanList.add(kegiatan);
////        kegiatan = new Kegiatan("2", "Olahraga", false);
////        kegiatanList.add(kegiatan);
////        kegiatan = new Kegiatan("3", "Tidur Siang", false);
////        kegiatanList.add(kegiatan);
////        kegiatan = new Kegiatan("4", "Belanja", false);
////        kegiatanList.add(kegiatan);
////        kegiatan = new Kegiatan("5", "Event", true);
////        kegiatanList.add(kegiatan);
////        kegiatan = new Kegiatan("6", "Diet", false);
////        kegiatanList.add(kegiatan);
////
////
////        dataAdapter = new MyCustomAdapter(this, R.layout.kegiatan_row,
////                kegiatanList);
////        ListView listView = (ListView) findViewById(R.id.listView1);
////        // Assign adapter to ListView
////        listView.setAdapter(dataAdapter);
////
////        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
////            public void onItemClick(AdapterView<?> parent, View view,
////                                    int position, long id) {
////                // When clicked, show a toast with the TextView text
////                Kegiatan bahasa = (Kegiatan) parent.getItemAtPosition(position);
////                Toast.makeText(getApplicationContext(),
////                        "Clicked on Row: " + kegiatan.getName(),
////                        Toast.LENGTH_SHORT).show();
////            }
////        });
////
////    }
////
////    private class MyCustomAdapter extends ArrayAdapter<Kegiatan> {
////
////        private ArrayList<Kegiatan> kegiatanList;
////
////        public MyCustomAdapter(Context context, int textViewResourceId,
////                               ArrayList<Kegiatan> kegiatanList) {
////            super(context, textViewResourceId, kegiatanList);
////            this.kegiatanList = new ArrayList<Kegiatan>();
////            this.kegiatanList.addAll(kegiatanList);
////        }
////
////        private class ViewHolder {
////            TextView id;
////            CheckBox name;
////        }
////
////        @Override
////        public View getView(int position, View convertView, ViewGroup parent) {
////
////            ViewHolder holder = null;
////            Log.v("ConvertView", String.valueOf(position));
////
////            if (convertView == null) {
////                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
////                convertView = vi.inflate(R.layout.kegiatan_row, null);
////
////                holder = new ViewHolder();
////                holder.id = (TextView) convertView.findViewById(R.id.code);
////                holder.name = (CheckBox) convertView
////                        .findViewById(R.id.checkBox1);
////                convertView.setTag(holder);
////
////                holder.name.setOnClickListener(new View.OnClickListener() {
////                    public void onClick(View v) {
////                        CheckBox cb = (CheckBox) v;
////                        Kegiatan kegiatan = (Kegiatan) cb.getTag();
////                        Toast.makeText(
////                                getApplicationContext(),
////                                "Clicked on Checkbox: " + cb.getText() + " is "
////                                        + cb.isChecked(), Toast.LENGTH_SHORT)
////                                .show();
////                        kegiatan.setSelected(cb.isChecked());
////                    }
////                });
////            } else {
////                holder = (ViewHolder) convertView.getTag();
////            }
////
////            Kegiatan kegiatan = kegiatanList.get(position);
////            holder.id.setText(" (id:" + kegiatan.getId() + ")");
////            holder.name.setText(kegiatan.getName());
////            holder.name.setChecked(kegiatan.setSelected());
////            holder.name.setTag(kegiatan);
////
////            return convertView;
////        }
////
////    }
////}
//
//
