package item2;

public class Family {
    private TV tv;
    public void buyTV(TV tv){
        this.tv = tv;
    }
    public void remoteContorl(int m){
        tv.setChannel(m);
    }
    public void seeTV(){
        tv.showProqram();
    }
}
