package project4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        intergerSet arr = new intergerSet();
        arr.setArr();
        arr.getarr();
        int num = 0;
        boolean boo = true;
        while (boo){
            System.out.println("\n输入1 判断数组S1，S2是否相等\n输入2 输出两个集合的交集和并集\n输入3 插入数组元素\n输入4 删除数组元素\n输入5 返回数组\n输入0 结束程序");
            num = sn.nextInt();
            switch (num){
                //判断数组相等
                case 1:{
                    arr.contrastArr();
                    break;
                }
                //输出交集并集
                case 2:{
                    arr.intersectionArr();
                    System.out.printf("\n");
                    arr.unionArr();
                    break;
                }
                //插入数组元素
                case 3:{
                    arr.getarr();
                    System.out.println("请输入想要修改的数组(1或2，输入0退出修改)");
                    arr.insert(sn.nextInt());
                    break;
                }
                //删除数组元素
                case 4:{
                    arr.getarr();
                    System.out.println("请输入想要修改的数组(1或2，输入0退出修改)");
                    arr.delete(sn.nextInt());
                    break;
                }
                //返回数组
                case 5:{
                    arr.getarr();
                    break;
                }
                //结束程序
                case 0:{
                    boo = false;
                    break;
                }
                default:{
                    System.out.println("请输入有效数字");
                    break;
                }
            }
        }
    }
}
