public class item6 {//20222031124贾普
    public static void main(String[] args){
        int sum = 0;
        int pdt = 1;
        for(int n  = 1;n>0;n++){
            pdt = pdt*n;
            sum = sum+pdt;
            if(sum >= 9999){
                System.out.println("n最大值为"+(n-1));
                break;
            }
        }
        System.out.println(sum);
    }
}
