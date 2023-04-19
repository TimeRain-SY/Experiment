package project3;

public class date {
    private long YYYY;
    private int MM;
    private float DD;
    public void setYYYY(long YYYY){
            this.YYYY = YYYY;
    }
    public void setMM(int MM){
        if(MM <= 12){
            this.MM = MM;
        }
    }
    public void setDD(short DD){
        if(DD < 31){
            this.DD = DD;
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
        this.DD = DD;
        System.out.println(YYYY+"年"+MM+"月"+DD+"日");
    }
    date(float DD,int MM,long YYYY){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = DD;
        System.out.println(DD+"日"+MM+"月"+YYYY+"年");
    }
    date(int MM,float DD,long YYYY){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = DD;
        System.out.println(MM+"月"+DD+"日"+YYYY+"年");
    }
    public void test(){
        System.out.println("test");
    }
}