/*  Design a HashSet without using any built-in hash table libraries.
To be specific, your design should include these functions:
add(value): Insert a value into the HashSet.
remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
contains(value): Return whether the value exists in the HashSet or not.

Example:
MyHashSet hashSet = new MyHashSet();
hashSet.add(1);
hashSet.add(2);
hashSet.contains(1); // returns true
hashSet.contains(3); // returns false (not found)
hashSet.add(2);
hashSet.contains(2); // returns true
hashSet.remove(2);
hashSet.contains(2); // returns false (already removed)

Note: All values will be in the range of [0, 1000000]. The number of operations will be in the range of [1, 10000].

Difficulty: Easy

Approach:
1. Create a boolean array of size 1000001 to represent the presence of values in the HashSet.
2. The add method will set the corresponding index to true, the remove method will set it to false, and the contains method will return the value at the corresponding index.
Time Complexity: O(1) for add, remove, and contains operations.
Space Complexity: O(n) where n is the size of the boolean array (1000001 in this case).

*/

class MyHashSet {
    
    boolean[] set;
    public MyHashSet() {
        
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */