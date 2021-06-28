import java.util.*;
public class Main
{
 static int[] insertShiftArray (int[] oldArr , int newValue) {
    int mid ;
    int newArr[] = new int[oldArr.length + 1];
    mid = oldArr.length % 2 == 0 ?  mid = oldArr.length / 2 : oldArr.length / 2 + 1 ;
    for (int i = 0; i <newArr.length ; i++) {
        if (i < mid) {
            newArr[i] = oldArr[i];
        }
        else if (i == mid) {
            newArr[i] = newValue;
        }
        else {
            newArr[i] = oldArr[i-1];
        }
    }
    return newArr;
}
  
  public static void main (String[]args)
  {

    int[] a = { 1, 2, 3, 4, 5 };
    
    System.out.println(Arrays.toString(insertShiftArray(a,9)));
  }
}
