package com.example.cvpna;

public class VPN {

    String name;
    String ip;
    Boolean isConnected;
    Integer dataSent;
    Integer dataReceived;
    Integer connectionTime;

    public VPN(String name, String ip){
        this.name = name;
        this.ip = ip;
    }

    public void setConnected(){
        isConnected = true;
    }

    public void setDisconnected() {
        isConnected = false;
    }

    // connection time
    // data sent
    // data received
}
