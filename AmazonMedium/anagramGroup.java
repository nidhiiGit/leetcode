package AmazonMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class anagramGroup {
    public static List<List<String>> GroupAnagrams(String str[]){
        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0; i<str.length; i++){
            char temp[] = str[i].toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);
            if(hm.get(s)!=null){
                List<String> l = hm.get(s);
                l.add(str[i]);
                // hm.put(s, l);
            }else{
                List<String> l = new ArrayList<>();
                l.add(str[i]);
                hm.put(s, l);
            }
        }
        for (Map.Entry<String, List<String>> entry : hm.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        String str[]={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = GroupAnagrams(str);
        System.out.println(ans);
    }
}
