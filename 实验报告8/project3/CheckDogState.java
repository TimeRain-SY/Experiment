package project3;

public class CheckDogState {
    public static void main(String[] agrs){
        Dog yellowDog = new Dog();
        System.out.printf("狗在主人面前:");
        yellowDog.setState(new SoftlyState());
        yellowDog.show();
        System.out.printf("狗遇到敌人:");
        yellowDog.setState(new MeetEnemyState());
        yellowDog.show();
        System.out.printf("狗遇到朋友:");
        yellowDog.setState(new MeetFriendState());
        yellowDog.show();
        System.out.printf("狗遇到同伴:");
        yellowDog.setState(new MeetAnotherDog());
        yellowDog.show();
    }
}
