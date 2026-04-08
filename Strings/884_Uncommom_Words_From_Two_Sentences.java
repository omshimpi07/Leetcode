/*

884. Uncommon Words from Two Sentences
We are given two sentences A and B.  (A sentence is a string of space separated
words.  Each word consists only of lowercase letters.)
A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
Return a list of all uncommon words.

Example 1: Input: A = "this apple is sweet", B = "this apple is sour" Output: ["sweet","sour"]
Example 2:   Input: A = "apple apple", B = "banana" Output: ["banana"]

Note: 1 <= A.length <= 200 || 1 <= B.length <= 200
A and B consist of spaces and lowercase letters.

Difficulty: Easy

Approach:
1. Create a HashMap to store the count of each word from both sentences.
2. Split both sentences into words and update the count in the HashMap.         
3. Iterate through the HashMap and collect words that have a count of 1, which means they are uncommon.
4. Convert the list of uncommon words to an array and return it.
Time Complexity: O(n) where n is the total number of words in both sentences.   
Space Complexity: O(n) for the HashMap and the list of uncommon words.

*/

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String, Integer> map = new HashMap<>();
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        for(String word : a){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(String word : b){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> answer = new ArrayList<>();

        for(String key : map.keySet()){
            if(map.get(key) == 1){
                answer.add(key);
            }
        }
        return answer.toArray(new String[0]);
    }
}
