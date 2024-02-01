public class sum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 12, 13, 7, 4};
        int sum = 13;

        for(int i=0; i<arr.length; ++i){
            for(int j=i+1; j<arr.length; ++j){
                if(arr[i] + arr[j] == sum){
                    System.out.println("{"+arr[i] + "," + arr[j] +"}");
                    System.out.println("yes");
                }
            }
        }
    }
}
