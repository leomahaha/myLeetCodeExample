package com.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            int target1 = target-nums[first];
            // 枚举 b
            for (int four = first + 1; four < n; ++four) {
                // 需要和上一次枚举的数不相同
                if (four > first + 1 && nums[four] == nums[four - 1]) {
                    continue;
                }
                target1 = target-nums[first]-nums[four];
                // c 对应的指针初始指向数组的最右端
                int third = n - 1;
                for (int second = four + 1; second < n; ++second) {
                    // 需要和上一次枚举的数不相同
                    if (second > four + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    // 需要保证 b 的指针在 c 的指针的左侧
                    while (second < third && nums[second] + nums[third] > target1) {
                        --third;
                    }
                    // 如果指针重合，随着 b 后续的增加
                    // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target1) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[four]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LeetCode18 leetCode18=new LeetCode18();
        List<List<Integer>> lists = leetCode18.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        for (List list : lists){
            System.out.print("[");
            for ( Object integer:list){
                System.out.print(integer+",");
            }
            System.out.print("],"+"\n");
        }
    }
}
