package com.company;

public class Main {

    public static int binarySearch(int arr [], int searchKey){

        int lowIdx = 0;
        int highIdx = arr.length - 1;
        int midIdx = ( lowIdx + highIdx ) / 2;
        int value = midIdx;
        while (true){
            if(searchKey > arr[midIdx] ){
                lowIdx = midIdx +1;
                midIdx = ( lowIdx + highIdx ) / 2;
                if(lowIdx > midIdx){
                    value = -1;
                    break;
                }
            }else if(searchKey < arr[midIdx]){
                highIdx = midIdx - 1;
                midIdx = ( lowIdx + highIdx ) / 2;
                if(highIdx < midIdx){
                    value = -1;
                    break;
                }
            }else if(searchKey == arr[midIdx]){
                value = midIdx;
                break;
            }
        }
        return value;
        }



    public static void main(String[] args) {
	// write your code here
        int arr[] = {1, 3, 5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};
        int x = binarySearch(arr,0);
        System.out.print(x);
    }
}
