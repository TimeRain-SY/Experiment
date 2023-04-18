package item4;

import java.util.Scanner;

public class test {
    Scanner sn = new Scanner(System.in);
    public int[] arr = new int[10];
    public void setAr(){
        int a = 0;
        for (int i = 0;i<10;i++){
            System.out.println("请输入第"+(i+1)+"个数字");
            a = sn.nextInt();
            if(a>=20&&a<=80){
                arr[(i)] = a;
            }else{
                System.out.println("数字不合法，请重新输入");
                i--;
            }
        }
    }
}
