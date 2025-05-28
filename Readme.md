1. You are given an integer K denoting the substring length 
and two strings S1 and S2. You have to generate all unique substrings 
of length K from S1 and count how many also appear in S2 (case-sensitive).
 Your task is to find and return an integer value 
representing the count of such common substrings.

input1: An integer value K representing the substring length.
input2: A string S1 of lowercase English alphabet (a-z)
input3: A string S2 of lowercase English alphabet (a-z)

input1: 2
input2: abcde
input3: cdefgh
Output: 2


2. A Revisit Later  You are given two lowercase strings, 
X and Y on which you have to perform below operations:  
From X, pick every 2nd character starting from index 0 
to form Group1 (length = N).

From Y, check all substrings of length N.  For each substring, 
you have to calculate the total absolute difference between 
corresponding characters' ASCII values of Group1 and the substring. 

Your task is to find and return an integer value representing 
the starting index of the substring in Y that has the maximum total difference.  

Input Specification:  input1: A string value X  input2: A string value Y

Output Specification:
Return an integer value representing the starting index 
of the substring in Y that has the maximum total difference.

Example 1:
input1: aabbcc
input2: abcd
Output: 1

Explanation:
Here, string X is "aabbcc" and string Y is "abcd". We can see that in X ie., "aabbcc", we can align indices 0. 2 and 4 in Group 1. So. Group1 will be "abc".

