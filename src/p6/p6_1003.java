package p6;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

/**
 * User: guoxc
 * Date: 15-6-23
 * Time: 16:23
 */
public class p6_1003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int searchMax = 1000000;
        int l = in.nextInt();
        int r = in.nextInt();
        BitSet bitSet = new BitSet();
        bitSet.set(0, searchMax);
        bitSet.clear(0);
        bitSet.clear(1);
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0; i < searchMax - 1; i += 1){
            if(bitSet.get(i+1)){
                res.add(i+1);
                for(int j = i + 1; j < searchMax; j += i + 1){
                    bitSet.clear(j);
                }
            }
        }
        List<Integer> res1 = res.subList(l - 1, r);
        int i = 0;
        while(i < res1.size()){
            int k = -1;
            for(int j = 0; (i + j) < res1.size() - 1 && j < 9; j += 1){
                System.out.print(res1.get(i+j) + " ");
                k = j;
            }
            System.out.println(res1.get(i + k + 1));
            i += 10;
        }
    }
}
