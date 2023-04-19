package project2;

import java.util.Random;

public class test {
    private int[] arr;
    //构造函数
    test(){}
    test(int a){
        arr = random(a);
    }
    //随机生成数组元素
    public int[] random(int a){
        arr = new int[a];
        Random r = new Random();
        for(int i = 0;i<arr.length;i++){
            arr[i]=r.nextInt(1000);
        }
        return arr;
    }
    //打印数组所有元素
    public void print(){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //计算数组中偶数数量
    public int even(){
        int num = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                num++;
            }
        }
        return num;
    }
}
