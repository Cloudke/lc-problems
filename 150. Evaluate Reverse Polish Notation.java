class Solution {
    public int evalRPN(String[] tokens) {
           Stack<String> s = new Stack<>();
        
           for(int i = 0 ; i < tokens.length;i++){ 
               if(Character.isDigit(tokens[i].charAt(0))||tokens[i].length()>1){                   
                   s.push(tokens[i]);
                   continue;
               }
                              
               int right = Integer.parseInt(s.pop());
               int left = Integer.parseInt(s.pop());
               if(tokens[i].equals("+")){
                    int n = left+right;
                    s.push(n+"");
                    
               }
               else if(tokens[i].equals("-")){
                    int n = left-right;
                    s.push(n+"");                   
               }
               else if(tokens[i].equals("*")){
                    int n = left*right;
                    s.push(n+"");                   
               }
               else {
                    int n = left/right;
                    s.push(n+"");                   
               }               
           }
        return Integer.parseInt(s.pop());
    }
}
