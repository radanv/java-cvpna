package com.example.cvpna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    VPN[] list;
    Context ctx;

    public  CustomAdapter(Context context, VPN[] vpnList){
        this.list = vpnList;
        this.ctx = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView address;
        Button connect;
        Button settings;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //connection click
            connect.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });


            //settings click
            settings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        public void setAddress(TextView address) {
            this.address = address;
        }

        public void setConnect(Button connect) {
            this.connect = connect;
        }

        public void setName(TextView name) {
            this.name = name;
        }

        public void setSettings(Button settings) {
            this.settings = settings;
        }

        public Button getConnect() {
            return connect;
        }

        public Button getSettings() {
            return settings;
        }

        public TextView getAddress() {
            return address;
        }


    }
}
