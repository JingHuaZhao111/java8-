package com.qst.dms.dos;

import com.qst.dms.entity.LogRec;
import com.qst.dms.entity.Transport;
import com.qst.dms.service.LogRecService;
import com.qst.dms.service.TransportService;

/**
 * created By Kiri on 2022/11/10
 */
public class EntityDataDemo {
    public static void main(String[] args) {
//        创建一个日志业务类
        LogRecService logRecService=new LogRecService();
//        创建一个日志对象数组,用于存放采集的三个日志信息
        LogRec[] logRecs=new LogRec[3];
        for (int i = 0; i < logRecs.length; i++) {
            System.out.println("第"+(i+1)+"个日志数据采集:");
            logRecs[i]=logRecService.inputLog();
        }
//        输出采集的日志信息
        logRecService.showLog(logRecs);
//        创建一个物流业务类
        TransportService transportService=new TransportService();
//        创建一个物流对象数组,用于存放采集的两个物流信息
        Transport[] transports=new Transport[2];
        for (int i = 0; i < transports.length; i++) {
            System.out.println("第"+(i+1)+"个物流数据采集:");
            transports[i]=transportService.inputTransport();
        }
//        输出采集的物流信息
        transportService.showTransport(transports);
    }
}
