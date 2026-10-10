public class mergeSortedArr {
    public static void mergeSortedArray(int num1[], int num2[], int m, int n){
        int k = m+n-1;
        int i=m-1;
        int j=n-1;

        while(i>=0 && j>=0){
            if(num1[i] > num2[j]){
                num1[k--]=num1[i--];
            }else{
                num1[k--]=num2[j--];
            }
        }

        while(j>=0){
            num1[k--]=num2[j--];
        }
    }
    public static void main(String[] args) {
        int num1[] = {1,2,3,0,0,0};
        int num2[] = {2,5,6};

        mergeSortedArray(num1, num2, 3, 3);

        for(int i=0; i<num1.length; i++){
            System.out.print(num1[i] + " ");
        }
    }
}
