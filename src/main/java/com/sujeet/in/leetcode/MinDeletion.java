package com.sujeet.in.leetcode;


//String Reduction Given a string, reduce it in such a way that all
// of its substrings are distinct. To do so, you may delete any characters
// at any index. What is the minimum number of deletions needed?
// Note:
// A substring is a contiguous group of 1 or more characters within a string.
// Example
// s = "abab"
// Substrings in sare { 'a', 'b', 'a', 'b', 'ab', 'ba', 'ab', 'aba', 'bab', 'abab'}.
// By deleting one "a" and one "b", the string becomes "ab" or "ba" and all of its
// substrings are distinct. This required 2 deletions.

// Function Description Complete the function getMinDeletions in the editor below.

// getMinDeletions has the following parameter(s): string s:
// the given string Returns: int: the minimum number of deletions required
//Constraints 1sns 105 V Input Format For Custom Testing The first line contains a
// string, S.
// Sample Case o Sample Input For Custom Testing STDIN Function abcab S = "abcab"

// Sample Output 2 Explanation By deleting the first 2 characters, the string becomes "cab",
// which contains only distinct substrings.
//VSample Case 1 Sample Input For Custom Testing STDIN Function abcabc + s = "abcabc"
// Sample Output 3 Explanation By deleting the characters at indices 0, 4, and 5, the string
// becomes "bca", which contains only distinct substrings. This required 3 deletions.

public class MinDeletion {


    public static void main(String[] args) {

     String str="abcab";
     int s=getMinDeletions(str);
        System.out.println(s);


    }

    static int max_char = 26;

    public static int getMinDeletions(String str)
    {


        int n = str.length();
//
        if (n > max_char)
            return -1;

        int dist_count = 0;

        int count[] = new int[max_char];

        for(int i = 0; i < max_char; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++)
        {
            if(count[str.charAt(i)-'a'] == 0)
                dist_count++;
            count[str.charAt(i)-'a']++;
        }


        return (n-dist_count);
    }





}
