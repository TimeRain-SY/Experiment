package item1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        A a = new A();
        Scanner sn = new Scanner(System.in);
        System.out.println("请设定date初值");
        a.setDate(sn.nextInt());
        System.out.println("请设定str初值");
        a.setStr(sn.next());
        int num = 0;
        boolean boo = true;
        while (boo) {
            System.out.println("输入1将date和str进行加法运算\n输入2将date和str清空为默认值\n输入3获取String型的date和str\n输入0结束程序");
            num = sn.nextInt();
            switch (num){
                case 1 :{
                    int k;
                    String s;
                    System.out.println("请输入对date增加的值");
                    k = sn.nextInt();
                    System.out.println("请输入对str增加的值");
                    s = sn.next();
                    a.add(k,s);
                    System.out.println("date="+a.getDate()+"\nstr="+a.getStr());
                    break;
                }
                case 2 :{
                    a.clear();
                    System.out.println("date="+a.getDate()+"\nstr="+a.getStr());
                    break;
                }
                case 3 :{
                    System.out.println(a.toString(2));
                    break;
                }
                case 0 :{
                    boo = false;
                    break;
                }
                default:{
                    System.out.println("请输入有效数字");
                }
            }
        }
    }
}
