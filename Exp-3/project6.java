public class project6 {//20222031124贾普

    public static void main(String[] args) {
        int sum = 0;
        int pdt = 1;
        int i = 0;
        for (i = 1; i > 0; i++) {
            pdt = pdt * i;
            sum = sum + pdt;
            if (sum >= 9999) {
                System.out.println("n最大值为" + (i - 1));
                break;
            }
        }
        System.out.println("n为" + (i-1) +"时"+ (sum - pdt));
        System.out.println("n为" + i +"时"+ sum);
    }
}
