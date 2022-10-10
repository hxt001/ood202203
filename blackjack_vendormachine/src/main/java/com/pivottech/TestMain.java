package com.pivottech;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
//        Deck<BlackjackCard> deck = new Deck<>();
//
//        List<Integer> list = new ArrayList<>();
//        Integer[] arr = list.toArray(new Integer[list.size()]);
//        List<String> ret = new ArrayList<>();
//        ret.add("aa");
//        ret.add("bb");
//        String[] sarr = ret.toArray(new String[ret.size()]);
//        System.out.printf("12121");
        int[] copy = new int[1];
        int[] nums2 = Arrays.stream(copy).sorted().distinct()
                .toArray();
        TreeSet<Integer> m = new TreeSet();
        m.add(1);
        m.add(3);
        int ret1 = m.higher(1);
        System.out.println(ret1);
    }
    int f1(Integer i) {
        return i;
    }

}
