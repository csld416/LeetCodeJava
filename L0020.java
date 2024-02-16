import java.util.*;

public class L0020 {
    final static Scanner sc = new Scanner(System.in);

    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws Throwable {

        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Time elapsed in milliseconds: " + elapsedTime);
    }

}