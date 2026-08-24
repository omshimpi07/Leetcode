"""
1773.Count Items Matching a Rule
You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:     
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.   

Example 1: Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver" Output: 1 Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].  

Difficulty : easy

Approach : 1. Create a variable to store the count of matching items. 2. Iterate through each item in the items list. 3. Check if the item matches the rule based on the ruleKey and ruleValue. 4. If it matches, increment the count. 5. Return the count after checking all items.
Time Complexity : O(n) where n is the number of items in the list. We need to check each item once.
Space Complexity : O(1) since we are using a constant amount of space for the count variable and index variable.

"""

class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        if ruleKey == "type":
            index = 0
        elif ruleKey == "color":
            index = 1
        else:
            index = 2

        count = 0

        for item in items:
            if item[index] == ruleValue:
                count += 1

        return count