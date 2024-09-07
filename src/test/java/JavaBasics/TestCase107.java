package JavaBasics;

public class TestCase107 {
	

	    public void twoSum(int[] nums,int target) {

	        for(int i=0;i<nums.length-1;i++)
	        {
	for(int j=i+1;j<nums.length;j++)
	{
	    if(nums[i]+nums[j]==target)
	    {
	        System.out.println(nums[i]+","+nums[j]);
	    }
	}

	        }
	        


	}
	    public static void main(String[] args)
	    {
	       TestCase107 tc=new TestCase107();
	        int target=10;
	        int[] a={2,5,6,4,3};
	        tc.twoSum(a,target);
	    }

}
