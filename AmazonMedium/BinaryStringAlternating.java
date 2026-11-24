package AmazonMedium;
public class BinaryStringAlternating {
    public static int MinimumNumberOfSwaps(String s){
        int c1=0, c0=0, miss_1=0, miss_0=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                c0++;
            }else{
                c1++;
            }
        }

        if(Math.abs(c0-c1) > 1){
            return -1;
        }

        for(int i=0; i<s.length(); i+=2){
            if(s.charAt(i) != '0'){
                miss_0++;
            }else{
                miss_1++;
            }
        }

        return c0==c1?Math.min(miss_1, miss_0) : c0>c1?miss_0:miss_1;
    }
    public static void main(String[] args) {
        String s = "0010101111";
        System.out.println(MinimumNumberOfSwaps(s));
    }
}
