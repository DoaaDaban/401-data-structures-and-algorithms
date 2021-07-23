import java.util.*;

public class Main
{
  static Stack reverseArr (int[]arr)
  {
    Stack < Integer > newArr = new Stack < Integer > ();
    for (int i = arr.length - 1; i < arr.length; i--)
      {
	newArr.push (arr[i]);
	if (i == 0)
	  {
	    break;
	  }

      }
    return newArr;
  }
  
  public static void main (String[]args)
  {

    int[] a = { 1, 2, 3, 4, 5 };
    Stack y = reverseArr(a) ;
    System.out.println (y);
  }
}
