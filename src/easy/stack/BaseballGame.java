package easy.stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String str = "-2";
        System.out.println(Integer.parseInt(str));
     String[]   ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("D")) {
                Integer temp = stack.peek()*2;
                stack.push(temp );

            } else if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("+")) {

                Integer temp1 = stack.pop();
                Integer temp2 = stack.pop();
                stack.push(temp2);
                stack.push(temp1);
                stack.push(temp1 + temp2);

            } else {

                    stack.push(Integer.parseInt(operations[i]));
            }

        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
