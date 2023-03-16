import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {30, 20, 50, 10, 40};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        /*simpleSort(arr);
         selectionSort(arr);
         .
        * */
        System.out.println(Arrays.toString(arr));
    }
    private static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int k = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = k;
        }
    }
    private static void selectionSort(int[] arr){
        int minIndex;
        for(int i=0;i<arr.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i]  = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    private static void bubbleSort(int[] arr){

    }
    private static void simpleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
