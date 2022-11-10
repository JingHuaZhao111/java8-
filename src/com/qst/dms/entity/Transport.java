package com.qst.dms.entity;

import java.util.Date;

/**
 * created By Kiri on 2022/11/9
 */
public class Transport extends DataBase{
    /*
    * 经手人
    * */
    private String handler;
    /*
    * 收货人
    * */
    private String reciver;
    /*
    * 物流状态
    * */
    private  int transportType;
    /*
    * 物流状态常量:发货中,送货中,已签收
    * */
    public static final int SENDING=1;
    public static final int TRANSPORTING=2;
    public static final int RECIEVED=3;


    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public int getTransportType() {
        return transportType;
    }

    public void setTransportType(int transportType) {
        this.transportType = transportType;
    }

    public Transport() {
    }

    public Transport(int id, Date time, String address, int type, String handler, String reciver, int transportTypr) {
        super(id, time, address, type);
        this.handler = handler;
        this.reciver = reciver;
        this.transportType = transportTypr;
    }

    @Override
    public String toString() {
        return this.getId()+","+this.getTime()+","+this.getAddress()+","+this.getType()+","+ transportType;
    }
}
