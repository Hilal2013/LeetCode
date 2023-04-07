package easy;

import java.util.Stack;

public class ValidParenthesesStack {




    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='{'|| ch=='['){
                stack.push(ch);
            }
            if(stack.empty()){
                return false;
            }
            switch(ch) {
                case ')':
                    if(stack.pop()!='(') return false;
                    break;
                case ']':
                    if(stack.pop()!='[') return false;
                    break;
                case '}':
                    if(stack.pop()!='{') return false;
                    break;
            }

        }
        return stack.empty();
    }
}
