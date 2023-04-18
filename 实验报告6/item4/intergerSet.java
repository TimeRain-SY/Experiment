package item4;

import java.util.Scanner;

public class intergerSet {
    Scanner sn = new Scanner(System.in);
    test S1 = new test(),S2 = new test();
//生成数组
    public void setArr() {
        System.out.println("请输入数组S1的长度,不得小于0且不超过10");
        S1.setAr(sn.nextInt());
        System.out.println("请输入数组S2的长度,不得小于0且不超过10");
        S2.setAr(sn.nextInt());
    }
//例遍数组
    public void getarr(){
        System.out.print("数组S1的元素为:");
        for (int i = 0;i<10;i++){
            System.out.print(S1.arr[i]+" ");
        }
        System.out.printf("\n");
        System.out.print("数组S2的元素为:");
        for (int i = 0;i<10;i++) {
            System.out.print(S2.arr[i]+" ");
        }
        System.out.printf("\n");
    }
//对数组排序
    public void sortArr(){
        int t = 0;
        for (int i = 0;i<10;i++){
            for(int a = (i+1);a<10;a++){
                if(S1.ar[i] > S2.ar[a]){
                    S1.ar[i] = t;
                    S1.ar[i] = S2.ar[a];
                    S2.ar[a] = t;
                }
            }
        }
    }
//判断数组相等
    public void contrastArr(){
        sortArr();
        int num = 0;
        for(int i = 0;i<10;i++){
            if(S1.ar[i] == S2.ar[i]) {
                num++;
            }
        }
        if(num == 10){
            System.out.println("数组相等");
        }else{
            System.out.println("数组不相等");
        }
    }
//输出数组交集并集
    public void intersectionArr(){
        System.out.println("数组交集为");
        for(int z = 0;z<10;z++){
            for(int x = 0;x<10;x++){
                if(S1.arr[z] == S2.arr[x]){
                    System.out.print(S1.arr[z]+" ");
                }
            }
        }
    }
    public void unionArr(){
        sortArr();
        int num = 0;
        System.out.println("数组并集为");
        for(int z = 0;z<10;z++){
            System.out.print(S1.ar[z]+" ");
            num = 0;
            for(int x = 0;x<10;x++){
                if(S1.ar[z] != S2.ar[x]){
                    num++;
                }
                if (num == 10){
                    System.out.println(S2.ar[x]);
                    num = 0;
                }
            }
        }
    }
//插入数组元素
    public void change(int a){
        int z = 0;
        int num = 0;
        switch (a){
            case 1:{
                System.out.println("请输入想要插入的位置(1至10)");
                z = sn.nextInt();
                if(z>=1&&z<=10){
                    System.out.println("请输入想要插入的数字");
                    num = sn.nextInt();
                    if(num>=20&&num<=80){
                        for(int i = 9;i>a;i--){
                            S1.arr[i+1] = S1.arr[i];
                        }
                        S1.arr[z] = num;
                    }else{
                        System.out.println("数字不在20-80之间，请重新输入");
                        change(1);
                    }
                }else{
                    System.out.println("数据不合法，请重新输入位置");
                    change(1);
                }
            }
            case 2:{
                System.out.println("请输入想要插入的位置(1至10)");
                z = sn.nextInt();
                if(z>=1&&z<=10){
                    System.out.println("请输入想要插入的数字");
                    num = sn.nextInt();
                    if(num>=20&&num<=80){
                        for(int i = 9;i>a;i--){
                            S2.arr[i+1] = S2.arr[i];
                        }
                        S2.arr[z] = num;
                    }else{
                        System.out.println("数字不在20-80之间，请重新输入");
                        change(2);
                    }
                }else {
                    System.out.println("数据不合法，请重新输入位置");
                    change(2);
                }
            }
        }
    }
//删除数组元素
    public void delete(int a){

    }
}
