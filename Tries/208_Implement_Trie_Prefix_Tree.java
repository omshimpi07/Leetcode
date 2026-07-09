/*
208. Implement Trie (Prefix Tree)
Implement a trie with insert, search, and startsWith methods.
A trie (pronounced as "try") or prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings. There are various applications of this data structure, such as autocomplete and spellchecker.
Implement the Trie class:
Trie() Initializes the trie object.
void insert(String word) Inserts the string word into the trie.
boolean search(String word) Returns true if the string word is in the trie, false otherwise.
boolean startsWith(String prefix) Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise.

Example 1:
Input

["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]  
output
[null, null, true, false, true, null, true] 

Difficulty : medium

Approach : Trie.
1. Create a TrieNode class that represents each node in the trie. Each node contains an array of children nodes (for each letter a-z) and a boolean flag indicating if it marks the end of a word.
2. Create a Trie class that contains the root node of the trie. 
3. Implement the insert method:
   a. Start from the root node and iterate through each character of the word.
   b. For each character, calculate its index (0-25) and check if the corresponding child node exists. If not, create a new TrieNode.
   c. Move to the child node and continue until all characters are processed. Mark the last node as the end of a word.  
4. Implement the search method:
   a. Start from the root node and iterate through each character of the word.  
    b. For each character, calculate its index and check if the corresponding child node exists. If not, return false.      
    c. Move to the child node and continue until all characters are processed. Return true if the last node is marked as the end of a word, otherwise return false.
5. Implement the startsWith method:
    a. Start from the root node and iterate through each character of the prefix.  
     b. For each character, calculate its index and check if the corresponding child node exists. If not, return false.      
     c. Move to the child node and continue until all characters are processed. Return true if all characters are found.

     Time Complexity: O(m) for insert, search, and startsWith methods, where m is the length of the word or prefix being processed.
Space Complexity: O(n * m) for the trie, where n is the number of words
*/

class TrieNode {

    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}
class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int index = ch - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            int index = ch - 'a';

            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for (int i = 0; i < prefix.length(); i++) {

            char ch = prefix.charAt(i);
            int index = ch - 'a';

            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */