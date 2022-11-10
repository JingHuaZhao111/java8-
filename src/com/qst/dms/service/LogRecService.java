package com.qst.dms.service;

import com.qst.dms.entity.LogRec;

import java.util.Date;
import java.util.Scanner;

/**
 * created By Kiri on 2022/11/2
 */
//日志业务类
public class LogRecService {
//    日志数据采集
    public LogRec inputLog(){
//        建立一个从键盘接收数据的扫描器
        Scanner scanner=new Scanner(System.in);
//        提示用户输入ID标识
        System.out.println("请输入ID标识: ");
//        接受键盘整数
        int id=scanner.nextInt();
//        获取当前系统时间
        Date nowDate=new Date();
//        提示用户输入地址
        System.out.print("请输入地址: ");
//        接受键盘输入的字符串信息
        String address=scanner.next();
//        数据状态是采集
        int type=LogRec.GATHER;

//        提示用户输入登录用户名
        System.out.println("请输入 登录用户名: ");
//        接受键盘输入的字符串信息
        String user=scanner.next();
//        提示用户输入主机IP
        System.out.println("请输入 主机IP: ");
//        接受键盘输入的字符串信息
        String ip=scanner.next();
//        提示用户输入登陆状态登出状态
        System.out.println("请输入登录状态:1是登录,0是登出");
        int logType=scanner.nextInt();
//        创建日志对象
        LogRec log=new LogRec(id,nowDate,address,type,user,ip,logType);
//        返回日志对象
        return log;
    }
//    日志信息输出
    public void showLog(LogRec... logRecs){
        for (LogRec e :
                logRecs) {
            if (e != null) {
                System.out.println(e.toString());
            }
            }
    }
}
