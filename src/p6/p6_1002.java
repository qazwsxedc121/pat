package p6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * User: guoxc
 * Date: 15-6-23
 * Time: 15:09
 */
public class p6_1002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i += 1){
            nums[i] = in.nextInt();
        }
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        List<Integer> l3 = new ArrayList<Integer>();
        List<Integer> l4 = new ArrayList<Integer>();
        List<Integer> l5 = new ArrayList<Integer>();
        for(int i = 0; i < n; i += 1){
            int c = nums[i];
            switch (c % 5){
                case 0:
                    if(c % 2 == 0){
                        l1.add(c);
                    }
                    break;
                case 1:
                    l2.add(c);
                    break;
                case 2:
                    l3.add(c);
                    break;
                case 3:
                    l4.add(c);
                    break;
                case 4:
                    l5.add(c);
                    break;
                default:
                    break;
            }
        }
        String[] res = new String[5];
        res[0] = l1.isEmpty() ? "N" : "" + sum(l1);
        res[1] = l2.isEmpty() ? "N" : "" + alterSum(l2);
        res[2] = "" + l3.size();
        res[3] = l4.isEmpty() ? "N" : String.format("%.1f", average(l4));
        res[4] = l5.isEmpty() ? "N" : "" + getMax(l5);
        System.out.printf("%s %s %s %s %s", res[0], res[1], res[2], res[3], res[4]);
    }
    private static int sum(List<Integer> l){
        int res = 0;
        for(Integer i : l){
            res += i;
        }
        return res;
    }
    private static int alterSum(List<Integer> l){
        int op = 1;
        int n = l.size();
        int res = 0;
        for(int i = 0; i < n; i += 1){
            res += op * l.get(i);
            op = -op;
        }
        return res;
    }
    private static double average(List<Integer> l){
        return (sum(l) + 0.0) / l.size();
    }
    private static int getMax(List<Integer> l){
        int res = 0;
        for(Integer i : l){
            if(i > res) {
                res = i;
            }
        }
        return res;
    }
}
