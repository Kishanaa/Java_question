public class middle_num {
    static void middle(int[] num){
        int j= num.length;
        if (j%2==0){
            int i= (j)/2;
            System.out.println(num[i-1]+" "+num[i]);
        }else {
            int i= (j+1)/2;
            System.out.println(num[i-1]);
        }
    }

    public static void main(String[] args) {
        int[] num={1,2,3,4,6,4,2,5};
        middle(num);

    }
}
