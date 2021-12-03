package com.example.cvpna;

public class VPN {

    String name;
    String ip;
    Boolean isConnected;
    Integer dataSent;
    Integer dataReceived;
    Integer connectionTime;
    String userName;

    public VPN(String name, String ip){
        this.name = name;
        this.ip = ip;
        this.isConnected = false;
        this.userName = "Default";
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


    public void setName(String name) {
        this.name = name;
    }

    public void setConnected(Boolean connected) {
        isConnected = connected;
    }

    public void setConnectionTime(Integer connectionTime) {
        this.connectionTime = connectionTime;
    }

    public void setDataReceived(Integer dataReceived) {
        this.dataReceived = dataReceived;
    }

    public void setDataSent(Integer dataSent) {
        this.dataSent = dataSent;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getConnected() {
        return isConnected;
    }

    public Integer getConnectionTime() {
        return connectionTime;
    }

    public Integer getDataReceived() {
        return dataReceived;
    }

    public Integer getDataSent() {
        return dataSent;
    }

    public String getIp() {
        return ip;
    }

    public String getName() {
        return name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
