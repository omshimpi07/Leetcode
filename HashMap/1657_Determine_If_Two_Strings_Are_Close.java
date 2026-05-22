/*
1657. Determine if Two Strings Are Close
Two strings are considered close if you can attain one from the other using the following operations:
Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, abcde -> aabcd (all 'e's turn into 'a's, and all 'a's turn into 'e's)
You can use the operations on either string as many times as necessary.
Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

Example 1: Input: word1 = "abc", word2 = "bca" Output: true
Example 2: Input: word1 = "a", word2 = "aa" Output: false
Example 3: Input: word1 = "cabbba", word2 = "abbccc" Output: true

Difficulty : medium

Approach:
1. First, check if the lengths of word1 and word2 are different. If they are, return false.
2. Create two HashMaps to count the frequency of each character in word1 and word2.
3. Check if the sets of keys (unique characters) in both HashMaps are the same. If not, return false.
4. Create two ArrayLists to store the frequency values from both HashMaps, sort them, and compare the sorted lists. If they are equal, return true; otherwise, return false.
Time Complexity: O(n log n) due to sorting the frequency lists, where n is the number of unique characters in the strings.
Space Complexity: O(n) for the HashMaps and ArrayLists, where n is the number of unique characters in the strings.

*/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Integer , Integer> map1 = new HashMap<>();
        HashMap<Integer , Integer> map2 = new HashMap<>();

        for(int i = 0; i<word1.length(); i++ ){
            int ch = word1.charAt(i);
            map1.put(ch , map1.getOrDefault(ch , 0) + 1);
        }
        for(int i = 0; i<word2.length(); i++ ){
            int ch1 = word2.charAt(i);
            map2.put(ch1 , map2.getOrDefault(ch1 , 0) + 1);
        }
        if(!map1.keySet().equals(map2.keySet()))
        {
            return false;
        }
        
        ArrayList<Integer> list1 = new ArrayList<>(map1.values());
        ArrayList<Integer> list2 = new ArrayList<>(map2.values());
        Collections.sort(list1);
        Collections.sort(list2);

        if(list1.equals(list2)){
            return true;
        }
        return false;

    }
}