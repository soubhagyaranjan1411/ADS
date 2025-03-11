import java.util.Arrays;
import java.util.Stack;

public class Stack2 {
    //Given an circular array of intergers we need to find next greater number for every element
    //If it doesn't exist return -1
    //input num={1,2,1}
    //output={2,-1,-1}
    //input nums={3,8,4,1,2}
    //output={8,2,3,2,3}
    

    //Approach Monotonic Stack
    // A MONOTONIC DECREASING STACK HELPS US TO FIND THE NEXT GREATER ELEMENT
    //WE USE STACK TO TRACK THE ELEMENTS THAT WE HAVE SEEN SO FAR

    //OPTIMIZATION
    //USE A STACK
    //STORE INDICIES OF AN ELEMENT IN MONOTONIC DECREASING ORDER
    //PROCESS THE ELEMENTS IN A CIRCULAR MANNER

    public static int[] nGReEle(int [] nums){
        int n=nums.length;
        int [] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                res[stack.pop()]=nums[i%n];
            }
            if(i<n){
                stack.push(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(Arrays.toString(nGReEle(nums)));
        int [] nums1={3,8,4,1,2};
        System.out.println(Arrays.toString(nGReEle(nums1)));
    }
}
//496
//503 or 506