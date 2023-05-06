import java.util.Scanner;

public record Number() {//贾普20222031124

    public static void main(String args[]) {
        int number = 0, d5, d4, d3, d2, d1;
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个1至99999之间的数");
        number = reader.nextInt();
        if (number <= 99999 && 1 <= number) {
            //获取number的各个位数的数字
            d5 = number / 10000;
            d4 = (number % 10000) / 1000;
            d3 = (number % 1000) / 100;
            d2 = (number % 100) / 10;
            d1 = number % 10;
            //判断是否为5位数
            if (d5 != 0) {
                System.out.println(number + "是五位数");
                //判断是否为为回文数
                if (d5 == d1 && d4 == d2) {
                    System.out.println("是回文数");
                } else {
                    System.out.println("不是回文数");
                }
                //非5位数则判断是否为4位数
            } else if (d4 != 0) {
                System.out.println(number + "是四位数");
                //判断是否为回文数
                if (d4 == d1 && d3 == d2) {
                    System.out.println("是回文数");
                } else {
                    System.out.println("不是回文数");
                }
                //判断以上为假的情况下，是否为3位数
            } else if (d3 != 0) {
                System.out.println(number + "是三位数");
                //判断是否为回文数
                if (d3 == d1) {
                    System.out.println("是回文数");
                } else {
                    System.out.println("不是回文数");
                }
                //判断是否为2位数
            } else if (d2 != 0) {
                System.out.println(number + "是二位数");
                //判断是否位回文数
                if (d2 == d1) {
                    System.out.println("是回文数");
                } else {
                    System.out.println("不是回文数");
                }
            } else if (d1 != 0) {
                System.out.println(number + "是一位数");
                System.out.println("是回文数");
            }
        } else {
            System.out.printf("\n%d不在1至99999之间", number);
        }
    }
}
