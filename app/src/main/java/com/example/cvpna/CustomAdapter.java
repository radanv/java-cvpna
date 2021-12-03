package com.example.cvpna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vpn_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        VPN currentVPN = list[position];

        // text bindings
        holder.getNameTextView().setText(currentVPN.getName());
        holder.getAddressTextView().setText(currentVPN.getIp());
        holder.getUserNameTextView().setText(currentVPN.getUserName());

    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView;
        TextView addressTextView;
        TextView userNameTextView;
        Button connectButton;
        Button settingsButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            connectButton = itemView.findViewById(R.id.connectButton);
            addressTextView = itemView.findViewById(R.id.IPTextView);
            nameTextView = itemView.findViewById(R.id.VPNTextView);
            settingsButton = itemView.findViewById(R.id.settingsButton);
            userNameTextView = itemView.findViewById(R.id.userNameTextView);



            //connection click
            connectButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });


            //settings click
            settingsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }

        public void setAddressTextView(TextView addressTextView) {
            this.addressTextView = addressTextView;
        }

        public void setConnectButton(Button connectButton) {
            this.connectButton = connectButton;
        }

        public void setNameTextView(TextView nameTextView) {
            this.nameTextView = nameTextView;
        }

        public void setSettingsButton(Button settingsButton) {
            this.settingsButton = settingsButton;
        }

        public Button getConnectButton() {
            return connectButton;
        }

        public Button getSettingsButton() {
            return settingsButton;
        }

        public TextView getAddressTextView() {
            return addressTextView;
        }

        public TextView getNameTextView() {
            return nameTextView;
        }

        public void setUserNameTextView(TextView userNameTextView) {
            this.userNameTextView = userNameTextView;
        }

        public TextView getUserNameTextView() {
            return userNameTextView;
        }
    }
}
