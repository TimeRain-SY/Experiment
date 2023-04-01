package item2;


public class Mian {//贾普20222031124
    public static void main(String[] args){
        //创建一个TV实例
        TV TV = new TV();
        //设置电视频道为5
        TV.setChannel(5);
        //创建实例张三
        Family zhangsanFamily = new Family();
        //使用张三调用buyTV方法
        zhangsanFamily.buyTV(TV);
        System.out.println("张三开始看电视节目");
        zhangsanFamily.seeTV();
        TV.setChannel(2);
        int i = TV.getChannel();
        System.out.println("张三将电视跟换到"+TV.getChannel()+"频道");
        zhangsanFamily.remoteContorl(i);
        System.out.println("电视频道是"+TV.getChannel());
        System.out.println("张三再看电视节目");
        zhangsanFamily.seeTV();
        //使用Family创建实例李四
        Family lisiFaminy = new Family();
        //使用李四调用方法buyTV，因16行实例TV调用方法赋值channel为2，
        //张三家TV和李四家TV同时受实例TV赋值影响，所以李四TV的channel同为2
        lisiFaminy.buyTV(TV);
        //调用seeTV。输出应为“经济频道”
        lisiFaminy.seeTV();
    }
}
