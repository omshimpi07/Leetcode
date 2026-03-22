/*  
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Example 1: Input: s = "()" Output: true
Example 2: Input: s = "()[]{}" Output: true
Example 3: Input: s = "(]" Output: false
Example 4: Input: s = "([)]" Output: false
Example 5: Input: s = "{[]}" Output: true
Constraints:
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
Difficulty: Easy
Approach:
1. Use a stack to keep track of opening brackets. For each character in the string, if it's an opening bracket, push it onto the stack. If it's a closing bracket, check if the stack is empty (which means there's no corresponding opening bracket) or if the top of the stack does not match the corresponding opening bracket. If either condition is true, return false. After processing all characters, check if the stack is empty (which means all brackets were matched properly). If it is empty, return true; otherwise, return false.
Time Complexity: O(n) where n is the length of the string.
Space Complexity: O(n) in the worst case when all characters are opening brackets.
 */

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length();i++){
            
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(st.peek() == '(' && ch == ')' ||
                    st.peek() == '{' && ch == '}' ||
                    st.peek() == '[' && ch == ']'){
                        st.pop();
                    }
                else{
                    return false;
                }   
            }
        }
        return st.isEmpty();
    }
}