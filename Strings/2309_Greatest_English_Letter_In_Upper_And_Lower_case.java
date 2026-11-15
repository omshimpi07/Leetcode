/*
2309. Greatest English Letter in Upper and Lower Case

Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.
An English letter b is greater than another letter a if b appears after a in the English alphabet.

Example 1: Input: s = "lEeTcOdE" Output: "E"
Explanation: The letter 'E' is the only letter to appear in both lower and upper case.

Difficulty: Easy

 */

class Solution {
    public String greatestLetter(String s) {
        

        char max = 0;

        for(int i = 0; i< s.length(); i++){

            char ch = s.charAt(i);
            //This only checks whether a character is uppercase. It does NOT convert anything.
            if (Character.isUpperCase(ch)) {
                //This actually returns the lowercase equivalent of the character.
                char lower = Character.toLowerCase(ch);

                if (s.indexOf(lower) != -1 && ch > max) {
                    max = ch;
                }
            
            }
        }   
        return max == 0 ? "" : String.valueOf(max); 
    }
}        

                // str1.toLowerCase().equals(str2.toLowerCase())

                // if( convertedToLower == s.charAt(j) || convertedToUpper  == s.charAt(j)){

                //     sb.append(convertedToUpper);
                // }

        //     }
        // }

        // return sb.toString();

        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> lower = new HashSet<>();

        // Store uppercase and lowercase characters
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper.add(ch);
            }
            else if (Character.isLowerCase(ch)) {
                lower.add(ch);
            }
        }

        // Search from Z to A
        for (char ch = 'Z'; ch >= 'A'; ch--) {

            if (upper.contains(ch) &&
                lower.contains(Character.toLowerCase(ch))) {

                return String.valueOf(ch);
            }
        }

        return "";
