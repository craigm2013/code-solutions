package LongestSubstring;

/**
 * main
 */
public class main {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    
    static public int lengthOfLongestSubstring(String s) {

        if(s.equals(" ")){
            return 1;
        }
        String longWord = "";
        String currentWord = "";
        if(s.length() != 0){
            longWord = "" + s.charAt(0);
        }
        for(int i = 0; i < s.length(); i++){
            currentWord = "" + s.charAt(i);
            for(int j = i+1; j<s.length();j++){
                if(currentWord.indexOf(s.charAt(j)) == -1){
                    currentWord = currentWord + s.charAt(j);
                }
                else{
                    j = s.length();
                }
                if(currentWord.length()>longWord.length()){
                    longWord = currentWord;
                }
            }
        }
        System.out.println(longWord);
        return longWord.length();
    }
}