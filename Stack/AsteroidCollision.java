/**
 735. Asteroid Collision

We are given an array asteroids of integers representing asteroids in a row. The indices of the asteroid in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

 

Example 1:

Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2:

Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.
Example 3:

Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

 */
import java.util.*;
class asteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int curr: asteroids){
            boolean isAlive = true;

            while(
                isAlive &&
                curr<0 &&
                !stack.isEmpty() &&
                stack.peek()>0
            ){
                int top = stack.peek();

                if(-curr>top){
                    stack.pop();
                }
                else if(-curr<top){
                    isAlive=false;
                }
                else if(-curr==top){
                    stack.pop();
                    isAlive = false;
                }
                

            }
            if(isAlive){
                    stack.push(curr);
                }
        }

        int[] res = new int[stack.size()];

        for(int i = res.length-1;i>=0;i--){
            res[i]=stack.pop();
        }

        return res;
        
    }
}