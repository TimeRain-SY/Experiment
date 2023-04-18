package item4;

import java.util.Scanner;

public class intergerSet {
    Scanner sn = new Scanner(System.in);
    test S1 = new test(),S2 = new test();
    //生成数组
    public void setArr() {
        System.out.println("请输入数组10个20-80之间的整数为数组S1");
        S1.setAr();
        System.out.println("请输入数组10个20-80之间的整数为数组S2");
        S2.setAr();
    }
    //例遍数组
    public void getarr(){
        System.out.print("数组S1的元素为:");
        for (int i = 0;i<10;i++){
            System.out.print(S1.arr[i]+" ");
        }
        System.out.print("数组S2的元素为:");
        for (int i = 0;i<10;i++) {
            System.out.print(S2.arr[i]+" ");
        }
    }
    //对数组排序
    public void sortArr(){
        int t = 0;
        for (int i = 0;i<10;i++){
            for(int a = (i+1);a<10;a++){
                if(S1.arr[i] > S2.arr[a]){
                    S1.arr[i] = t;
                    S1.arr[i] = S2.arr[a];
                    S2.arr[a] = t;
                }
            }
        }
    }
    //判断数组相等
    public void contrastArr(){
        sortArr();
        int num = 0;
        for(int i = 0;i<10;i++){
            if(S1.arr[i] == S2.arr[i]) {
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
        sortArr();
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
        for(int z = 0;z<10;z++){
            System.out.print(S1.arr[z]+" ");
            for(int x = 0;x<10;x++){
                if(S1.arr[z] == S2.arr[x]){
                }
            }
        }
    }
    //修改数组元素
    //删除数组元素

}
