public class item3 {//20222031124贾普
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum = sum + (i * i);
            } else {
                sum = sum - (i * i);
            }
        }
        System.out.println(sum);
    }
}
