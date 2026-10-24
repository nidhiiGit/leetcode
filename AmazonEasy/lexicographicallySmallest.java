// Lexicographically smallest string of length N and sum K
public class lexicographicallySmallest {
    public static String lexicographicallySmallestString(int n, int k){
        char[] ans = new char[n];

        for(int i=0; i<n; i++){
            ans[i]='a';
        }

        int extra= k-n;

        for(int i=n-1; i>=0; i--){
            int add = Math.min(extra,25);

            ans[i]+=add;
            extra-=add;

            if(extra==0){
                break;
            }
        }
        return new String(ans);
    }
    public static void main(String[] args) {
        int n=5;
        int k=43;

        System.out.println(lexicographicallySmallestString(n,k));
    }
}
