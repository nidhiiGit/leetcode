package AmazonMedium;
public class carPooling {
    public static boolean AllPassengers(int trips[][], int capacity){
        int nums[] = new int[1001];
        for(int trip[]: trips){
            nums[trip[1]]+=nums[0];
            nums[trip[2]]-=nums[0];
        }

        for(int i=0; capacity >=0 && i<nums.length; i++){
            capacity -= nums[i];
            if(capacity<=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int trips[][] = {{2,1,5},{3,3,7}};
        System.out.println("All passengers can be picked up and dropped: " + AllPassengers(trips,5));
    }
}
