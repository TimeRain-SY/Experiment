import java.util.Scanner;

public class item5 {//20222031124贾普
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sn.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sn.nextInt();
        int GCD = 0;
        int LCM = 0;
        //使第number1永远为较大值
        if(number1<number2){
            int tump = 0;
            tump = number2;number2 = number1;number1 = tump;
        }
        //判定可以整除number1的最大值且是否可以整除number2
        for(int i = number1;i>0;i--){
            if(number1%i==0&&number2%i==0){
                GCD = i;
                //最小公倍数为两数乘积除以最大公约数
                LCM = (number1 * number2)/i;
                System.out.println("最大公约数为；"+GCD);
                System.out.println("最小公倍数为；"+LCM);
                break;
            }
        }
    }
}
