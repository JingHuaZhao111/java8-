package com.qst.dms.dos;

import java.util.Scanner;

/**
 * created By Kiri on 2022/11/2
 */
public class MenuDriver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
//            输出菜单
            System.out.println(" ********************* ");
            System.out.println("* 1.数据采集  2.数据匹配 *");
            System.out.println("* 3.数据记录  4.数据显示 *");
            System.out.println("* 5.数据发送  0.退出应用 *");
            System.out.println(" ********************* ");
//            提示用户输入要操作的菜单项
            System.out.print("请输入菜单项(0~5): ");
//            接收键盘输入的选项
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("数据采集中...");
                    break;
                case 2:
                    System.out.println("数据匹配中...");
                    break;
                case 3:
                    System.out.println("数据记录中...");
                    break;
                case 4:
                    System.out.println("数据显示中...");
                    break;
                case 5:
                    System.out.println("数据发送中...");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的菜单项(0~5)!");
            }
        }
    }
}
