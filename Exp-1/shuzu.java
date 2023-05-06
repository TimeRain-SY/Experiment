public class shuzu {    //贾普20222031124
    public static void main (String[] args) {
        int[] a = {100, 200, 300};   //声明数组a
        System.out.println("数组a的长度为" + a.length); //打印数组a的长度
        System.out.println("数组a的引用=" + a);    //打印数组a的引用
        int b[][] = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};    //声明数组b
        System.out.println("二维数组b的一维数组个数为" + b.length);   //打印数组b的长度
        System.out.println(b[4][2]);    //打印数组b中第五个数组中第三位数
        //for(int i = 0; i < b.length; ++i) {
        //    System.out.println("数组b第" + (i + 1) + "数组的个数为 " + b[i].length);
        //    System.out.println("数组b第" + (i + 1) + "数组的引用为 " + String.valueOf(b[i]));
        b[4] = a; //将数组a赋值给b[4]
        //a[3]=200;
        //for(int i = 0; i < b.length; ++i) {
        //    System.out.println("数组b第" + (i + 1) + "数组的个数为 " + b[i].length);
        //    System.out.println("数组b第" + (i + 1) + "数组的引用为 " + String.valueOf(b[i]));
        //}
        System.out.println(b[4][2]);    //打印赋值后的b数组第五数组第三位数
    }
}