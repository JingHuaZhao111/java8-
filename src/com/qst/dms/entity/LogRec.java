package com.qst.dms.entity;

import java.util.Date;

/**
 * created By Kiri on 2022/11/2
 */
//用户登陆日志记录
public class LogRec extends DataBase{
    /*
    * 登录用户名
    * */
    private String user;
    /*
    * 登录用户主机IP地址
    * */
    private String ip;
    /*
    * 登陆状态:登陆,登出
    * */
    private int logType;
    /*
    * 登陆常量LOG_IN,登出常量LOG_OUT
    * */
    public static final int LOG_IN=1;
    public static final int LOG_OUT=0;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getLogType() {
        return logType;
    }

    public void setLogType(int logType) {
        this.logType = logType;
    }


    public LogRec() {
    }


    public LogRec(int id, Date time, String address, int type, String user, String ip, int logType) {
        super(id, time, address, type);
        this.user = user;
        this.ip = ip;
        this.logType = logType;
    }

    @Override
    public String toString() {
        return this.getId()+","+this.getTime()+","+this.getAddress()+","+this.getType()+","+user+","+ip+","+logType;
    }
}
