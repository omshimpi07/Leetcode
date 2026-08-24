/*
1773.Count Items Matching a Rule
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:     
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.   

Example 1: Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver" Output: 1 Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].  

Difficulty : easy

Approach : Array.
1. Determine the index of the attribute to check based on the ruleKey: 0 for "type", 1 for "color", and 2 for "name".
2. Initialize a count variable to keep track of the number of matching items.
3. Iterate through each item in the items array:
    a. For each item, check if the value at the determined index matches the ruleValue.
    b. If it matches, increment the count.
4. After checking all items, return the count of matching items.
Time Complexity: O(n) where n is the number of items, since we check each item
Space Complexity: O(1) since we are using a constant amount of space for the count variable.

*/

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }

        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}