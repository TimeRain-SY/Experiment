package project1;

public class ChinaPeople extends People {
    public void speakhello() {
        System.out.println("你好");
    }

    @Override
    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均升高:"+height+"厘米");
    }

    @Override
    public void averageWeight() {
        weight = 65;
        System.out.println("中国人平均体重:"+weight+"千克");
    }
    public void chinaCongfu(){
        System.out.println("座如钟,站如松,睡如弓");
    }
}
