// You are given an integer K denoting the substring length 
// and two strings S1 and S2. You have to generate all unique substrings 
// of length K from S1 and count how many also appear in S2 (case-sensitive).
//  Your task is to find and return an integer value 
// representing the count of such common substrings.

// input1: An integer value K representing the substring length.
// input2: A string S1 of lowercase English alphabet (a-z)
// input3: A string S2 of lowercase English alphabet (a-z)

// input1: 2
// input2: abcde
// input3: cdefgh
// Output: 2

import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1==null || s2==null || k<=0 || s1.length()<=k || s2.length()<=k) System.out.println("Wrong Input");
        HashSet<String> r1 = new HashSet<>();
        HashSet<String> r2 = new HashSet<>();
        for(int i=0; i<=s1.length()-k; i++){
            r1.add(s1.substring(i,i+k));
        }
        for(int i=0; i<=s2.length()-k; i++){
            r2.add(s2.substring(i,i+k));
        }
        int count = 0;
        for(String i: r1){
            if(r2.contains(i)) count++;
        }
        System.out.println(count);
    }
}


// Alternate approach

class UserMainCode {

    public int findCommonSubstrings(int input1, String input2, String input3) {
        int k = input1;
        Set<String> s1Substrings = new HashSet<>();
        
        // Step 1: Generate all unique substrings of length k from input2 (S1)
        for (int i = 0; i <= input2.length() - k; i++) {
            s1Substrings.add(input2.substring(i, i + k));
        }

        // Step 2: Check how many of those substrings appear in input3 (S2)
        Set<String> commonSubstrings = new HashSet<>();
        for (int i = 0; i <= input3.length() - k; i++) {
            String sub = input3.substring(i, i + k);
            if (s1Substrings.contains(sub)) {
                commonSubstrings.add(sub);
            }
        }

        return commonSubstrings.size();
    }
}