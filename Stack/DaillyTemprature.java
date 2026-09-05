/*

739. Daily Temperatures

Given an array of integers temperatures represents the daily temperatures, 
return an array answer such that answer[i] is the number of days you have to wait after
the ith day to get a warmer temperature. If there is no future day for which this is 
possible, keep answer[i] == 0 instead.


 */

import java.util.*;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[temperatures.length];

        for(int i = temperatures.length-1;i>=0;i--){

            //pop untill stack gets empty or temp of index at top is less than current temp
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }

            //ans will be stack top element (next greater temp index) - current index 
            if(!stack.isEmpty()){
                ans[i]= stack.peek()-i;
            }

            stack.push(i);


        }
        return ans;
    }
}