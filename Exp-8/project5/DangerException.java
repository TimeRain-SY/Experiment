package project5;

public class DangerException extends Exception{
    String massage;
    public DangerException(){
        massage = "危险品";
    }
    public void toShow(){
        System.out.print(massage+" ");
    }
}
