package Lab03;

import java.util.Stack;

public class Lab3 {
    public static void main(String[] args) {
        System.out.println(isBalanced("(2+[5+7]+1)")); // true
        System.out.println(isBalanced("((2+[5+7]+1)")); // false
        System.out.println(isBalanced("(2+[5+7]+1")); // false
        System.out.println(isBalanced("2+[5+7]+1")); // true (no parentheses)
        System.out.println(isBalanced("(2+[5+7]+1")); // false
        System.out.println(isBalanced("({[]})")); // true
        System.out.println(isBalanced("({[})")); // false
        System.out.println(isBalanced("({[]})()[]<>()<")); // false
    }

    public static boolean isBalanced( String expression){
        Stack<Character> st = new Stack<>();
        boolean ballanced = true;
        int index = 0;

        while(ballanced && index < expression.length()){
            char ch = expression.charAt(index);

            if(isOpen(ch)){
                st.push(ch);
            }else if(isClose(ch)){
                if(st.isEmpty()){
                    ballanced = false;
                }else{
                    char topChar = st.pop();
                    if(!areMatching(topChar, ch)){
                        ballanced = false;
                    }
                }
            }
            index++;
        }
        if(ballanced && st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    private static boolean isOpen(char ch){
        return ch == '(' ||
                ch == '[' ||
                ch == '{' ||
                ch == '<';
    }
    private static boolean isClose(char ch){
        return ch == ')' ||
                ch == ']' ||
                ch == '}' ||
                ch == '>';
    }
    private static boolean areMatching(char c1, char c2){
        return (c1 == '(' && c2 == ')') ||
                (c1 == '[' && c2 == ']') ||
                (c1 == '{' && c2 == '}') ||
                (c1 == '<' && c2 == '>');
    }
}
