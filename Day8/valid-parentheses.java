class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' ||c == '{' || c== '[') stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char ch = stack.peek();
                if(c == ')' && ch =='(') stack.pop();
                else if (c == '}' && ch == '{') stack.pop();
                else if (c == ']' && ch == '[') stack.pop();
                else return false;
            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }
}