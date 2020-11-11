import java.util.Arrays;
class Solution {
    public String solution(String s) {
        char[] crr = s.toCharArray();
        Arrays.sort(crr);
        return new StringBuilder(new String(crr)).reverse().toString();
    }
}
