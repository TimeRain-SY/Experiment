package test;

class A {
    int z = 16;
    char x = 65;
    public void myPrint(){
     System.out.println("z="+z);
     System.out.println("x="+x);
    }
}
class B extends A{
    double y = 16.0;
    String s = "java program!";
    public void myPrint(){
        System.out.println("y="+y);
        System.out.println("s="+s);
    }
    public void printAll(){
        super.myPrint();
        myPrint();
    }
}
public class test{
    public static  void main(String[] args){
        B b = new B();
        b.printAll();
    }
}