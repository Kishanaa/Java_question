public class vowel_count {
    static int vowels(String string){
        int j=string.length();
        String newString=string.toLowerCase();
        int sum=0;
        for (int i=0;i<j;i++){
            char ch=newString.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s="Shrivastava";
        System.out.println(vowels(s));
    }
}
