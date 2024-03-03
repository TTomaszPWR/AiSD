package cw_list_1.zad3;

public class zad3 {
    public static boolean nextPermutation(int[] nums) {
        // Szukanie indeksu pierwszego elementu od końca, który jest mniejszy niż jego następnik.
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Szukanie najmniejszego elementu większego od nums[i].
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Zamiana miejscami nums[i] i nums[j].
            swap(nums, i, j);
        }

        // Odwracanie kolejności elementów po nums[i].
        reverse(nums, i + 1, nums.length - 1);

        return i >= 0;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        do {
            printArray(nums);
        } while (nextPermutation(nums));
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}