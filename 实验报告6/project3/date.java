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
    }
    date(float DD,int MM,long YYYY){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = DD;
    }
    date(int MM,float DD,long YYYY){
        this.YYYY = YYYY;
        this.MM = MM;
        this.DD = DD;
    }
    public void test(){
        System.out.println("test");
    }
}