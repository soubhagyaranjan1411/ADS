public class RecursionIntro {
    //Recursion is a method that calls itself

    //types of recursion
    //direct recursion: a method calls itself
    //indirect recursion: a method calls another method that calls the first method
    public static int binarySearch(int[] arr, int target, int left, int right){
        if(left>right) 
            return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, right);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,};
        int target=1;
        int index = binarySearch(arr, target, 0, arr.length - 1);
    System.out.println(index);
    }

}