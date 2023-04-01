package item1;

public class Land {
    public static void main(String[] args){
        Village.setWaterAmounl(200);
        int leftWater = Village.waterAmounl;
        System.out.println("水井中有"+leftWater+"升水");
        Village zhao,ma;
        zhao = new Village("赵庄");
        ma = new Village("马家庄");
        zhao.setPeopleNumber(80);
        ma.setPeopleNumber(120);
        zhao.drinkWater(50);
        //Village.drinkWater(50);
        leftWater = ma.lookWaterAmonl();
        //leftWater = Village.lookWaterAmonl();
                String name  = ma.getName();
        System.out.println(name+"发现水井中有"+leftWater+"升水");
        ma.drinkWater(100);
        leftWater = zhao.lookWaterAmonl();
        name = zhao.getName();
        System.out.println(name+"发现水井中有"+leftWater+"升水");
        int peopleNumber = zhao.getPeopleNumber();
        System.out.println(zhao.getName()+"的人口："+peopleNumber);
        peopleNumber = ma.getPeopleNumber();
        //peopleNumber = Village.getPeopleNumber();
        System.out.println(ma.getName()+"的人口："+peopleNumber);
    }
}
