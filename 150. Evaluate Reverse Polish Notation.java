class Solution {
    public int evalRPN(String[] tokens) {
           Stack<String> s = new Stack<>();
        
           for(int i = 0 ; i < tokens.length;i++){ 
               if(Character.isDigit(tokens[i].charAt(0))||tokens[i].length()>1){      //check if it's digit             
                   s.push(tokens[i]);                                                 //push digit to stack 
                   continue;
               }
                              
               int right = Integer.parseInt(s.pop());                                 //if it's a sign,pop top 2 digits
               int left = Integer.parseInt(s.pop());
               if(tokens[i].equals("+")){                                             //check the sign and do respond calculate
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
