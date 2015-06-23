package p6;

import java.util.Scanner;

/**
 * User: guoxc
 * Date: 15-6-23
 * Time: 15:02
 */
public class p6_1001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i += 1){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            if(a + b > c){
                System.out.println("Case #" + (i + 1) + ": true");
            }else{
                System.out.println("Case #" + (i + 1) + ": false");
            }
        }
    }
}
