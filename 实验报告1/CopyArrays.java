import java.util.Arrays;
public class CopyArrays {
    public static void main (String []args){
        int [] a = {1,2,3,4,500,600,700,800};
        int [] b,c,d;
        System.out.println(Arrays.toString(a)); //打印数组a的字符串
        b = Arrays.copyOf(a,a.length);          //将数组a的所有字符串赋值给数组b
        System.out.println(Arrays.toString(b)); //打印数组b的字符串
        c = Arrays.copyOf(a,4);       //将素组a的前四项赋值给数组c，代码1
        System.out.println(Arrays.toString(c)); //打印数组c的字符串，代码2
        d = Arrays.copyOfRange(a,4,8); //将数组a的第四到第八个数组赋值给数组d，代码3
        System.out.println(Arrays.toString(d)); //打印数组d的字符串
        c[c.length-1] = -100;   //将-100赋值给数组c的最后一个元素，代码4
        /*
        int tom [] = Arrays.copyOf(c,6);
        System.out.println(Arrays.toString(tom));
        */
        d[d.length-1] = -200;   //将-200赋值给数组d的最后一个元素
        System.out.println(Arrays.toString(a)); //打印数组a的字符串
        /*
        int [] jerry = Arrays.copyOf(d,1,8);
        System.out.println(Arrays.toString(jerry));
        */
    }
}
