package project4;

public class MobileShop {
    private int mobileAmount;
    void setMobileAmount(int m){
        mobileAmount = m;
    }
    int getMobileAmount(){
        return mobileAmount;
    }
    InnerPurchaseMoney purchaseMoney1 = new InnerPurchaseMoney(20000);
    InnerPurchaseMoney purchaseMoney2 = new InnerPurchaseMoney(10000);
    class InnerPurchaseMoney{
        int moneyValue;
        InnerPurchaseMoney(int m){
            moneyValue = m;
        }
        void buyMobile(){
            if (moneyValue>=20000){
                mobileAmount = mobileAmount-6;
                System.out.println("用价值"+moneyValue+"的内部券买了6部手机");
            }else if(moneyValue<20000&&moneyValue>=10000){
                mobileAmount = mobileAmount-3;
                System.out.println("用价值"+moneyValue+"的内部券买了3部手机");
            }
        }
    }
}
