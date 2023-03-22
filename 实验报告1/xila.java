public class xila { //贾普20222031124
    public static void main (String[] args){
        int start,end;  //声明int型变量start，end
        char cstart = 'α',cend = 'ω';   //声明char型变量cstart，cend
        start=(int)cstart;  //将char型变量cstart强制转化为int型并赋值给start
        end = (int)cend;  //将char型变量cend强制转化为int型并赋值给end
        System.out.println("希腊字母\'α\'在unicode表中的顺序位置:"+start);  //打印
        System.out.println("希腊字母表: ");  //打印
        for (int i = start;i <= end;i++){   //循环，声明变量i，将start赋值给i，若i小于等于end则自增
            char c = '\0';
            c = (char)i;  //转换回char型
            System.out.print(" "+c);    //输出
            if ((i - start + 1) % 10 == 0)
                    System.out.println("");
        }
    }
}
