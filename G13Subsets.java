import java.util.ArrayList;
import java.util.List;

public class G13Subsets {
    public static void GenerateSubsets(int[] nums, int in, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));
        for(int i=in;i<nums.length;i++){
            curr.add(nums[i]);
            GenerateSubsets(nums,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        GenerateSubsets(nums,0,new ArrayList<>(),res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
