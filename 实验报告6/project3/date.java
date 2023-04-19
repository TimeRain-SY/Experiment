package project3;

public class date {
    private long YYYY;
    private int MM;
    private int DD;
    public void setYYYY(long YYYY){
            this.YYYY = YYYY;
    }
    public void setMM(int MM){
        if(MM <= 12){
            this.MM = MM;
        }
    }
    public void setDD(float DD){
        if(DD < 31){
            this.DD = (int)DD;
        }
    }
    public long getYYYY(){
        return YYYY;
    }
    public int getMM(){
        return MM;
    }
    public float getDD(){
        return DD;
    }
    date(){}
    date(long YYYY,int MM,float DD){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = (int)DD;
        System.out.println("构造函数1");
        System.out.println(this.YYYY+"年"+this.MM+"月"+this.DD+"日");
    }
    date(float DD,int MM,long YYYY){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = (int)DD;
        System.out.println("构造函数2");
        System.out.println(this.DD+"日"+this.MM+"月"+this.YYYY+"年");
    }
    date(int MM,float DD,long YYYY){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = (int)DD;
        System.out.println("构造函数3");
        System.out.println(this.MM+"月"+this.DD+"日"+this.YYYY+"年");
    }
    public void test(){
        System.out.println("test");
    }
}