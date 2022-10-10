package com.pivottech;


import java.util.Arrays;

class ReversePair {
    public class BIT {
        int[] arr;
        public BIT(int size) {
            arr = new int[size];
        }
        public void update(int idx, int delta) {
            idx++;
            while (idx < arr.length) {
                arr[idx] += delta;
                idx += (idx & -idx);
            }
        }
        public int getPrefixSum(int idx) {
            idx++;
            int sum = 0;
            while(idx>0) {
                sum += arr[idx];
                idx -= (idx & -idx);
            }
            return sum;
        }
    }
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length <= 1) return 0;
        int n = nums.length;
        int[] copy = nums.clone();
        Arrays.sort(copy);

        int[] nums2 = Arrays.stream(copy).distinct().toArray();
        BIT myBit = new BIT(nums.length+1);
        int totalCnt = 0;
        for(int i = nums.length-1;i>=0;i--) {
            int index1 = Arrays.binarySearch(nums2, (int) (nums[i]*1.0/2));
            if (index1>=0) {
                if (nums[i] <= nums2[index1] *2) {
                    index1--;
                }
            }
            if (index1<=-1) {
                index1 = -(index1+2);
            }

            int index2 = Arrays.binarySearch(nums2, nums[i]);

            totalCnt+= myBit.getPrefixSum(index1);
            myBit.update(index2, 1);

        }
        return totalCnt;
    }

    public static void main(String[] args) {
        int[] input = {-185,-5,-2};
        ReversePair reversePair = new ReversePair();
        int ret = reversePair.reversePairs(input);
        System.out.println(ret);
    }
}