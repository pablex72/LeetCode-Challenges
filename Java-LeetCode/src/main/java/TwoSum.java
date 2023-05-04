//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {


        int num[] = new int[5];
        int num2[] = {11,15,1,8,1,7};
        int[] resul = twoSum(num2, 18);
        System.out.println(Arrays.toString(resul));
        for(int i =0; i <resul.length; i++){
            System.out.println(resul[i]);
        }

    }
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }

            map.put(nums[i], i);
        }

        return new int[0];
        }


}
