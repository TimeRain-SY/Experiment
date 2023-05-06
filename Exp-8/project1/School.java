package project1;

public class School implements ComputerAverage{
    @Override
    public double average(double[] x) {
        double aver=0;
        double sum=0;
        int count = x.length;
        for(int i=0;i<count;i++){
            sum = sum+x[i];
        }
        aver = sum/count;
        return aver;
    }
}
