// Given two lowercase strings X and Y, you are to:
// Extract every 2nd character from X (starting from index 0) to form a new string called Group1.
// From Y, check every substring of the same length as Group1.
// For each such substring in Y, calculate the sum of absolute 
// ASCII differences between corresponding characters of Group1 and the substring.
// Return the starting index of the substring in Y that has the maximum total ASCII difference.

import java.util.*;
public class p2 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     String s2 = sc.next();

     StringBuilder grp1 = new StringBuilder();

     for(int i=0; i<s1.length(); i+=2){
        grp1.append(s1.charAt(i));
     }

     int N = grp1.length();
     String grp = grp1.toString();
     int maxValue = Integer.MIN_VALUE;
     int maxIndex = 0;
     for(int i=0; i<=s2.length()-N; i++){
        String str = s2.substring(i,i+N);
        int sum = 0;
        for(int j=0; j<grp.length(); j++){
            sum += Math.abs(str.charAt(j)-grp.charAt(j));
        }
        if(sum>maxValue){
            maxValue = sum;
            maxIndex = i;
        }
     }
     System.out.println(maxIndex);
 }   
}
