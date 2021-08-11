package Sort.Merge;

public class MergeSort {

    public static void mergeSort(int[] arr){
        int step = 1;
        int n = arr.length;
        if (n < 2){
            return;
        }

        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++){
            left[i] = arr[i];
        }

        step ++;

        for (int i = mid; i < n; i++){
            right[i-mid] = arr[i];
        }

        step ++;
        mergeSort(left);
        mergeSort(right);

        merge(arr,left,right);
    }

    public static void merge(int[] arr,int[] left,int[] right){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }

}

