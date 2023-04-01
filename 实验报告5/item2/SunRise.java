package item2;

public class SunRise {
    public static void main(String[] ages){
        SquareEquation equation = new SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficient(-3,4,5);
        equation.getRoots();
    }
}
