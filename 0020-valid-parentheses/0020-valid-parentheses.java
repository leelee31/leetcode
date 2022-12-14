class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i=0, len=s.length(); i<len; i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && (c == ')' || c == '}' || c == ']')) {
                char d = stack.peek();
                if ((d == '(' && c == ')') || (d == '{' && c == '}') || (d == '[' && c == ']')) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        
        return stack.isEmpty();
    }
}