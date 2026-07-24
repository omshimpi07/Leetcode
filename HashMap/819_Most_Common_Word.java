/*
819. Most Common Word
Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words. It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
Words in the list of banned words are given in lowercase, and free of punctuation. Words in 
the paragraph are not case sensitive. The answer is in lowercase.

Example 1: Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"] Output: "ball" Explanation: "hit" occurs 3 times, but it is a banned word. "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. Note that words in the paragraph are not case sensitive, that punctuation is ignored (even if adjacent to words, such as "ball,"), and that "hit" isn't the answer even though it occurs more because it is banned.
Example 2: Input: paragraph = "a.", banned = [] Output: "a"
Difficulty : Easy

Approach:
1. Convert the paragraph to lowercase and replace all non-letter characters with spaces.    
2. Create a HashSet to store the banned words for quick lookup.
3. Create a HashMap to count the frequency of each word in the paragraph that is not banned.
4. Split the paragraph into words and iterate through them, updating the frequency count in the HashMap for each non-banned word.
5. Keep track of the word with the highest frequency that is not banned while iterating through the words.
6. Return the word with the highest frequency as the result.

Time Complexity: O(n) where n is the length of the paragraph, since we are iterating through the paragraph and processing each word.
Space Complexity: O(m) where m is the number of unique words in the paragraph, for storing the frequency counts in the HashMap and the banned words in the HashSet.

*/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        HashSet<String> ban = new HashSet<>();

        for (String word : banned)
            ban.add(word);

        HashMap<String, Integer> map = new HashMap<>();

        String ans = "";
        int max = 0;

        for (String word : paragraph.split("\\s+")) {

            if (word.length() == 0 || ban.contains(word))
                continue;

            int freq = map.getOrDefault(word, 0) + 1;
            map.put(word, freq);

            if (freq > max) {
                max = freq;
                ans = word;
            }
        }

        return ans;
    }
}