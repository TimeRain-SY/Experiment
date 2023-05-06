public class project4 {//20222031124贾普
    public static void main(String[] args) {
        for (double cock = 1; cock <= 20; cock++) {
            for (double hen = 1; hen <= 33; hen++) {
                for (double chick = 1; chick <= 300; chick++) {
                    if((cock*5)+(hen*3)+(chick/3)==100.0&&cock+hen+chick==100.0){
                        System.out.println("公鸡"+cock+"只,母鸡"+hen+"只,小鸡"+chick+"只");
                    }
                }
            }
        }
    }
}
