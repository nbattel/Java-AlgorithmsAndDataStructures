/*
- Using a stack, determine whether a string is a palindrome
- Strings may contain punctuation and spaces. they should be ignored. Case should be ignored
- Examples:
       1. " I did, did I?" is a palindrome
       2. "Racecar" is a palindrome
       3. "hello" is not a palindrome
- Use the starter project in the resource section
 */

package nbattel.StackChallenge;

import java.util.Stack;

public class Main {

    public static void main(String[] args)
    {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string)
    {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for(int i = 0; i < lowerCase.length(); i++)
        {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z')
            {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder((stack.size()));

        while(!stack.isEmpty())
        {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}
