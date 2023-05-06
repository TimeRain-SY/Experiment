package project1;

public class BeijingPeople extends ChinaPeople{
    @Override
    public void averageHeight() {
        height = 172.5;
        System.out.println("北京人的平均升高:"+height+"厘米");
    }

    @Override
    public void averageWeight() {
        weight = 70;
        System.out.println("北京人的平均体重:"+height+"千克");
    }
    public void beijingOpera(){
        System.out.println("花脸,青衣,花旦和老生");
    }
}
