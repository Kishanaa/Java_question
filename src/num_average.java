public class num_average {
    static double average(int[] num){
        double sum=0;

        for (int i=0;i< num.length;i++){
            sum+=num[i];
        }
        return sum/ num.length;
    }

    public static void main(String[] args) {
        int[] num={4,5,8,4};
        System.out.println(average(num));
    }
}
