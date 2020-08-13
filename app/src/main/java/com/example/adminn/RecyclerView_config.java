package com.example.adminn;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerView_config {
    private Context mContext;
    private DataAdapter mDataAdapter;
    public void setConfig(RecyclerView recyclerView, Context context, List<Data> data, List<String> keys){
        mContext = context;
        mDataAdapter = new DataAdapter(data, keys);
        RecyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView.setAdapter(mDataAdapter);
    }

    class Datadaftar extends RecyclerView.ViewHolder{
        private TextView alamat;
        private TextView emaill;
        private TextView nama;
        private TextView telpon;

        private String key;

        public Datadaftar (ViewGroup parent){
            super(LayoutInflater.from(mContext).inflate(R.layout.data_pendaftar_list, parent, false));

            nama = (TextView) itemView.findViewById(R.id.textView);
            emaill = (TextView) itemView.findViewById(R.id.emaill);
            alamat = (TextView) itemView.findViewById(R.id.alamat);
            telpon = (TextView) itemView.findViewById(R.id.nama);
        }
        public void bind(Data data, String key){
            nama.setText(data.getNama());
            emaill.setText(data.getEmaill());
            alamat.setText(data.getAlamat());
            telpon.setText(data.getTelpon());
            this.key = key;
        }
     }
    class DataAdapter extends RecyclerView.Adapter<Datadaftar>{
        private List<Data> mdata_pendaftar;
        private List<String>mKeys;

        public DataAdapter(List<Data> mdata_pendaftar, List<String> mKeys) {
            this.mdata_pendaftar = mdata_pendaftar;
            this.mKeys = mKeys;
        }

        @NonNull
        @Override
        public Datadaftar onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new Datadaftar(parent);
        }

        @Override
        public void onBindViewHolder(@NonNull Datadaftar holder, int position) {
        holder.bind(mdata_pendaftar.get(position),mKeys.get(position));
        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
