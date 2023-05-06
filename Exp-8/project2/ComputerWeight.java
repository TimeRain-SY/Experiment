package project2;

public interface ComputerWeight {
    public double computerWeight();
}
class Telecision implements ComputerWeight{
    public double computerWeight(){
        double wight = 100;
        return wight;
    }
}
class Computer implements ComputerWeight{
    public double computerWeight(){
        double wight = 50;
        return wight;
    }
}
class WashMachino implements ComputerWeight{
    public double computerWeight(){
        double wight = 200;
        return wight;
    }
}
//class Refrigerator implements ComputerWeight{
//    public double computerWeight(){
//        double wight = 300;
//        return wight;
//    }
//}
class Truck{
    ComputerWeight[] goods;
    double totalWeight=0;
    Truck(ComputerWeight[] goods){
        this.goods = goods;
    }
    public void setGoods(ComputerWeight[] goods){
        this.goods = goods;
    }
    public double getTotalWeight(){
        totalWeight = 0;
        for(int i=0;i<goods.length;i++){
            totalWeight = totalWeight+goods[i].computerWeight();
        }
        return totalWeight;
    }
}