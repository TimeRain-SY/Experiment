package item1;

public class User {//贾普20222031124
    public static void main(String[] args){
        Vehicle car1,car2;
        car1 = new Vehicle();
        car2 = new Vehicle();
        car1.setPower(128);
        car2.setPower(76);
        System.out.println("车1功率为；"+car1.getPower());
        System.out.println("车2功率为；"+car2.getPower());
        car1.speedUp(80);
        car2.speedUp(80);
        System.out.println("车1目前速度为；"+car1.getSpeed());
        System.out.println("车2目前速度为；"+car2.getSpeed());
        car2.speedUp(200);
        System.out.println("车2目前速度为；"+car2.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        System.out.println("车1目前速度为；"+car1.getSpeed());
        System.out.println("车2目前速度为；"+car2.getSpeed());
        car2.speedDown(200);
        System.out.println("车2目前速度为；"+car2.getSpeed());

        car1.brake();
        System.out.println("车1刹车了，目前速度为；"+car1.getSpeed());
    }
}
