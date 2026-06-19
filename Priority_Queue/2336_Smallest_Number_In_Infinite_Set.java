/*
2336. Smallest Number in Infinite Set
You have a set which contains all the positive integers [1, 2, 3, 4, 5, ...].
Implement the SmallestInfiniteSet class:
SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all positive integers.
int popSmallest() Removes and returns the smallest integer contained in the infinite set.
void addBack(int num) Adds a positive integer num back into the infinite set, if it is not already in the infinite set.

Example 1: Input
["SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"]
[[], [2], [], [], [], [1], [], [], []]
Output [null, null, 1, 2, 3, null, 1, 4, 5]

Explanation
SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
smallestInfiniteSet.addBack(2);    // 2 is already in the set, so no change is made.
smallestInfiniteSet.popSmallest(); // return 1, since 1 is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 2, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 3, and remove it from the set.
smallestInfiniteSet.addBack(1);    // 1 is added back to the set.
smallestInfiniteSet.popSmallest(); // return 1, since 1 was added back to the set and is the smallest number, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 4, and remove it from the set.
smallestInfiniteSet.popSmallest(); // return 5, and remove it from the set.

Difficulty : medium

Approach : Priority Queue + HashSet.
1. Use a priority queue to keep track of the smallest numbers that have been added back to the set.
2. Use a hash set to keep track of the numbers that are currently in the priority queue to avoid duplicates.
3. For popSmallest(), if the priority queue is not empty, return and remove the smallest number from the priority queue and remove it from the hash set. If the priority queue is empty, return the current smallest number (starting from 1) and increment the current smallest number.
4. For addBack(num), if num is less than the current smallest number and is not already in the hash set, add it to the priority queue and the hash set.

Time Complexity: O(log n) for popSmallest() and addBack() operations due to the priority queue operations, where n is the number of elements in the priority queue.
Space Complexity: O(n) for the priority queue and hash set storing the numbers that have been added back to the set.
*/

class SmallestInfiniteSet {
    
    private PriorityQueue<Integer> pq;
    private HashSet<Integer> set;
    private int current;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        current = 1;
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()) {

            int num = pq.poll();
            set.remove(num);
            return num;
        }
        return current++;
    }
    
    public void addBack(int num) {
        if(num < current && !set.contains(num)) {

            pq.offer(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */