package TestFile.exer1;

/**
 * @author gjx
 * @create 2021-12-26 15:01
 */
public class likouTEst {
    public static void main(String[] args) {

        /**
         * 01
         */
        class Solution {
            public int[] twoSum(int[] nums, int target) {
                int[] ints = new int[2];
                for (int i = 0; i < nums.length; i++) {
                    for (int j = nums.length - 1; j > i; j--) {
                        if ((nums[i] + nums[j]) == target) {
                            ints[0] = i;
                            ints[1] = j;
                            return ints;
                        }
                    }
                }
                return ints;
            }
        }
        /**
         * 回型数的判断
         */
        class Solution1 {
            public boolean isPalindrome(int x) {
                if (x < 0) {
                    return false;
                }

                int num;
                int numx = 0;
                num = x;

                while (num != 0) {
                    numx = numx * 10 + num % 10;
                    num /= 10;
                }
                if(x==numx){
                    return true;
                }
                return false;
            }
        }
        boolean palindrome = new Solution1().isPalindrome(121);
        System.out.println(palindrome);

    }
}
