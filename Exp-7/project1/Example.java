package project1;

public class Example {
    public static void main(String[] args){
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericanPeople americanPeople = new AmericanPeople();
        BeijingPeople beijingPeople = new BeijingPeople();
        chinaPeople.speakhello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageHeight();
        chinaPeople.chinaCongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
    }
}
