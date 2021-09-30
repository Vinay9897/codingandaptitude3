import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 3, 7, 2, 9, 8 };
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int arr[]) {
        int len = arr.length;
        if (len == 1) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, len / 2);
        int[] right = Arrays.copyOfRange(arr, len / 2, len);
        left = mergeSort(left);
        right = mergeSort(right);

        int[] arr1 = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;
        while (true) {
            if (l < left.length && r < right.length) {
                if (left[l] <= right[r]) {
                    arr1[i++] = left[l++];
                } else {
                    arr1[i++] = right[r++];
                }
            } else if (l < left.length) {
                arr1[i++] = left[l++];
            } else if (r < right.length) {
                arr1[i++] = right[r++];
            } else
                break;
        }
        return arr1;
    }
}
