package Ds.src.DAAAssessment;

public class MinLengthSubArray {
    public static int minSubArrayLen(int target, int[] nums) {
    
        // idiot - proof
        if (nums.length == 0) {
            return 0; 
        } else if (nums.length == 1) {
            return nums[0] == target ? 1 : 0;
        }
        
        // Initialization 
        // final result 
        int leastCounter = Integer.MAX_VALUE;
        int tempCounter = 0;
        int arrayValue = nums[0];
        
        // 2 pointers 
        int anchorPointer = 0; 
        int slidingPointer = 1;
        
        /*
            Idea : I seperate the situation into two, which are 
                   "sum value < target" and "sum value >= target", by using 2-pointer.
        */
        while (true) {
            
            // nums' array value sum < target
            if (arrayValue < target) {
                
                // Keep adding when the nums' array value < target
                if (slidingPointer <= nums.length - 1) {
                
                    // anchor ptr is not move, instead, move the sliding one to add the value
                    arrayValue += nums[slidingPointer]; 
                    slidingPointer++;
                    tempCounter++; 
                } else {
                    
                    // This situation is like target = 11, nums = [1,1,1,1,1,1,1,1]. 
                    // The anchor is never move, but the sliding pointer is iterating to its' end.
                    // Thus, break out
                    break;
                }
            } 
            
            // nums' array value sum >= target
            else {
                
                // The reason we put the tempCounter here is cuz the loop comes in this "else" 
                // before plusing one to the tempCounter. 
                tempCounter++;
                
                // Record the final result counter
                if (leastCounter >= tempCounter) {
                    leastCounter = tempCounter;
                }
    
                // The previous round of "greater-or0equal" sum is ended, 
                // so move the anchor and sliding pointer to the next 
                // to see if there have any least counter existed
                anchorPointer++; 
                slidingPointer = anchorPointer + 1;
                tempCounter = 0;
                
                // This means the whole array is ended up of iterating, so break out
                if (anchorPointer == nums.length) {
                    break;
                }
                
                // The reset-value code putting here is because we need to check if the 
                // anchor pointer is out of boundary in the above if-statement before we assigned.
                arrayValue = nums[anchorPointer];
            }
        }
        
        // After breaking out from the if() in while(), the counter might not be modified until now. 
        // Thus, check before return
        return leastCounter == Integer.MAX_VALUE ? 0 : leastCounter; 
    }
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
