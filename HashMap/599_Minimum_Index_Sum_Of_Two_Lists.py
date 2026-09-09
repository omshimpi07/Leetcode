"""
599. Minimum Index Sum of Two Lists

Given two arrays of strings list1 and list2, find the common strings with the least index sum.
A common string is a string that appeared in both list1 and list2.
A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
Return all the common strings with the least index sum. Return the answer in any order.

Example 1: Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"] Output: ["Shogun"]
Explanation: The only common string is "Shogun".

Example 3: Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
Output: ["sad","happy"]
Explanation: There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".
 
Diificulty : easy

Approach:
1. Create a dictionary to store the index of each restaurant in list1.
2. Iterate through list2 and check if the restaurant is in the dictionary.
3. If it is, calculate the index sum and compare it with the minimum index sum found
4. If the current index sum is less than the minimum, update the minimum and reset the answer list with the current restaurant.
5. If the current index sum is equal to the minimum, append the current restaurant to the answer list.
6. Return the answer list after iterating through list2.

Time Complexity: O(n + m), where n is the length of list1 and m is the length of list2.
Space Complexity: O(n), where n is the length of list1, for storing the index of each restaurant in the dictionary.

"""

class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        restaurant_index = {}

        # Store restaurant → index of list1
        for i in range(len(list1)):
            restaurant_index[list1[i]] = i

        ans = []
        min_sum = float("inf")

        # Traverse list2
        for j in range(len(list2)):
            if list2[j] in restaurant_index:

                total = restaurant_index[list2[j]] + j

                if total < min_sum:
                    ans.clear()
                    ans.append(list2[j])
                    min_sum = total

                elif total == min_sum:
                    ans.append(list2[j])

        return ans