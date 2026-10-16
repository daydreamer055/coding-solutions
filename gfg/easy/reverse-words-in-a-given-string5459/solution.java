class Solution {
    public String reverseWords(String s) {
        // Code here
        Stack<String> st = new Stack<>();
        String[] words = s.split("\\.");
        for(String word:words){
            if(!word.isEmpty()){
                st.push(word);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
          sb.append(st.pop());
          if(!st.isEmpty()){
              sb.append(".");
          }
        }
        return sb.toString();
    }
}
