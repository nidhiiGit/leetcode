package AmazonMedium;

public class sumOfSubarray {
    public static int sumOfSubarrayRanges(int nums[]){
        int ans=0;
        
        for(int i=0; i<nums.length; i++){
            int minV=nums[i];
            int maxV=nums[i];
            for(int j=i; j<nums.length; j++){
                minV=Math.min(nums[j],minV);
                maxV=Math.max(nums[j],maxV);
                ans+=(maxV-minV);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};

        System.out.println(sumOfSubarrayRanges(nums));
    }
}
