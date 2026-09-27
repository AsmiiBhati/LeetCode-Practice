class Solution {
    public String reverseParentheses(String s) {
        char[] array = s.toCharArray();
        int n = array.length;
        int[] indexes = new int[array.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i<n;i++)
        {
            if(array[i] == '(')
            {
                stack.push(i);
            }
            else if(array[i] == ')')
            {
                int open = stack.pop();
                indexes[open] = i;
                indexes[i] = open;
            }
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        int direction = 1;
        while(i<n && i>=0)
        {
            if(array[i] == '(' || array[i] == ')')
            {
                i = indexes[i];
                direction = -direction;
            }
            else
            {
                result.append(array[i]);
            }
            i+= direction;
        }
        return result.toString();
    }
}