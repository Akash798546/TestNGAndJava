package JavaBasics;

public class TestCase107 {
	
	public static void twoSum(int[] arr,int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					
					System.out.println(arr[i]+","+arr[j]);
					
				}
				
				
			}
			
			
			
		}
	}
    public static void main(String[] args)
	    {
	       TestCase107 tc=new TestCase107();
	        int target=11;
	        int[] a={2,5,6,4,3};
	        twoSum(a, target);
	        
	    }

}
