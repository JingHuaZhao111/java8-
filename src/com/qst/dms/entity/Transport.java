package com.qst.dms.entity;

import java.util.Date;

/**
 * created By Kiri on 2022/11/9
 */
public class Transport {
//    ID标识
    private int id;
//    时间
    private Date time;
//    地点
    private String address;
//    状态
    private int type;
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
    private  int transportTypr;
    /*
    * 物流状态常量:发货中,送货中,已签收
    * */
    public static final int SENDING=1;
    public static final int TRANSPORTING=2;
    public static final int RECIEVED=3;

//    状态常量
    public static final int GATHER=1;//采集
    public static final int MATCH=2;//匹配
    public static final int RECORD=3;//记录
    public static final int SEND=4;//发送
    public static final int RECEIVE=5;//接收
    public static final int WRITE=6;//归档
    public static final int SAVE=7;//保存

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

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

    public int getTransportTypr() {
        return transportTypr;
    }

    public void setTransportTypr(int transportTypr) {
        this.transportTypr = transportTypr;
    }

    public Transport() {
    }

    public Transport(int id, Date time, String address, int type, String handler, String reciver, int transportTypr) {
        this.id = id;
        this.time = time;
        this.address = address;
        this.type = type;
        this.handler = handler;
        this.reciver = reciver;
        this.transportTypr = transportTypr;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", time=" + time +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", handler='" + handler + '\'' +
                ", transportTypr=" + transportTypr ;
    }
}
