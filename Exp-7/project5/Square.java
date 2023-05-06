package project5;

public class Square implements DiagArea{
    double x = 0;
    Square(){}
    Square(double x){
        this.x = x;
    }

    @Override
    public double getDiagonal() {
        double d = 0;
        d = Math.pow(((x*x)+(x*x)),0.5);
        return d;
    }

    @Override
    public double getArea() {
        double s = 0;
        s = x*x;
        return s;
    }
    public void print(){
        System.out.println("边:"+x);
        System.out.println("对角线长:" + getDiagonal());
        System.out.println("面积为:" + getArea());
    }
}
