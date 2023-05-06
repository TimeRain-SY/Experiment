package project4;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        rectangle.l = 3.4;
        rectangle.w = 1.2;
        rectangle.showArea();
        square.l = 2.3;
        square.showArea();
        circle.r = 4.5;
        circle.showArea();
    }
}
