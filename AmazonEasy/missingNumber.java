public class missingNumber {
    public static void main(String[] args) {
        int nums[] = {3,0,1,6,7,2,4,5,9};
        int xor = nums.length;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i] ^ i;
        }
        System.out.println("The missing number from the range is "+ xor);
    }
}
