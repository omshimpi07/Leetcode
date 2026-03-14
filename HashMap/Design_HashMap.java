/*
Design a HashMap without using any built-in hash table libraries. To be specific, your design should include these functions:
put(key, value): Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
remove(key): Remove the mapping for the value key if this map contains the mapping for the key

Example:
MyHashMap hashMap = new MyHashMap();
hashMap.put(1, 1);
hashMap.put(2, 2);
hashMap.get(1);            // returns 1
hashMap.get(3);            // returns -1 (not found)
hashMap.put(2, 1);          // update the existing value
hashMap.get(2);            // returns 1
hashMap.remove(2);          // remove the mapping for 2
hashMap.get(2);            // returns -1 (not found)

Note: All keys and values will be in the range of [0, 1000000].The number of operations will be in the range of [1, 10000].
Difficulty: Easy

Approach:
1. Use a built-in HashMap to store the key-value pairs. The put method will insert or update the value for the given key, the get method will return the value associated with the key or -1 if the key does not exist, and the remove method will delete the key-value pair from the HashMap.
Time Complexity: O(1) for put, get, and remove operations.
Space Complexity: O(n) where n is the number of key-value pairs stored in the HashMap.

*/

class MyHashMap {
    HashMap<Integer,Integer> map;
    public MyHashMap() {
        map = new HashMap<>();
    }
    
    public void put(int key, int value) {
        map.put(key,value);
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */