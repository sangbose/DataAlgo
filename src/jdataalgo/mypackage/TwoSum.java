package jdataalgo.mypackage;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	    public int[] twoSum(int[] nums, int target) {
	    	
	        HashMap<Integer, Integer> hashMapObj = new HashMap<Integer, Integer>();
	        
	        for (int i = 0; i < nums.length; i++){
	        	hashMapObj.put(nums[i],i);  	
	        }
	        
	        for (int theFirstValue = 0; theFirstValue < nums.length; theFirstValue++){
	            int theFirstKey = nums[theFirstValue];
	        	int complementKey = target - nums[theFirstValue];	        			
	        	Integer theOtherValue = hashMapObj.get(complementKey);
	        	if (theOtherValue != null){
	        		return new int[] {theFirstValue,theOtherValue.intValue()};
	        	}
	        }
	        throw new IllegalArgumentException("No two sum solution");
     
	    }
	    
	    public void execute(){
	    	int[] problemArray = new int[]{2,7,11,15};
	    	System.out.println(Arrays.toString(twoSum(problemArray,9)));
    }
}
	
