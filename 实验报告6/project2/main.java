package project2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        test a = new test();
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入数组长度");
        a.random(sn.nextInt());
        System.out.println("随机数组为");
        a.print();
        System.out.println("\n其中偶数有"+a.even()+"个");
    }
}
