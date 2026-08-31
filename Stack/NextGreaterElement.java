/*


496. Next Greater Element I

The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.


 */

import java.util.*;

class nextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
            //starts with the last elment 
            int curr = nums2[i];

            //remove element while stack empty or found greater element 
            while(!stack.isEmpty() && curr>=stack.peek()){
                stack.pop();
            }

            //if Empty then add -1 and if not then add most recent that will be next greater for current 
            if(stack.isEmpty()){
                map.put(curr,-1);
            }else{
                map.put(curr,stack.peek());
            }

            //add current as last to maintain flow 
            stack.push(curr);
        }

        int[] ans = new int[nums1.length];
        //map the hashmap into array 
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(nums1[i]);
        }

        return ans;
        
    }
}