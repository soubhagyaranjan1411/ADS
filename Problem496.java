import java.util.HashMap;
import java.util.Stack;

public class Problem496 {
    public static int[]nGReEle(int []nums1,int[]nums2){
        int n=nums1.length;
        int m=nums2.length;
        int [] res=new int[n];
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<n;i++){
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
