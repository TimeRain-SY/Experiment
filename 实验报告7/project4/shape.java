package project4;

abstract class Shape {
    public abstract void showArea();
}
class Rectangle extends Shape{
    double l = 0;
    double w = 0;

    public void showArea(){
        System.out.println("矩形面积为:"+l*w);
    }
}
class Square extends Shape{
    double l = 0;
    public void showArea(){
        System.out.println("正方形面积为:"+l*l);
    }
}
class Circle extends Shape{
    double r =0;
    public void showArea(){
        System.out.println("圆面积为:"+3.14*r*r);
    }
}

