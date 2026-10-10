import java.util.*;
public class pascalsTriangleNext {
    public static void main(String[] args) {
        int n=5;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1; i<=n; i++){
            row.add(1);
            for(int j=i-1; j>=1; j--){
                row.set(j, row.get(j) + row.get(j-1));
            }
        }

        System.out.println(row);
    }
}
