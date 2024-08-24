package JavaBasics;

public class BinarySearch {

  public int binarySearch(int[] arr,int f,int l, int x)
  {
	  if(f>l)
	  {
		  return -1;
	  }
	   int mid=f + (l - f)/2;
	   if(arr[mid]==x)
	   {
		   return mid;
	   }
	   
	   if(x>arr[mid])
	   {
		   return binarySearch(arr, mid+1, l, x);
	   }
	   
	   return binarySearch(arr, f, mid-1, x);
  }
  public static void main(String[] args)
  {
	  
	  BinarySearch bs=new BinarySearch();
	  int[] a= {223,344,544,654,643,766,367};
	  int x=766;
	  int index =bs.binarySearch(a, 0, a.length-1, x);
	  if(index==-1)
	  {
		  System.out.println("Element not found..");
	  }
	  else
	  {
		  System.out.println("Element present at index : "+index);
	  }
  }
}
