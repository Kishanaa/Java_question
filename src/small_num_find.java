
public class small_num_find {
    static int small(int[] num){

        int smallest=num[1];

        for (int i=0;i< num.length;i++){
            if (smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {

        int[] num={2,5,3,7,9};
        System.out.println(small(num));
    }
}
