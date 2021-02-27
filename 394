class Solution {
    public String decodeString(String s) {
           String t = s;
           int left = 0; //left index of most inner left Square Brackets
           int right = 0;  //index of most inner right Square Brackets
           int n = -1; //times of appending most inner string,if n no change(n = -1 ) meanings 1,append once;
                        
           while(t.contains("[")){
                 for(int i = 0 ; i<t.length();i++){
                     if(t.charAt(i) == '['){
                        left = i; 
                     }
                 }               
                 for(int j = left ; j<t.length();j++){
                     if(t.charAt(j) == ']'){
                        right = j; 
                        break;
                     }
                 }  
                 for(int k = left-1 ; k>=0;k--){
                     if(Character.isDigit(t.charAt(k))){
                        n = k;
                     }
                     else break;
                 }
               StringBuilder sb = new StringBuilder();
               sb.append(t.substring(0,n));
               int count = Integer.parseInt(t.substring(n,left));
               if(n<0){
                  count = 1; 
               }
                
               for(int q = 0 ;q<count;q++){
                   sb.append(t.substring(left+1,right));
               }
               
               sb.append(t.substring(right+1,t.length()));
               t = sb.toString(); //reset new appended swtring and index
               left = 0;
               right = 0;
               n = -1;
           }
        return t;
    }
}
