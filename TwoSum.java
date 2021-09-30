import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 19;
        int a[] = twoSum(nums, target);
        int len = a.length;
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if ((hashMap.containsKey(rem))) {
                int index = hashMap.get(rem);
                if (i == index)
                    continue;
                return new int[] { i, index };
            }
        }
        return new int[] {};
    }
}
