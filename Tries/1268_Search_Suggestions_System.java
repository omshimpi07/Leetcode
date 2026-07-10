/*
1268. Search Suggestions System
You are given an array of strings products and a string searchWord.
Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.
Return a list of lists of the suggested products after each character of searchWord is typed.

Example 1:
Input: products = ["mobile","mouse","moneypot","monitor","mousepad"],
searchWord = "mouse"
Output: [["mobile","moneypot","monitor"],["mobile","moneypot","monitor"],["mouse","mousepad"],["mouse","mousepad"],["mouse","mousepad"]]

Difficulty : medium

Approach : Trie.
1. Create a TrieNode class that represents each node in the trie. Each node contains an array of children nodes (for each letter a-z) and a list of suggestions.
2. Create a Trie class that contains the root node of the trie.
3. Implement the insert method:
   a. Start from the root node and iterate through each character of the word.
   b. For each character, calculate its index (0-25) and check if the corresponding child node exists. If not, create a new TrieNode.
   c. Move to the child node and continue until all characters are processed. Add the word to the suggestions list of the current node if it has less than 3 suggestions.
4. Implement the suggestedProducts method:
   a. Sort the products array to ensure lexicographical order.
    b. For each product, call the insert method to add it to the trie.
    c. Initialize a list to hold the result.
    d. For each character in searchWord, traverse the trie according to the character. If the current node is null, add an empty list to the result. Otherwise, add the suggestions list of the current node to the result.

Time Complexity: O(n * m + k * log(k)) where n is the number of products, m is the average length of the products, and k is the length of searchWord. The first term accounts for inserting all products into the trie, and the second term accounts for sorting the products.
Space Complexity: O(n * m) for the trie, where n is the number of products
*/

class TrieNode {

    TrieNode[] children = new TrieNode[26];
    List<String> suggestions = new ArrayList<>();
}

class Solution {

    TrieNode root = new TrieNode();

    private void insert(String word) {

        TrieNode curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null){
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];

            if (curr.suggestions.size() < 3){
                curr.suggestions.add(word);
            }
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        for (String product : products){
            insert(product);
        }
        List<List<String>> ans = new ArrayList<>();

        TrieNode curr = root;

        for (int i = 0; i < searchWord.length(); i++) {

            char ch = searchWord.charAt(i);

            if (curr != null)
                curr = curr.children[ch - 'a'];

            if (curr == null)
                ans.add(new ArrayList<>());
            else
                ans.add(new ArrayList<>(curr.suggestions));
        }

        return ans;
    }
}