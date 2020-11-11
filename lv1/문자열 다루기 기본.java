import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char a;
        if(s.length()==4||s.length()==6){
            answer = true;
}else{
            answer = false;
}
           
    for(int i=0; i<s.length(); i++){
        a = s.charAt(i);
        if(Character.isDigit(a)==false){
            answer = false;
        }
    }
        return answer;
    }
}
