package project5;

public class Chcck {
    public static void main(String[] args){
        Machine machine = new Machine();
        String[] name={"苹果","炸药","西服","硫酸","手表","硫磺"};
        Goods[] goods = new Goods[name.length];
        for(int i=0;i<name.length;i++){
            goods[i] = new Goods();
            if(i%2==0){
                goods[i].setToDanger(false);
                goods[i].setname(name[i]);
            }else{
                goods[i].setToDanger(true);
                goods[i].setname(name[i]);
            }
        }
        for(int i=0;i< goods.length;i++){
            try{machine.checkBag(goods[i]);
                System.out.println(goods[i].getName()+"检查通过");
            }catch(DangerException e){
                e.toShow();
                System.out.println(goods[i].getName()+"被禁止!");
            }
        }
    }
}
