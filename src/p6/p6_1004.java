package p6;

import java.util.Scanner;

/**
 * User: guoxc
 * Date: 15-6-30
 * Time: 19:44
 */
public class p6_1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        String s3 = in.next();
        String s4 = in.next();
        int day = 0;
        int hour = 0;
        int minute = 0;
OUTER:  for(int i = 0; i < s1.length(); i += 1){
            char c1 = s1.charAt(i);
            if(isUpper(c1)){
                char c2 = s2.charAt(i);
                if(c1 == c2){
                    day = c1 - 'A' + 1;
                    for(int k = i + 1; k < s1.length(); k += 1){
                        char c3 = s1.charAt(k);
                        if(isUpper(c3) || isDigit(c3)){
                            char c4 = s2.charAt(k);
                            if(c3 == c4){
                                if(isDigit(c3)){
                                    hour = c3 - '0';
                                }else{
                                    hour = c3 - 'A' + 10;
                                }
                                break OUTER;
                            }
                        }
                    }
                }

            }
        }

        for(int i = 0; i < s3.length(); i += 1){
            char c = s3.charAt(i);
            if(isChar(c)) {
                char c2 = s4.charAt(i);
                if(c == c2){
                    minute = i;
                    break;
                }
            }
        }
        String[] dayS = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
        String hourS = hour > 9 ? "" + hour : "0" + hour;
        String minuteS = minute > 9 ? "" + minute : "0" + minute;
        System.out.println(dayS[day-1] + " " + hourS + ":" + minuteS);

    }
    private static boolean isUpper(char c){
        return c >= 'A' && c <= 'Z';
    }
    private static boolean isChar(char c){
        return (c >= 'a' && c <= 'z') || isUpper(c);
    }
    private static boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }
}
