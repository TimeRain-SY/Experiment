package project2;

public class BankOfDalian extends Bank{
    double year;
    public double computerinterest(){
        super.year = (int)year;
        double r = year-(int)year;
        int day = (int)(r*1000);
        double yearInterest = super.computerinterest();
        double dayInterest = day*0.00012*savedMoney;
        interest = yearInterest+dayInterest;
        System.out.printf("%d元在大连银行%d年零%d天的利息:%f元\n",savedMoney,super.year,day,interest);
        return interest;
    }
}
