import java.util.Arrays;
import java.util.Comparator;

class ReverseOrder {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 1, 7, 3};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}

