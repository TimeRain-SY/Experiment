package item4;

import java.util.Scanner;

public class test {
    Scanner sn = new Scanner(System.in);
    public int[] arr = new int[10];
    public int[] ar = new int[10];
    public void setAr(int z){
        int i = 0;
        int a = 0;
        int num = 0;
        if(z>=1&&z<=10){
            for (int c = 0;c<z;c++){
                System.out.println("请输入第"+(c+1)+"个数字");
                a = sn.nextInt();
                if(a>=20&&a<=80){
                    for(int b = 0;b<z;b++){
                        if(a == arr[b]){
                            System.out.println("数据重复，请重新输入");
                            c--;
                            num = 0;
                            break;
                        }else{
                            num++;
                        }
                        if(num == z){
                            arr[c] = a;
                            ar[c] = a;
                            num = 0;
                        }
                    }
                }else{
                    System.out.println("数字不合法，请重新输入");
                    c--;
                }
            }
        }else{
            System.out.println("数据不合法,请重新输入");
            setAr(sn.nextInt());
        }
    }
}
