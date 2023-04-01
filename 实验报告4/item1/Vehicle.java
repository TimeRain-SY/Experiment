package item1;

public class Vehicle {//贾普20222031124
    private double speed;
    private int power;

    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){return speed;}

    public void setPower(int power){
        this.power = power;
    }
    public int getPower(){return power;}

    public void speedUp(int u){
        if(u<=200){this.speed += u;}
    }
    public void speedDown(int d){
        if(d>=0){this.speed += d;}
    }

    public void brake(){
        this.speed = 0;
    }
}
