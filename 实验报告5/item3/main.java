package item3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        test t = new test();
        int a,b;
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入第一个数");
        t.setX(sn.nextInt());
        a = t.getX();
        System.out.println("请输入第二个数");
        t.setY(sn.nextInt());
        b = t.getY();
        System.out.println("输入的数字为"+a+","+b);
        System.out.println(a+"+"+b+"="+t.add());
        System.out.println(a+"-"+b+"="+t.sub());
        System.out.println(a+"*"+b+"="+t.mul());
        System.out.println(a+"/"+b+"="+t.div());
        System.out.println(a+"%"+b+"="+t.mod());
    }
}

