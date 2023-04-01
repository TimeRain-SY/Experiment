package item1;

public class Village {//贾普20222031124
    static int waterAmounl;
    private int peopleNumber;
    private String name;
    public Village(String name){
        this.name = name;
    }
    public static void setWaterAmounl(int w){
        if(w>0)waterAmounl = w;
    }
    public void drinkWater(int w){
        if(waterAmounl - w >= 0) {
            waterAmounl = waterAmounl-w;
            System.out.println(name+"喝了"+w+"声水");
        }else{
            waterAmounl = 0;
        }
    }
    public int lookWaterAmonl(){
        return waterAmounl;
    }
    public void setPeopleNumber(int num){
        peopleNumber = num;
    }
    public int getPeopleNumber(){
        return peopleNumber;
    }
    public String getName(){
        return name;
    }
}
