package project3;

public class test {
    private int x,y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public test(){};
    public test(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int add(){
        return x+y;
    }
    public int sub(){
        return x-y;
    }
    public int mul(){
        return x*y;
    }
    public int div(){
        return x/y;
    }
    public int mod(){
        return x%y;
    }
}
