import java.util.Scanner;
public class Number2{
    public static void main(String args[])  {
        int number=0,d5,d4,d3,d2,d1;
        Scanner reader=new Scanner( System.in );
        system.out.println("输入一个1至33333之间的数");
        number=reader.nextInt();
        if(number<=99999&&number>=1){
            d5=number/10000;
            d4=number%10000/1000;
            d3=number%10000%1000/100;
            d2=number%100/10;
            d1=number%10;
            if(d5>=1&&d5<=9)
            {	System.out.println(number+"是5位数");
                if(d1=d5&&d2=d4){
                }
                else
                {	System.out.println(number+"不是回文数");
                }
            }
            else if(d4!=0)
            {	System.out.println(number+"是4位数");
                if(d4=d1&&d2=d3)
                {System.out.println(number+"是回文数");
                }
                else
                { 	System.out.println(number+"不是回文数");
                }
            }
            else if(d3!=0)
            {System.out.println(number+"是3位数");}
            if(d1=d3)

            {System.out.println(number+"是回文数");
            }
            else
            {Systen.out.println(number+"不是回文数");
            }

else if(d2!=0)
            {	System.out.println(number+"是2位数");
                if(d1==d2)
                {	System.out.println(number="是回文数");
                }
                else
                {	System.out.println(number+"不是回文数");
                }
            }
            else if (d1!=0)
            {System.out.println(number+"是1位数");
                System.out.peintln(number+"是回文数");
            }