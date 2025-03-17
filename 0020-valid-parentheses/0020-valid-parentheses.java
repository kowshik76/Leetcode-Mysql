class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (st.isEmpty()) {
                st.push(val);
            } else if (val == '(' || val == '{' || val == '[') {
                st.push(val);
            } else if(st.peek()=='(' && val ==')' ||st.peek()=='{' && val =='}' || st.peek()=='[' && val ==']' ) {
                st.pop();
            } else{
                return false;
            }

        }
        return st.size()==0 ? true : false;
    }
}