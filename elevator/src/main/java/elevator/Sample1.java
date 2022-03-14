package elevator;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class Sample1 {
    class Node{
        Node left;
        Node right;
        int val;
    }
    class MyFunc1 implements Callable {

        @Override
        public Object call() throws Exception {
             System.out.println(123);
            return null;
        }
    }
    class MyFunc2 implements Callable {

        @Override
        public Object call() throws Exception {
            System.out.println(456);
            return null;
        }
    }
    class Timer {
        boolean needStop = false;
        int count;
        HashMap<Callable, Integer> map = new HashMap<>();
        void addClient(int interval, Callable callback) {
            map.put(callback, interval);
        }
        void onTick() {
            count++;
            for(Callable f : map.keySet()) {
                int i = map.get(f);
                if (count % i == 0) {
                    System.out.println("current time:" + count);
                    try {
                        f.call();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        void stop() {
            needStop = false;
        }
        void start() {
            needStop = true;
            Runnable runnable =
                    () -> {

                        while(needStop) {
                            onTick();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    };
            Thread thread = new Thread(runnable);
            thread.start();

        }
    }
    public static int dosomething(int i) {
        return i+3;
    }
    public static int dosomething2(int i) {
        return i+4;
    }
    public void test() {
        Timer timer = new Timer();
        MyFunc1 myFunc1 = new MyFunc1();
        MyFunc2 myFunc2 = new MyFunc2();
        timer.addClient(5, myFunc1);
        timer.addClient(10, myFunc2);

        timer.start();
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.stop();
    }
    public static void main(String[] args) {
//        String s = "aaa";
//        Queue<Character> q = new LinkedList<Character>(Arrays.asList(s.chars().to));
//        elevator.Sample1 sample1 = new elevator.Sample1();
//        sample1.test();
        int n = 6;
        int[] dp = new int[n+1];
        int ret = f(n, dp);
        System.out.println(ret);
    }
    static int f(int n, int[] dp) {
        dp[0] =1;
        dp[1] =1;
        for(int i = 2;i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];


//        if (dp[n] >0) return dp[n];
//        int ret =  f(n-1, dp) + f(n-2, dp);
//        dp[n] = ret;
//        return ret;
    }

    static int maxHeight(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        return Math.max(root.val, Math.max(maxHeight(root.left), maxHeight(root.right)));
    }

}
