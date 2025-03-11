public class LongestSubArray{
        public int longestSubarray(int[] arr, int k) {
            // code here
            int ans=0;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    sum=arr[j];
                    if(sum==k){
                        ans++;
                    }
                    
                }
            }
            return ans;
        }
    }
