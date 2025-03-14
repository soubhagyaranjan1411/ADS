import java.util.ArrayList;
import java.util.List;

public class BackTrackIntro {
    //what is backtrakcing
    //Backtracking is a tecahnique used to explore all possible solution by trying all possible options and undoing when choice leads to a dead end

    //you have to choose the possiblities and then backtrack if the choice is wrong
    //if the conditon met, then store the result.
    //if the condition is not met, then backtrack and try another choice
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subset(nums));
         //backtrack is a technique used to explore all possible solution by trying out different choices and undoing when chice leads to deas end.

    }

    public static void gs(int[] nums, int in, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr)); 
        for (int i = in; i < nums.length; i++) {
            curr.add(nums[i]); 
            gs(nums, i + 1, curr, res); 
            curr.remove(curr.size() - 1);
        }
    }

    public static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        gs(nums, 0, new ArrayList<>(), res);
        return res;
    }
}
