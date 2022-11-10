package com.qst.dms.dos;

import java.util.Scanner;

/**
 * created By Kiri on 2022/11/2
 */
public class DataInput {
    public static void main(String[] args) {
//        声明一个整数数组
        int[] data=new int[10];
//        建立一个从键盘接收数据的扫描器
        Scanner scanner=new Scanner(System.in);
//        循环采集10个数据
        for (int i = 0; i < data.length; i++) {
            System.out.print("请输入第"+(i+1)+"个采集数据: ");
            data[i]=scanner.nextInt();
        }
//        循环输出采集的数据
        for (int i :
                data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
