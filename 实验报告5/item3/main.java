package item3;

public class main {
    public static void main(String[] args){
        test t = new test(66,50);
        System.out.println("加法"+t.add());
        System.out.println("减法"+t.sub());
        System.out.println("乘法"+t.mul());
        System.out.println("除法"+t.div());
        System.out.println("取余"+t.mod());
    }
}

