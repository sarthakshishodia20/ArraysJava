class Solution {
    public String smallestSubsequence(String s) {
        // Same as LeetCode 316 
         HashMap<Character, Integer> map = new HashMap<>();         
        for (int i = 0; i < s.length(); i++) {             
            char ch = s.charAt(i);             
            map.put(ch, i);         
        }         
        Stack<Character> S = new Stack<>();         
        boolean[] visited = new boolean[26];         
        for (int i = 0; i < s.length(); i++) {             
            char curr = s.charAt(i);             
            if (visited[curr - 'a']) {                 
                continue;             
            }             
            while (S.size() > 0 && curr<S.peek() && i < map.get(S.peek())) {                 
                visited[S.peek() - 'a'] = false;                 
                S.pop();             
            }             
            visited[curr - 'a'] = true;             
            S.push(curr);         
        }         
        StringBuilder sb = new StringBuilder();         
        while (!S.isEmpty()) {             
            sb.append(S.pop());         
        }         
        return sb.reverse().toString();   
    }
}
