package com.qst.dms.dos;

import com.qst.dms.entity.LogRec;
import com.qst.dms.service.LogRecService;

/**
 * created By Kiri on 2022/11/2
 */
public class LogRecDemo {
    public static void main(String[] args) {
//        创建一个日志业务类
        LogRecService logRecService=new LogRecService();
//        创建一个日志对象数组,用于存放猜忌的三个日志信息
        LogRec[] logs=new LogRec[3];
        for (int i = 0; i < logs.length; i++) {
            System.out.println("第"+(i)+"个日志数据采集: ");
            logs[i]=logRecService.inputLog();
        }
//        显示日志信息
        logRecService.showLog(logs);
    }
}
