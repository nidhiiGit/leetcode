package AmazonMedium;
import java.util.*;
public class meetingRooms {
    public static void NumOfMeetingRooms(int timeSlots[][]){
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int t[]:timeSlots){
            int start = t[0], end = t[1];
            tm.put(start, tm.getOrDefault(start, 0) + 1);
            tm.put(end, tm.getOrDefault(end, 0)-1);
        }
        int ans=0, c=0;
        for(int k: tm.keySet()){
            c+=tm.get(k);
            ans=Math.max(ans,c);
        }
        System.out.println(tm);
        System.out.println("Total meeting rooms required is "+ans);
    }
    public static void main(String[] args) {
        int timeSlots[][] = {{0,30},{5,10},{15,20}};
        NumOfMeetingRooms(timeSlots);
    }
}
