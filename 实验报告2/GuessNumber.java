import java.util.Random;
import java.util.Scanner;

public class GuessNumber {//贾普20222031124
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        System.out.println("给你一个1至100之间的整数,请猜测这个数");
        //随机生成一个1至100见的整数
        int realNumber = random.nextInt(100) + 1;
        int yourGuess = 0;
        System.out.print("您输入的猜测:");
        yourGuess = reader.nextInt();
        while (realNumber != yourGuess) {
            if (yourGuess > realNumber) {
                System.out.print("猜大了,请再次输入");
                yourGuess = reader.nextInt();
            } else if (yourGuess < realNumber) {
                System.out.print("猜小了,请再次输入");
                yourGuess = reader.nextInt();
            }
        }
        System.out.println("猜对了！");
    }
}