package project5;

import java.util.Scanner;

public class Rectangle implements DiagArea{
    double l = 0;
    double w = 0;
    Rectangle(){}
    Rectangle(double w,double l){
        this.w = w;
        this.l = l;
    }
    @Override
    public double getDiagonal() {
        double d;
        d = Math.pow((w*w)+(l*l),0.5);
        return d;
    }

    @Override
    public double getArea() {
        double s=0;
        s = w*l;
        return s;
    }
    public void print(){
        System.out.println("长:"+l+" 宽:"+w);
        System.out.println("对角线长:" + getDiagonal());
        System.out.println("面积为:" + getArea());
    }
}
