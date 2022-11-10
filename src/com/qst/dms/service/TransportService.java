package com.qst.dms.service;

import com.qst.dms.entity.Transport;

import java.util.Date;
import java.util.Scanner;

/**
 * created By Kiri on 2022/11/9
 */
public class TransportService {
//    物流数据采集
    public Transport inputTransport(){
//        建立一个从键盘接收数据的扫描器
        Scanner scanner=new Scanner(System.in);
//        提示用户输入ID标识
        System.out.println("请输入ID标识:");
//        接收键盘输入的整数
        int id=scanner.nextInt();
//        获取当前系统的时间
        Date nowDate=new Date();
//        提示用户输入地址
        System.out.println("请输入地址:");
//        接受键盘输入的字符串信息
        String address = scanner. next();
//数据状态是"采集"
        int type = Transport. GATHER;
//提示用户输人登录用户名
        System.out.println("请输人货物经手人: ");
//接收键盘输人的字符串信息
        String handler = scanner . next( );
//提示用户输人主机IP
        System. out. println("请输人收货人:");
//接收键盘输人的字符串信息
        String reciver = scanner. next();
//提示用于输人物流状态
        System.out.println("请输人物流状态: 1发货中，2送货中,3已签收");
//接收物流状态
        int transportType = scanner. nextInt( );
//创建物流信息对象
        Transport trans = new Transport( id, nowDate, address, type, handler,
                reciver, transportType);
//返回物流对象
        return trans;
    }
//    物流信息输出
    public void showTransport(Transport... transports){
        for (Transport e :
                transports) {
            if (e != null) {
                System.out.println(e.toString());
            }
            }
    }
}
