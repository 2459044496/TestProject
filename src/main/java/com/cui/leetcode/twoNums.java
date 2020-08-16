package com.cui.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc:TODO
 * @author: Cui Pai
 * @date 2020/4/18 12:37
 */
public class twoNums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int [] result = method2(nums,target);
        for (int i : result
             ) {
            System.out.print(i);
        }
    }

    static int[] method1(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<nums.length;j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.println(i+"..."+j);
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    static int[] method2(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++) {
            hashMap.put(nums[i],i);
        }
        for (int j=0;j<nums.length;j++) {
            int complement = target-nums[j];
            if (hashMap.containsKey(complement) && hashMap.get(complement)!= j) {
                return new int[]{j,hashMap.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
