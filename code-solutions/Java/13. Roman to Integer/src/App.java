public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    }

    public static int eleToInt(char s){
        if(s == 'I'){
            return 1;
        }
        else if(s == 'V'){
            return 5;
        }
        else if(s == 'X'){
            return 10;
        }
        else if(s == 'L'){
            return 50;
        }
        else if(s == 'C'){
            return 100;
        }
        else if(s == 'D'){
            return 500;
        }
        else{
            return 1000;
        }


    }


    public static int romanToInt(String s){
        int total = 0;
        int curVal = 0;
        int nextVal = 0;
        int tempVal = 0;
        

                
        for(int i = 0; i<s.length(); i++){
            if(i < s.length()-1){
                curVal = eleToInt(s.charAt(i));
                nextVal = eleToInt(s.charAt(i+1));
            }
            else{
                total += eleToInt(s.charAt(i));
                // reset curVal nextVal values as it still compares the two and adds it onto the end, made VI 11, XI 21, XXI 31 and so on
                curVal = 0;
                nextVal = 0;
                total += tempVal;
            }

            if(curVal == nextVal){
                tempVal += curVal;
            }
            else if(curVal < nextVal){
                 tempVal -= curVal;
            }
            else if(curVal > nextVal){
                tempVal += curVal;
                total += tempVal;
                tempVal = 0;
            }
            
            
            
        } 
        
       // total += tempVal;

        /* 
        for(int i = 1; i < s.length(); i++){
            curVal = eleToInt(s.charAt(0));
            
            if(i == s.length()-1){
                //total = curVal;
                total += tempVal;
            }   
            else{
                nextVal = eleToInt(s.charAt(i+1));
            }

            if(curVal == nextVal){
                tempVal += curVal;
            }
            else if(curVal <= nextVal){
                tempVal -= curVal;
                System.out.println("AAAAH" + tempVal);
                tempVal += nextVal;
                System.out.println("AAAAH" + tempVal);
            }
            else if(curVal > nextVal){
                tempVal += curVal;
                System.out.println("AAAAH" + tempVal);
                total += tempVal;
                System.out.println("AAAAH" + tempVal);
                tempVal = 0;
            }

            /*else if(curVal < eleToInt(s.charAt(i+1))){
                total -= curVal;
            }
            else if (curVal == eleToInt(s.charAt(i+1))){
                tempVal += curVal;
            }
            else if(curVal >= eleToInt(s.charAt(i+1))){
                total += curVal;
            }*/

        return total;
        
        // I = 1
        // V = 5
        // X = 10
        // L = 50
        // C = 100
        // D = 500
        // M = 1000
        // If a smaller number appears than the next one, then it subtracts from it
        // If 
    }
}
