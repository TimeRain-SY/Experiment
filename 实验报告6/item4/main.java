package item4;

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
            System.out.println("输入1 判断数组S1，S2是否相等\n输入2 输出两个集合的交集和并集\n输入3 改变数组元素\n输入4 初始化数组某个元素\n输入0 结束程序");
            num = sn.nextInt();
            switch (num){
                case 1:{
                    arr.sortArr();
                }
                case 2:{

                }
                case 3:{

                }
                case 4:{

                }
                case 0:{

                }
                default:{
                    System.out.println("请输入有效数字");
                    break;
                }
            }
        }
    }
}
