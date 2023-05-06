package project3;

public interface DogState {
    public void showState();
}
class SoftlyState implements DogState{
    @Override
    public void showState() {
        System.out.println("听主任命令");
    }
}
class MeetEnemyState implements DogState{
    @Override
    public void showState() {
        System.out.println("狂叫,并冲上去狠咬敌人");
    }
}
class MeetFriendState implements DogState{
    @Override
    public void showState() {
        System.out.println("摇晃尾巴,表示欢迎");
    }
}
class MeetAnotherDog implements DogState{
    @Override
    public void showState() {
        System.out.println("嬉戏");
    }
}
class Dog{
    DogState state;
    public void show(){
        state.showState();
    }
    public void setState(DogState s){
        state = s;
    }
}

