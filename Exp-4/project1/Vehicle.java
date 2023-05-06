package project1;

public class Vehicle {//贾普20222031124
    private double speed;
    private int power;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {return speed;}

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {return power;}

    public void speedUp(int u) {
        if ((this.speed + u) <= 200) {this.speed += u;}
        else{
            System.out.println("速度不能超过200");
        }
    }

    public void speedDown(int d) {
        if ((this.speed - d) >= 0) {this.speed -= d;}
        else{
            System.out.println("速度不能小于0");
        }
    }

    public void brake() {
        this.speed = 0;
    }
}
